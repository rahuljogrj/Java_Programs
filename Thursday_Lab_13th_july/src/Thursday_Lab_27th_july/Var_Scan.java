package Thursday_Lab_27th_july;

import java.util.Scanner;

public class Var_Scan {

	
	Scanner sc = new Scanner(System.in);
	
	 int i, j, grt, smt, size;
	 int num, num1, num2, temp, newnum, reverse=0;
	 char char1;
	 int[] arr;

	
//	accept array elements from user 
	public int[] accept() {

		// add values in array using user input
		System.out.println("Enter the range of your array: ");
		input_array_size();
		arr = new int[size];
		System.out.println("Enter "+size+" values in array: ");
		for(i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;	
	}
	

	
	
	// condition to find ascending and descending order of array
	public void Array_ascen_descen() {
		temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
	
	
	
	// Print Array one by one
	public void Print_array() {
		for(i=0; i<arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
	}
	
	
	
	// return Integer value from user
	public int input_array_size() {
		size = sc.nextInt();
		return size;
	}
	
	
	// return Integer value from user
	public int input_num1() {
		num1 = sc.nextInt();
		return num1;
	}
	
	
	// return Integer value from user
	public int input_num2() {
		num2 = sc.nextInt();
		return num2;
	}
	
	
	// return character  from user
	public char input_char_1() {
		char1 = sc.next().charAt(0);
		return char1;
	}
}
