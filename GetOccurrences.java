//Write a Java program that counts the number of times a particular character, 
//such as 'e', appears in a file. The character can be 
//specified at the command line.

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class GetOccurrences
{
    public static void main(String args[])
    {
      //try catch for if file exists
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\ldail\\OneDrive\\Documents\\Part3Assign3\\DataFile.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            
            //counts how many instances of search exist        
            int i;
            int occurs=0;
            
            while((i=bis.read())!=-1)
            {
                char a=(char)i;
                
                if(a==args[0].charAt(0))
                {
                 occurs++;
                }
            }
            System.out.println("Occurs "+occurs+" times in the file");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}