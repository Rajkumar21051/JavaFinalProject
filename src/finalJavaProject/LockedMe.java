package finalJavaProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	static final String directory="E:\\Raj\\Courses\\Project Files";
	public static void Menu(){
		System.out.println("***************************************************************");
		System.out.println("                      Welcome to LockedMe.com                   ");
		System.out.println("                       Developed by Raj Kumar                   ");
		System.out.println("===============================================================");
		System.out.println("                            Our Menu                           ");
		System.out.println("===============================================================\n");
		System.out.println("                         1.Get all Files                        ");
		System.out.println("                         2.Add a file                           ");
		System.out.println("                         3.Delete a file                        ");
		System.out.println("                         4.Search a file                        ");
		System.out.println("                         5.Exit                                 \n");
		System.out.println("****************************************************************\n");
	}
	/**
	 * This is the method to Retrieving the file names in an ascending order
	 */
	public static void getfiles() 
	{
		File location = new File(directory);
		File[] ExistingFiles=location.listFiles();
		for(var E : ExistingFiles) {
			System.out.println(E.getName());
		}
	}
	/**
	 * This is the method to to add a user specified file to the application
	 * @throws IOException 
	 */
	public static void addfiles() throws IOException 
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your file name");
			String Filename= s.nextLine();
			System.out.println("Enter number of lines you want to add to the "+Filename);
			int n = Integer.parseInt(s.nextLine());
			FileWriter fw = new FileWriter(directory+"//"+Filename);
		
			for(int i=1;i<=n;i++) 
			{
			System.out.println("Enter Your Text");
			fw.write(s.nextLine()+"\n");
			}
			System.out.println("The File was Sucessfully Created");
			fw.close();
			
		}
		catch(Exception ex) {
			System.out.println("Unable to add the file.Please Contact Customer Service");
		}
		
	}
	
	/**
	 * This is the method to add all files into the Array List and used to delete and search file by using Case Sensitivity
	 */
	
	public static boolean allfiles(String Filename)
	{
		ArrayList<String> addallfiles	= new ArrayList<String>();
		File location = new File(directory);
		File[] ExistingFiles=location.listFiles();
		for(var E : ExistingFiles) {
			addallfiles.add(E.getName());
		}
		return addallfiles.contains(Filename);
	}
	
	/**
	 * This is the method to delete a user specified file from the application
	 */
	
	public static void deletefiles() 
	{
		
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your file name you want to Delete");
			String Filename= s.nextLine();
			File myfile = new File(directory+"\\"+Filename);
			if (allfiles(Filename)) 
			{
				myfile.delete();
				System.out.println("File was Sucessfully Deleted");
			}
			else 
			{
			System.out.println("File was not found");
			}
			
		}
		catch(Exception Ex) {
			System.out.println("Unable to delete the file.Please Contact Customer Service");
		}
		
	}
	
	/**
	 * This is the method to search a user specified file from the application
	 */
	
	public static void searchfiles() 
	{
		
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your file name you want to Search");
			String Filename= s.nextLine();
			if (allfiles(Filename)) 
			{
		
				System.out.println("File was found in this directory");
			}
			else 
			{
			System.out.println("File was not found in this directory");
			}
			
		}
			catch(Exception Ex) 
		{
			System.out.println("Unable to search the file.Please Contact Customer Service");
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
