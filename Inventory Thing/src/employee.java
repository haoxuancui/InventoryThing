import java.util.*;
import java.io.*;
import java.text.*;
public class employee
	{
		static ArrayList<Game> stock = new ArrayList<Game>();// stock
		private static int userChoice;
		private static boolean keepAsking=true;
		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
		{
				System.out.println("What do you want to do?");
				System.out.println("1. Buy Stock");
				System.out.println("2. Exit the website");
				while(keepAsking) 
					{
						Scanner userInput = new Scanner(System.in);
						userChoice = userInput.nextInt();
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
			PrintWriter writer = new PrintWriter("Inventory.txt", "UTF-8");
			writer.newLine();
			writer.close();
		}

	}
