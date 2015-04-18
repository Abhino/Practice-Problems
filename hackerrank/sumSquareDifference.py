'''
Problem:https://www.hackerrank.com/contests/projecteuler/challenges/euler006
'''
def diffSeries(b):
    n = int(b)
    sum2 = (n*(n+1))/2
    sum2 = sum2*sum2
    sum3 = (n*(n+1)*(2*n+1))/6     
    diff = sum2 - sum3
    return diff

if __name__ == '__main__':
    t = raw_input()
    for x in xrange(0,int(t)):
        n = int(raw_input())
        diff = diffSeries(n)
        print diff

