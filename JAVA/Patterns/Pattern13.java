package Patterns;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		int dVal = 65;
		int a = 5;
		
		for(int i=1; i<=a; i++) {
			
			for(int j=a; j>i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				
				System.out.print((char)(dVal+i-1) + " ");
			}
			System.out.println();
		}
	}

}

//     A 
//    B B 
//   C C C 
//  D D D D 
// E E E E E
