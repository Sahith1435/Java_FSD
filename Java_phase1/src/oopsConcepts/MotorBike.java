package oopsConcepts;

//This Program demonstrates Inheritance
public class MotorBike {
	  public int gear; 
	    public int speed; 
	    
	    public MotorBike(int gear, int speed) 
	    { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	public void applyBrake(int decrement) 
	    { 
	        speed -= decrement; 
	    } 
	public void speedUp(int increment) 
	    { 
	        speed += increment; 
	    }  
	public String toString()  
	    { 
	        return("No of gears are :" + gear + "\n" + "speed of Motor Bike is " + speed); 
	    }  
	} 
	class GearedMotorBike extends MotorBike
	{ 
	    public int seatHeight; 
	    public GearedMotorBike(int gear,int speed,int startHeight) 
	    {  
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    } 
	 @Override
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 

}
