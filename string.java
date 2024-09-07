import java.util.*;
class StringMethods
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int count_upp = 0;
		int count_low = 0;
		int count_space = 0;
		int count_digit = 0;
		for(int i = 0 ; i<n ; i++)
		{
			int a = s.charAt(i);
			if(a>=65 && a<=90)
			{
				count_upp++;
			}
			else if(a>=97 && a<=122)
			{
				count_low++;
			}
			else if(s.charAt(i) == ' ')
			{
				count_space++;
			}
			else
			{
				count_digit++;
			}
		}
		System.out.println("uppercase - " + count_upp);
		System.out.println("lowercase - " + count_low);
		System.out.println("no. of spaces - " + count_space);
		System.out.println("count of digits - " + count_digit);
	}

}