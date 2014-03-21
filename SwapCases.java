import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SwapCases 
{
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
			while(reader.hasNextLine())
			{
				line = reader.nextLine();
				System.out.println(swapCases(line));
			}
			reader.close();
		}
	}

	private static String swapCases(String str)
	{
		String cases;
		char c;
		cases = "";
		for(int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if(Character.isLetter(c))
			{
				if(Character.isUpperCase(c))
				{
					c = Character.toLowerCase(c);
				}
				else
				{
					c = Character.toUpperCase(c);
				}
			}
			cases += c;
		}
		return cases;
	}
}
