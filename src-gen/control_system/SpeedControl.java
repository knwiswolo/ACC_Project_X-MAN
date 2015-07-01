package control_system;
/*
		* This is Java interface of the component SpeedControl
		*/

public interface SpeedControl {
	
	public Float calculateSpeedDifference (Float cruisingSpeed, Float currentSpeed); 
	public Float increaseSpeed (Float currentSpeed);
	public Float decreaseSpeed (Float currentSpeed);
	
}