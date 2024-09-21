package Polymorphism_Coding_Questions;

class Parent{
	
	public void m1() {
		
		System.out.println("I am method m1 of parent");
	}
	public void m2(int age) {
		
		System.out.println(age);
		
	}
	
}

public class Child extends Parent{
	
	@Override
	
	public void m1() {
		
		System.out.println("I am method m1 of child");
		
	}
	
	public void m2(int age) {
		
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		Parent P = new Parent();
		P.m1();
		P.m2(50);
		
		Child C = new Child();
		C.m1();
		C.m2(23);
	}

}
