import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ShortestRepetition 
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
				System.out.println(findShortestRep(line));
			}
			reader.close();
		}
	}

	private static int findShortestRep(String str)
	{
		int answer = str.length();
		String rep = "";
		int i = 0;
		while(i < str.length())
		{
			String temp = str.substring(0, i);
			if(countOccurrences(str, temp) * temp.length() == str.length()) //then we have a periodic string
			{
				//so take the smallest rep
				if(answer > i)
				{
					answer = i;
				}
			}
			i++;
		}
		
		return answer;		
	}
	
	public static int countOccurrences(String str, String sub)
	{
		//Remove occurrences and then check the new lengths.
		//Neat solution found on StackOverflow.
		if(sub.length() > 0)
		{
			return (str.length() - str.replace(sub, "").length()) / sub.length();
		}
		
		return 0;
	}
}
