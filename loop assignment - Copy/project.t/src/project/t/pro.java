package project.t;

import java.util.Scanner;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int phoneCode= 2560;
     
     System.out.println("please enter your secret code.");
     phoneCode  = input.nextInt();
     if (phoneCode != 2560 ) {
    	System.out.println(	"invalid secret code");	 
	}else {
		  System.out.println("Successful");}
	}

     
}
