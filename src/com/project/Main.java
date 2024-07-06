package com.project;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length for array : ");
		int arrLimit = scanner.nextInt();
		
		int arr[] = new int[arrLimit];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<arrLimit; i++) arr[i] = scanner.nextInt();
		
		scanner.close();
		
		bubbleSort(arr, arrLimit);
		

		System.out.println("Sorted array : ");
		
		for(int i=0; i<arrLimit; i++) System.out.print(arr[i]+"\t");
	}

	private static void bubbleSort(int[] arr, int arrLimit) 
	{
		//bubble sorting
		for(int i=0; i<arrLimit; i++)
		{
			for(int j=0; j<arrLimit-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
	}

}
