/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab5
 * Instructor: Monisha Verma
 */
package Lab5;

import java.io.File;
import java.util.Scanner;

public class TestLincoln 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int count = 0;
		
		//create a file instance
		File file = new java.io.File("Lincoln.txt");
		
		//scanner for file access
		Scanner input = new Scanner(file);
		
		while (input.hasNext())
		{
			//read text if theres a letter it counts, anything else is nope
			if (Character.isLetter((input.next()).charAt(0)))
			{
				count++;
			}
		}
		
		input.close();
			
		System.out.println("Number of words is: " + count);
			
	}
		
		
		
	

}
