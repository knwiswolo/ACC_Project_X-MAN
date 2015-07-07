package simulators;
/*
		* This is Java interface of the component SpeedSensor
		*/
		
public interface SpeedSensor {
	public Float generateSpeed (); 
	public Float updateSpeed (Float speed); 
	public Integer calculateSpeedDifference (Float cruisingSpeed, Float currentSpeed); 
}