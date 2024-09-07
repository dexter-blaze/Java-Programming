import java.util.*; 

class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		long[] result = new long[21];
		result[0] = 1;
		int last = 0;
		if(x >= result.length)
			throw new IllegalArgumentException("Result will overflow.");	
		else if(x < 0)
			throw new IllegalArgumentException("Value of x muxt be positive.");
		while(last < x)
		{
			result[last + 1] = result[last] * (last + 1);
			last++;
		}
		System.out.println("Factorial of " + x + " is " + result[x]);
	}
}