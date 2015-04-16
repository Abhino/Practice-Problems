'''
Problem: https://www.hackerrank.com/contests/projecteuler/challenges/euler002
'''
def generateFibo():
	series = [1,2]
	for x in xrange(2,100000):
		elem = series[x-2]+series[x-1]
		series.append(elem)
	return series

if __name__ == '__main__':
	series = generateFibo()
	t = raw_input()
	for x in xrange(0,int(t)):
		nn = raw_input()
		n = int(nn)
		sums = 0
		i = 1;
		while series[i]<n:
			sums = sums+series[i]
			i+=3;
		print sums
