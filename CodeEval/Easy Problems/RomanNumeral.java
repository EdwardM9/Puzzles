import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RomanNumeral 
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
				System.out.println(toRoman(line));
			}
			reader.close();
		}
	}

	private static String toRoman(String str)
	{
		String answer = "";
		int[] v = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] n = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int value = Integer.parseInt(str);
		for(int i = 0; i < v.length; i++)
		{
			while(value >= v[i])
			{
				value -= v[i];
				answer+= n[i];
			}
		}
		
		return answer;		
	}
}
