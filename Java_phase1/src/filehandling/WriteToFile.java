package filehandling;

import java.io.FileWriter; 
import java.io.IOException;  

public class WriteToFile {
	public static void main(String[] args) {  
	      
	    try {  
	        FileWriter fwrite = new FileWriter("C:FileOperationExample.txt");  
	        // writing the content into the FileOperationExample.txt file  
	        fwrite.write("Hi! This is Sahith and This is My File.");   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Matter is successfully written to the file.");  
	    	} 
	    catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	    }  
	}  

