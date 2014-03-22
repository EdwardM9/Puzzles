import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SelfDescribingNumbers 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		String num;
		if(args.length < 1) 
		{
			System.out.println("No file provided.");
			System.exit(1);
		}
		else
		{
			Scanner reader = new Scanner(new FileInputStream(args[0]));
			while(reader.hasNextLine())
			{
				num = reader.nextLine();
				System.out.println(isSelfDescribing(num));
			}
			reader.close();
		}
	}

	private static int isSelfDescribing(String num)
	{
		int occurrences;
		for(int i = 0; i < num.length(); i++)
		{
			occurrences = 0;
			for(int j = 0; j < num.length(); j++)
			{
				int value = Character.getNumericValue(num.charAt(j));
				if(value == i)
				{
					occurrences++;
				}
			}
			if(occurrences != Character.getNumericValue(num.charAt(i)))
			{
				return 0;
			}
		}
		return 1;
	}
}
