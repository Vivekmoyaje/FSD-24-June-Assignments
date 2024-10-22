package com.hospital;

import java.util.Scanner;

public class Doctor extends General{
	
	void check() {
		
		System.out.print("ENTER PATIENT NAME : ");
		Scanner sc1 = new Scanner(System.in);
		sc1.nextLine();
		
		System.out.print("ENTER YOUR SEX : ");
		Scanner sc3 = new Scanner(System.in);
		sc3.next();
		
		System.out.print("ENTER PATIENT AGE");
		Scanner sc2 = new Scanner(System.in);
		sc2.nextInt();
		
		System.out.println("THANK YOU FOR ENTERING YOUR DETAILS");

		}
	
	//   class Patient{
	//   void timeanddate(){
	//   }
	//   }

}
