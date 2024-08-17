package ArayConcepts;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		int a[]= {10,2,3,4};
		int b[]= {5,2,3,4};
		
		int c[]= {5,6,7,8};
		int d[]= {5,6,7,8};

		boolean flag= Arrays.equals(a, b);
		boolean flag1= Arrays.equals(c, d);
		
		System.out.println("2 Arrays a & b are equal= "+flag);
		System.out.println("2 Arrays c & d are equal= "+flag1);
		Arrays.asList(c);
		
		int x1= Arrays.compare(a, b);
		int x2= Arrays.compare(c, d);
		System.out.println(x1);    //if 2 Arrays are not equal then we get -1 or +1 in output
		System.out.println(x2);    //if 2 Arrays are equal then we get 0 in output
	
	
	
	}

}
