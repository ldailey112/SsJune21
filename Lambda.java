package com.ss.jb.A1L;

interface PerformOperation 
{
	boolean check(int a);
}

class Lambda 
{
	public static boolean checker(PerformOperation p, int num) 
	{
		return p.check(num);
	}

	// check if a number is odd
	public PerformOperation isOdd() 
	{

		return (num) -> {
			if (num % 2 != 0)
				return true;
			else
				return false;
		};

		
	}

	//check is number is a palindrome
	public PerformOperation isPalindrome() 
	{

		
		return (num) -> {
			String s = String.valueOf(num);
			String r = (new StringBuffer(s).reverse()).toString();
			return s.equals(r);
		};

	}

	public PerformOperation isPrime() 
	{

		return (num) -> {
			boolean flag = true;

			if (num <= 1)
				flag = false;
			else 
			{
				int sr = (int) Math.sqrt(num);

				for (int i = 2; i <= sr && flag; i++) 
				{

					for (int j = i * i; j <= num; j += i) 
					{
						if (j == num) 
						{
							flag = false;
							break;
						}
					}

				}

			}

			return flag;
		};

	}
}
