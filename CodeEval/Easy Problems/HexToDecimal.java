import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HexToDecimal 
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
				System.out.println(toDecimal(line));
			}
			reader.close();
		}
	}

	private static int toDecimal(String str)
	{
		int dec;
		dec = 0;
		for(int i = 0; i < str.length(); i++)
		{
			int val = 0;
			if(Character.isDigit(str.charAt(i))) //0-9
			{
				val += Integer.parseInt(str.substring(i,i+1));
			}
			else //a-f
			{
				val = str.charAt(i) - 'a' + 10;
			}
			//Now multiply by its place.
			dec += val * Math.pow(16, str.length() - 1 -  i);
		}
		return dec;
	}
}
