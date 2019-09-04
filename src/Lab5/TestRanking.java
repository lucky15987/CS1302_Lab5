/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab5
 * Instructor: Monisha Verma
 */
package Lab5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestRanking 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//ArrayList for line, boys, and girl
		ArrayList<String> boys = new ArrayList<>();
		ArrayList<String> girls = new ArrayList<>();
		ArrayList<String> line = new ArrayList<>();
		
		//store the text files
		print();
		
		for (int year = 2010; year >= 2001; year--)
		{
			try
			{
			//create file instance
			File file = new java.io.File("Babynamesranking" + year + ".txt");
			
			//Scanner for file access
			Scanner input = new Scanner(file);
			
			for(int i = 0; i < 5 && input.hasNext(); i++)
			{
				readtxt(input, line);
				boys.add(line.get(1));
				girls.add(line.get(3));
			}
			
			}
			catch (IOException ex)
			{
				System.out.println("File does not exist bro!!!");
			}
			
			//display year, girls, boys output
			print(year, boys, girls);
			
			//clears all arrayLists
			boys.clear();
			girls.clear();
			
			
		}

	}

	//method for printing out year, girls, boys tables
	private static void print(int year, ArrayList<String> boys, ArrayList<String> girls) 
	{
		// TODO Auto-generated method stub
		System.out.printf("%5d   ", year);
		for (int i = 0; i < 5; i++)
		{
			System.out.print(girls.get(i));
			print(girls.get(i));
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.print(boys.get(i));
			print(boys.get(i));
		}
		System.out.println();
	}

	//method for adding spaces between data in the table
	private static void print(String string) 
	{
		// TODO Auto-generated method stub
		int space = 10 - string.length();
		for (int i = 0; i < space; i++)
		{
			System.out.print(" ");
		}
	}
	//method for adding text to the ArrayList
	private static void readtxt(Scanner input, ArrayList<String> line) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			line.add(i, input.next());
		}
	}
	
	//method for printing the header for table
	private static void print() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------------------------------------------------------------------------------------\n" +
		"Year    Rank 1    Rank 2    Rank 3    Rank 4    Rank 5    " + 
		"Rank 1    Rank 2    Rank 3    Rank 4    Rank 5\n" +
		"---------------------------------------------------------------------------------------------------------\n");
	}

}
