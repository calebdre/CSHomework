import java.util.Arrays;


public class ArrayPractive {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Lab 10
		
		int[] a1 = {11,42,-5,27,0,89};
		int[] a2 = {10,20,30,40,50,60};
		
		swapAll(a1, a2);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
	}
	
	public static void swapAll(int[] a1, int[] a2){
		int[] a1Clone = a1.clone();
		
		for (int i = 0; i < a2.length; i++) {
			a1Clone[i] = a1[i];
			
			a1[i] = a2[i];
			a2[i] = a1Clone[i];
		
		}	
	}
}
