//Write a Java program to get a list of all file/directory names (including in subdirectories) under a given directory.

import java.io.File;
  
public class FileDirect 
{
     static void RecursivePrint(File[] arr,int index,int level) 
     {
         // terminate end of array
         if(index == arr.length)
             return;
           
         // tab internal levels
         for (int i = 0; i < level; i++)
             System.out.print("\t");
           
         // files
         if(arr[index].isFile())
             System.out.println(arr[index].getName());
           
         // sub-directories
         else if(arr[index].isDirectory())
         {
             System.out.println("[" + arr[index].getName() + "]");
               
             // recursion
             RecursivePrint(arr[index].listFiles(), 0, level + 1);
         }
            
         // recursion main
         RecursivePrint(arr,++index, level);
    }
      
    
    public static void main(String[] args)
    { 
        String maindirpath = "C:\\Users\\ldail\\OneDrive\\Documents";
                  
        File maindir = new File(maindirpath);
           
        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories 
            File arr[] = maindir.listFiles();
              
            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("**********************************************");
              
            // Calling method
            RecursivePrint(arr,0,0); 
       } 
    }
}