'''
Problem:https://www.hackerrank.com/contests/projecteuler/challenges/euler013
'''
def firstTenDigits(sums):
	lists = list(str(sums))
	output = lists[:10]
	str1 = ''.join(output)
	print str1

if __name__ == '__main__':
	t = int(raw_input())
	sums = long("0")
	for x in xrange(0,t):
		n = long(raw_input())
		sums = sums + n
	firstTenDigits(sums)
