package com.hospital;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class General {

	public void List() {

		try {

			Thread.sleep(2000); // Thread
			System.out.println("THE LIST OF DOCTOR WE HAVE IS : ");

			HashMap hm = new HashMap();

			hm.put(1, "NEROLOGIST");
			hm.put(2, "OPTHAMOLOGIST");
			hm.put(3, "DENTIST");
			hm.put(4, "DERMATOLOGIST");
			hm.put(5, "CARDIOLOGIST");
			hm.put(6, "GENERAL SURGEON");
			hm.put(7, "ENT");

			Set a1 = hm.entrySet();

			Iterator i = a1.iterator();

			while (i.hasNext()) {

				Thread.sleep(1000);
				System.out.println(i.next());

			}
		} catch (Exception e) {

			System.out.println("Just check the thread");

		}
	}

	synchronized void details() {
		String a = "Virat";
		String b = "Rohit";
		String c = "Jadeja";
		String d = "Dhoni";
		String e = "Ashiwin";
		String f = "Shreyash";
		String g = "Rushab";

		System.out.println("HERE IS LIST OF DOCTORS WITH THEIR DESIGNATION : ");

		try {
			Thread.sleep(1000);
			System.out.println("Nerorologist : " + a);
			Thread.sleep(1000);
			System.out.println("Othomologist : " + b);
			Thread.sleep(1000);
			System.out.println("Dentist : " + c);
			Thread.sleep(1000);
			System.out.println("Dermotologist : " + d);
			Thread.sleep(1000);
			System.out.println("Cardiologist : " + e);
			Thread.sleep(1000);
			System.out.println("General Surgeon : " + f);
			Thread.sleep(1000);
			System.out.println("ENT : " + g);
		} catch (Exception e1) {

			System.out.println("CHECK WITH THE THREAD");

		}
		System.out.print("SELECT THE TYPE OF DOCTOR YOU WANT TO CUNSULTANT PROVIDE : ");

		Scanner sc1 = new Scanner(System.in);
		String c2 = sc1.nextLine();
		String c1 = c2.toUpperCase();

		if (c1.equals("NEOROLOGIST")) {
			System.out.println("YOUR APINTMENT WITH" + " " + a + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("OPTHAMOLOGIST")) {
			System.out.println("YOUR APINTMENT WITH" + " " + b + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("DENTIST")) {
			System.out.println("YOUR APINTMENT WITH" + " " + c + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("DERMATOLOGIST")) {
			System.out.println("YOUR APINTMENT WITH" + " " + d + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("CARDIOLOGIST")) {
			System.out.println("YOUR APINTMENT WITH" + " " + e + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("GENERAL SURGEON")) {
			System.out.println("YOUR APINTMENT WITH" + " " + f + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else if (c1.equals("ENT")) {
			System.out.println("YOUR APINTMENT WITH" + " " + g + " " + "IS ABOUT TO READY...PLEASE WAIT SOME TIME");
		} else {

		}
		try {
			Thread.sleep(2000);
			System.out.println("THANK YOU FOR WAITING, YOUR APOINTMENT IS READY ");
		} catch (Exception e1) {
			System.out.println("CHECK WITH THEE THREAD");
		}
	}

	void check() {
		// override
	}

}
