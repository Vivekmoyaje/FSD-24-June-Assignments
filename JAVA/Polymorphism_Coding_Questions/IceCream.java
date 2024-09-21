package Polymorphism_Coding_Questions;

public class IceCream {

	public void quantity(int r, int h) {

		double volumn = (double) 1 / 3 * r * Math.PI * h;

		System.out.println("The quantity of Cone is : " + volumn);
	}
	
	
	public void quantity(int r) {

		double volumn = 4 / 3 * Math.PI * r * r * r;
		
		System.out.println("The quantity of Ball is : " +volumn);

	}

	public static void main(String[] args) {
		
	   
		
		IceCream IC = new IceCream();
		IC.quantity(3,5);
		IC.quantity(6);

	}

}

//Output:

//The quantity of Cone is : 15.707963267948966
//The quantity of Ball is : 678.5840131753953
