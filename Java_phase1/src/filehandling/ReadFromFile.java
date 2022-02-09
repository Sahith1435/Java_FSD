package filehandling;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;   

public class ReadFromFile {
	public static void main(String[] args) {
		 try {  
	            // Create fn object of the file to read data  
	            File fn = new File("C:FileOperationExample.txt");    
	            Scanner dataReader = new Scanner(fn);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                System.out.println(fileData);  
	            }  
	            dataReader.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexcpected error occurred!");  
	            exception.printStackTrace();  
	        }  
	    }  


}
