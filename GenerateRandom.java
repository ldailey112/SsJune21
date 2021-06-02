/*
User is asked to guess a number 1-100. (Program chooses randomly.)
If the guess is within 10 of the correct answer, plus or minus, output the correct answer and exit. (If the answer is 63, user must guess 53-73.)
If the number is not within 10 of the correct answer, ask the user to keep guessing.
If the user does not succeed within 5 attempts, display, "Sorry," along with the answer and exit.
*/

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

class GenerateRandom 
{
    public static void main( String args[] ) 
    {
      int x = 1;
      
      
      Random rand = new Random(); //instance of random class
      int upperbound = 100;
        //generate random values from 0-100
      int int_random = rand.nextInt(upperbound); 
      double double_random=rand.nextDouble();
      float float_random=rand.nextFloat();
      
      
      while (x<=5) //continue and exit at x>5
      {
      //take user input
      Scanner key = new Scanner(System.in);
      System.out.println("Choose a number between 1 and 100.");
      
      //read user input
      int choice = key.nextInt();
      
      //adjust user input to + or - 10
      int adjustedUp = int_random + 10;
      int adjustedDown = int_random - 10;
      
      //check if user input is within the bounds of correctness
      if (choice < 0 || choice > 100)
      {
         System.out.println("That is not a valid number");
         continue;
      }
      else if(choice <= adjustedUp && choice >= adjustedDown)
      {
         System.out.println("Close! It was " + int_random);
         System.exit(0);
      } 
      else if(x==5)
      {
         System.out.println("The anser was " + int_random +" Sorry.");

      }
      else
         System.out.println("That is incorrect, Try again.");
         x++; //increment for while loop
      }
      
     }
      
}
