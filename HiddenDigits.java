import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HiddenDigits 
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
				System.out.println(findDigits(line));
			}
			reader.close();
		}
	}

	private static String findDigits(String str)
	{
		String answer = "NONE";
		boolean hasFound = false;
		for(int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'j'))
			{
				if(!hasFound)
				{
					answer = "";
					hasFound = true;
				}
				answer += str.charAt(i) - 'a';
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				if(!hasFound)
				{
					answer = "";
					hasFound = true;
				}
				answer+= str.charAt(i);
			}
		}
		
		return answer;		
	}
}
