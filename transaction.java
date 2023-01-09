package com.project.lab2;

import java.util.Scanner;
public class transaction {
	static int count =0;
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter the size of transaction Array::");
		int Size = scanner.nextInt();
		 int arr[]=new int [Size] ;
		 System.out.println("ENTER THE VALUES OF ARRAY::");
		 for (int i =0;i<Size; i++) {
		     arr[i]=scanner.nextInt();
		 }
	     System.out.println("ENTER TOTAL NO. OF TARGET THAT NEED TOBE ACHIEVED::");
	     int targetNo=scanner.nextInt();
	     while(targetNo--!=0) {
	    	 int flag=0;
	    	 long target;
	    	 System.out.println("ENTER THE TOTAL NO OF TARGET TO ACHEIVED");
	    	 target = scanner.nextInt();
	    	 long sum=0;
	    	 for(int i=0;i<Size;i++) {
	    		 sum+= arr[i];
	    		 if(sum>=target) {
	    			 System.out.println("TARGET ACHIEVED AFTER " +( i+1 )+  " TRANSACTION");
	    			 flag=1;
	    			 break;
	    			 
	    		 }
	    	 }
	    	 if (flag ==0) {
	    		 System.out.println("GIVEN TARGET IS NOT ACHIEVEF");
	    	 }
	     }
	     
		
		

	}

}
