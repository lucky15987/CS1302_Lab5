/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab5
 * Instructor: Monisha Verma
 */
package Lab5;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBabyNames 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//ask user for inputs
		System.out.println("Enter the year (20XX): ");
		String year = input.nextLine();
		
		System.out.println("Enter the gender (M/F): ");
		String gender = input.nextLine();
		
		System.out.println("Enter the name (Capital letter first): ");
		String name = input.nextLine();
		
		//An arrayList to hold names
		ArrayList<String> list = new ArrayList<>();
		input.close();
		try
		{
			//create a file instance to access .txt files with specific year
			File file = new java.io.File("Babynamesranking" + year + ".txt");
			
			//access the files
			input = new Scanner(file);
			
			while (input.hasNext()) 
			{
				for (int i = 0; i < 5; i++)
				{
					list.add(i, input.next());
				}
				
				//display the output
				if (list.get(gender(gender)).equals(name))
				{
					System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
					
				}
				
				/* else
				{
					System.out.println("The name " + name + " is not ranked in year " + year);
					System.exit(0);
				}
				*/
				list.clear();
												
			}
			
		}
		catch (java.io.IOException ex)
		{
			System.out.println("File name does not exist bro!!");
		}
		
		
		
	}

	//method that distingushes M(male) or F(female) ---> and gives the index number
	private static int gender(String gender) 
	{
		// TODO Auto-generated method stub
		
		if (gender.equals("M"))
		{
			return 1;
		}
		else
		{
			return 3;
		}
	}

}
