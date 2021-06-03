//Write a Java program to append text to an existing file.

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFile
 {
   public static void main( String[] args ) 
   {
      //Try catch for if file exists
      try 
      {
         //Add this to file
         String data = " This is some data";
         File f1 = new File("C:\\Users\\ldail\\OneDrive\\Documents\\Part 3 Assignment2");
         
         //create file if there isnt one
         if(!f1.exists()) 
         {
            f1.createNewFile();
         }
         
         //appending to file
         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } 
      
      catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}