package Inheritance_Task;

//Hierarchical inheritance example.

//Exercise 2: Shape Hierarchy
//Create a class hierarchy representing different geometric shapes: Shape, Circle, and Rectangle.

//Shape Class:
//Methods: getArea() and getPerimeter() (to be overridden by subclasses).

//Circle Class (subclass of Shape):
//Properties: radius
//Implement getArea() and getPerimeter() methods for circles.

//Rectangle Class (subclass of Shape):
//Properties: length and width
//Implement getArea() and getPerimeter() methods for rectangles.

//Write a Main class to demonstrate the use of these classes by creating instances of both Circle and Rectangle.


class Shape{
	
    public void getArea() {
    	
    	System.out.println("Area of shape");
    }
    

	public void getPerimeter() {
    	
    	System.out.println("Perimeter of shape");
    }
	
}

class Circle extends Shape{
	
	double radius;
	
	public Circle(double radius) {
		
		this.radius = radius;
		this.getArea();
		this.getPerimeter();
	}
	
	@Override
	
	 public void getArea() {
	    	
	    	System.out.println("The area of circle is : " + Math.PI*radius);
	    }
	 
	 public void getPerimeter() {
			
			System.out.println("The Perimeter of circle : " + 2*Math.PI*radius);
			
		}
}

class Rectangle extends Shape{
	
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		this.getArea();
		this.getPerimeter();
	}
	
	@Override
	
	public void getArea() {
		
		System.out.println("The area of rectangle is : " + length*width);
	}
	
	public void getPerimeter() {
		
		System.out.println("The Perimeter of rectangle is : " + 2*(length+width));
	}
}

public class ShapeHierarchy {
	
	public static void main(String[] args) {
		
		Shape Circle = new Circle(5);
		System.out.println("------------------------------------");
		Shape Rectangle = new Rectangle(8,5);
	}

}

//Output:


//The area of circle is : 15.707963267948966
//The Perimeter of circle : 31.41592653589793
//------------------------------------
//The area of rectangle is : 40.0
//The Perimeter of rectangle is : 26.0
