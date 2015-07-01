package simulators;
/*
		* This is Java interface of the component SpeedSensor
		*/
		
		
public interface SpeedSensor {
	public  Float  generateSpeed (); 
	public  Integer  calculateSpeedDifference (Float cruisingSpeed, Float currentSpeed); 
}
		
		