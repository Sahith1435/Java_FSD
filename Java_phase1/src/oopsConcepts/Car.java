package oopsConcepts;
//This Program is to demonstrate Classes and its Objects
public class Car {
	String name; 
    String brand; 
    int cost; 
    String color; 
    
public Car(String name, String brand, int cost, String color) 
    { 
        this.name = name; 
        this.brand = brand; 
        this.cost = cost; 
        this.color = color; 
    } 
public String getName() 
    { 
        return name; 
    } 
public String getBrand() 
    { 
        return brand; 
    } 
public int getCost() 
    { 
        return cost; 
    } 
public String getColor() 
    { 
        return color; 
    } 
@Override
    public String toString() 
    { 
        return("Hi i'm Sahith and my car is "+ this.getName()+ ".\nIts brand,cost and color are " + this.getBrand()+", " + this.getCost()+ ","+ this.getColor() + "."); 
    } 
public static void main(String[] args) 
    { 
        Car URUS = new Car("URUS","Lamborgini",34300000, "Graphite"); 
        System.out.println(URUS.toString()); 
    } 
}
