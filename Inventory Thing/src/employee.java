import java.util.*;
import java.io.*;
import java.text.*;
public class employee
	{
		static ArrayList<Game> stock = new ArrayList<Game>();// stock
		private static int userChoice;
		private static int password;
		private static boolean keepAsking=true;
		public static void main(String[] args) 
		{
			
		}
		public static void meetTHeUsers()throws FileNotFoundException, UnsupportedEncodingException
		{
			
				Scanner userInput = new Scanner(System.in);
				password=userInput.nextInt();
				if(password==1234568)
					{
						
					}
				System.out.println("What do you want to do?");
				System.out.println("1. Buy Stock");
				System.out.println("2. Exit the website");
				while(keepAsking) 
					{
						
						Scanner userInput1 = new Scanner(System.in);
						userChoice = userInput1.nextInt();
						if(userChoice==1)
							{
								buyStock();
								break;
							}
						else if(userChoice==2)
							{
								System.out.println("Bye bye!!!");
								break;
							}
						else
							{
								System.out.println("Try it again");
							}
					}
				
				
		}
		private static void buyStock() throws FileNotFoundException, UnsupportedEncodingException
		{
			System.out.println("Here is our stuff.");
			System.out.println();	//print out all the stuff we have and buyer's bottom line
			System.out.println("What stock do you want to buy?");
			
			
			try 
				{ 
					PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Inventory.txt", true)));
					out.println("");
					out.println("the text");
					out.close();
				}
		  catch (IOException e) 
				{  
					println(e);
				}
				}
		private static void println(IOException e)
			{
				System.out.println("oops,there is a mistake.");
			}

	}
