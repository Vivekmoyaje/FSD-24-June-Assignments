package Looping_Statements;

//Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9

public class Sum_Divisible_Nine {
	
	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("numbers between 100 to 200 which is divisible by 9 : ");
		for(int i=101; i<200;i++) {
			
			if(i%9==0) {
				System.out.println(i); //numbers between 100 to 200 which is divisible by 9.
				sum +=i;
			}
			
		}
		System.out.println( " Sum of all integer devide by 9 between 100 to 200 is: "+sum);
		
	}
}

//Output:

//numbers between 100 to 200 which is divisible by 9 : 
//108
//117
//126
//135
//144
//153
//162
//171
//180
//189
//198
// Sum of all integer devide by 9 between 100 to 200 is: 1683