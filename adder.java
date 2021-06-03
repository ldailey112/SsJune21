//Take multiple values from the command line and show the result of adding all of them.

import java.util.Scanner;
import java.util.ArrayList;
public class adder
{

   public static void main( String args[] )
   {
      int x = 0;
      int y = 0;
      int sum = 0;
            
      //creating array list as a string
      ArrayList<String> arrli = new ArrayList<String>();
      
      //try catch to find end of arguments
      try
      {
         //add arguments to arraylist
         while(y==0)
         {
            arrli.add(args[x]);
            x++;
         }
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         y=1;
      }
      
      //changing arraylist to integers
      ArrayList<Integer> intArr = new ArrayList<Integer>();
      
      //try catch to ignore any strings
      for(String myInt : arrli)
      {
         try
         {
            intArr.add(Integer.parseInt(myInt));
         }
         
         catch(NumberFormatException nfe)
         {
            
         }
         
         
      }
      //addition of all integers
      for(int i = 0; i < intArr.size(); i++)
      {
         sum += intArr.get(i);
      }
      
      System.out.println("The sum is " + sum);
     
   }
   
   
}

