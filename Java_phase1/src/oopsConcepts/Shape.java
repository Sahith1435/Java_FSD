package oopsConcepts;

//This Program demonstrates abstraction

abstract class Shape {
	String color; 
    abstract double area(); 
    public abstract String toString(); 
    
    public Shape(String color) 
    { 
        System.out.println("This is Shape Constructor."); 
        this.color = color; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
    public Circle(String color,double radius) 
    { 
        super(color); 
        System.out.println("This is Circle's Constructor."); 
        this.radius = radius; 
    }
@Override
    double area() 
    { 
        return Math.PI * Math.pow(radius, 2); 
    } 
@Override
    public String toString() 
    { 
        return "Circle color is " + super.color + "and area is : " + area(); 
    } 
} 
class Rectangle extends Shape
{ 
    double length; 
    double width; 
    public Rectangle(String color,double length,double width) 
    { 
        super(color); 
        System.out.println("This is Rectangle's Constructor"); 
        this.length = length; 
        this.width = width; 
    } 
@Override
    double area() 
    { 
        return length*width; 
    } 
@Override
    public String toString() 
    { 
        return "Rectangle color is " + super.color +  "and area is : " + area();                           
    } 

}
