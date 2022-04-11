import java.util.*;

public class YayArrays	

{
//Q3
//Write a public static method called "toPower" that takes in as parameters two integers
//called size and power. The method should return an array of size "size" with each
//array index raised to the value of "power." So, for example, if we passed in
//"size = 4" and "power = 2" to the "toPower," the method should return the following
//result: [0,1,4,9].

	public static double[] toPower(int size, int power)	{	
		double[] Q3Array = new double[size];
		
		for (int i = 0; i < Q3Array.length; i++) {
			
			Q3Array[i] = Math.pow(i, power);
		}
		
		return(Q3Array);
	}
	
//Q1
//Write a program to sum all the values of a given Array in Java.
//define array,
//initialize sum, 
//assign variable to int, 
//itterate through elements adds to sum
//call and run code
	
		public static int arr[] = {7, 21, 14, 3, 9, 1, 82, 57, 47, 35, 94, 61, 4, 73};
	
		static int sum()
		{
			int sum = 0;
			int i;
			
			for (i = 0; i < arr.length; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
		
		public static void main(String[] args)	{
			
			
//Q2		
//What is the output of the array?	
	
			double[ ] Q2Array = {1,5,6,5,4,1};
			double maximum = Q2Array[0];
			int index2 = 0;
			for (int i = 1; i<Q2Array.length; i++)	{
	
				if (Q2Array[ i ] > maximum) {
	                maximum = Q2Array[ i ];
	                index2 = i;
	           }
	      }
	
	      
			for (double item : toPower(4, 2)) {
				System.out.println("The Q3 toPower array returns: " + item);
			}
			System.out.println("The complete sum of the expressed Q1 array is " + sum());
			System.out.println("The output for Q2 array is " + index2);
		}
	
	}