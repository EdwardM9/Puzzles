import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FamousWriter 
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
				System.out.println(decode(line));
			}
			reader.close();
		}
	}

	private static String decode(String str)
	{
		//Separate key from cipher
		String[] arr = str.split("\\|");
		String key = arr[0];
		String answer = "";
		String[] cipher = arr[1].split(" ");
		int num;
		for(int i = 1; i < cipher.length; i++)
		{
			num = Integer.parseInt(cipher[i]);
			answer += key.charAt(num - 1);
		}
		
		return answer;		
	}
}
