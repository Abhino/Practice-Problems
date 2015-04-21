'''
Problem: http://www.hackerrank.com/contests/projecteuler/challenges/euler016
'''
import math

def pow2sum(exp):
    pow = list(str(2**exp))
    return sum([int(i) for i in pow])
 
if __name__ == '__main__':
	t = int(raw_input())
	for x in xrange(0,t):
		n = int(raw_input())
		result = pow2sum(n)
		print result
