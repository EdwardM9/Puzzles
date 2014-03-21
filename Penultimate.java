import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Penultimate 
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
				System.out.println(penultimateWord(line));
			}
			reader.close();
		}
	}

	private static String penultimateWord(String str)
	{
		String[] arr = str.split(" ");

		return arr[arr.length - 2];
	}
}
