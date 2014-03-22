import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class HappyNumbers 
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
				System.out.println(isHappy(line));
			}
			reader.close();
		}
	}

	private static int isHappy(String str)
	{
		int num;
		ArrayList<Integer> numbersSeen;
		num = Integer.parseInt(str);
		numbersSeen = new ArrayList<Integer>();
		while(num != 1)
		{
			int q;
			int r;
			q = num;
			r = 0;
			while(q > 0) //Loop through each digit.
			{
				r += q%10 * (q%10); //Add the squares of each digit
				q /= 10;
			}
			if(numbersSeen.contains(r)) //We have then found a loop.
			{
				return 0;
			}
			numbersSeen.add(r);
			num = r;
		}
		return num;
	}
}
