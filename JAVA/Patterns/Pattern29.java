package Patterns;

public class Pattern29 {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				
				if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3) {
					
					System.out.print("    ");
				}
				else {
					System.out.print("*   ");
				}
					
			}
			
			System.out.println();
		}
	}

}

//          *   
//        *   *   
//      *       *   
//    *           *   
//  *   *   *   *   *   
