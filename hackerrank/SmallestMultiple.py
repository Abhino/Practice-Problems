'''
Problem:https://www.hackerrank.com/contests/projecteuler/challenges/euler005
'''
from fractions import gcd

def lcm(a,b):
	prod = a*b
	g = gcd(a,b)
	lcms = prod/g
	return lcms

if __name__ == '__main__':
    t = raw_input()
    for x in xrange(0,int(t)):
        n = int(raw_input())
        lcms = reduce(lcm, range(1,n+1))
        print lcms
