package firstPackage;

public class FibonacciNum
{
	public static void main(String[] args)
	{
		int term = 10;
		long n = fibo1(term);
		System.out.println("The fibonnaci number of term " + term + " is " + n);
		
		
		
	}

	// plain recursion
	// exponential run time
	public static long fibo1(long term)
	{
		if(term <= 1)
			return term;
		else
			return fibo1(term -1) + fibo1(term - 2);
	}

	// using memoization
	// linear run time
	public static long fibo2(int term)
	{
		long [] cache = new long[10000];
		if (term <= 1)
			return term;
		if (cache[term] != 0)
			return cache[term];
		else
		{
			cache[term] = fibo2(term -1) + fibo2(term -2);
		    return cache[term];
		}
		
		
	}

	// using tabulation
	// linear run time with constant space 
	public static long tabulate(long term)
	{
		if(term <= 1)
			return term;
		
		long first = 1;
		long second = 0;
		long result = 0;
		
		for(int i = 1; i < term; ++i)
		{
			result = first + second;
			second = first;
			first = result;
		}
		return result;
	}
}