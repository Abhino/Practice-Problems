'''
Problem:https://www.hackerrank.com/contests/projecteuler/challenges/euler008
'''

def maxProdCalculate(k,n,numList):
	start = 0
	end = k
	maxProd = 0
	while (end<n):
		curProd = 1
		for x in xrange(start,end):
			curProd = curProd*numList[x]
		if curProd > maxProd:
			maxProd = curProd
		start = start + 1
		end = end + 1
	print maxProd

def preProcess(num):
	strnum = list(str(num))
	lists = []
	for digit in strnum:
		lists.append (int(digit))
	return lists

if __name__ == '__main__':
	t = int(raw_input())
	for x in xrange(0,t):
	    inp = raw_input().split()
	    num = raw_input()
	    n = int(inp[0])
	    k = int(inp[1])
	    numList = preProcess(num)
	    maxProdCalculate(k,n,numList)
