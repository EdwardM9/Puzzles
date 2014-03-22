import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LongestWord 
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
				System.out.println(longestWord(line));
			}
			reader.close();
		}
	}

	private static String longestWord(String str)
	{
		String longest;
		String[] arr = str.split(" ");
		longest = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].length() > longest.length())
			{
				longest = arr[i];
			}
		}
		return longest;
	}
}
