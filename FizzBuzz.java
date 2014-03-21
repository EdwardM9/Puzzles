import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FizzBuzz 
{
	Scanner reader;

	public static void main(String args[]) throws FileNotFoundException
	{
		String line;
		if(args.length < 1) 
		{
			System.out.println("No file provided.");
			System.exit(1);
		}
		else
		{
			Scanner reader = new Scanner(new FileInputStream(args[0]));
			while(reader.hasNext())
			{
				int a = reader.nextInt();
				int b = reader.nextInt();
				int n = reader.nextInt();
				System.out.println(fizzBuzz(a,b,n));
			}
			reader.close();
		}
	}

	private static String fizzBuzz(int a, int b, int n)
	{
		String fb;
		fb = "";
		for(int i = 1; i <= n; i++)
		{
			if(i % a == 0)
			{
				if(i % b == 0)
				{
					fb += "FB ";
				}
				else
				{
					fb += "F ";
				}
			}
			else if(i % b == 0)
			{
				fb += "B ";
			}
			else
			{
				fb += i + " ";
			}
		}
		return fb;
	}
}
