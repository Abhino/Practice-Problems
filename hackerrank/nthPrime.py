'''
Problem: https://www.hackerrank.com/contests/projecteuler/challenges/euler007
'''
def primes_sieve(limit):
    limitn = limit+1
    not_prime = set()
    primes = []
    for i in range(2, limitn):
        if i in not_prime:
            continue
        for f in range(i*2, limitn, i):
            not_prime.add(f)
        primes.append(i)
    return primes

if __name__ == '__main__':
	series = primes_sieve(1000000)
	t = int(raw_input())
	for x in xrange(0,t):
		n = int(raw_input())
		print series[n-1]