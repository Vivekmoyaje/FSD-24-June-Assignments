package Polymorphism_Coding_Questions;

public class Main {
	
	public void print(int num) {
		
		System.out.println(num);
		
	}
	
	public void print(String str) {
		
		System.out.println(str);
	}
	
	public void print(boolean exp) {
		
		System.out.println(exp);
	}
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		
		obj.print(35);
		obj.print("Hello world");
		obj.print(5==5);
		
		
	}

}

//Output:

//35
//Hello world
//true
