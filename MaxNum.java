//Construct a 2D array and find the max number and show its position in the array.
import java.lang.Math;

class MaxNum 
{

    public static void main(String[] args)
    {
        //initialize array
        int[][] arr = new int[3][5];
        
        //insert random numbers
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
               arr[i][j] = ((int)(Math.random() * 10));
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //prints the Max number from Method
        System.out.println(getMaxValue(arr));
        
    }
    
    //Method gets the Max value
    public static int getMaxValue(int[][] numbers) 
    {
        int maxValue = numbers[0][0];
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        //finds max
        for (int j = 0; j < numbers.length; j++) 
        {
            for (int i = 0; i < numbers[j].length; i++) 
            {
                if (numbers[j][i] > maxValue) 
                {
                    maxValue = numbers[j][i];
                    //find location
                    maxIndex1 = j + 1;
                    maxIndex2 = i + 1; 
                }            
            }
        }
        //prints location and then returns max value
        System.out.println("Max Number is located in row "+ maxIndex1 +" column " + maxIndex2);
        return maxValue;
    }
    
}