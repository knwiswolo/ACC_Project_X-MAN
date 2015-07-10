package simulators_impl;
/*
		* This is Java implementation of the atomic component SpeedSensor
		*/
		
import simulators.SpeedSensor;
		
public class SpeedSensorImpl implements SpeedSensor {

	/**
	 * Constructor of atomic component SpeedSensor
	 */
	public SpeedSensorImpl() {}
	
	public Float generateSpeed () {
	    Float initialSpeed = null;
	    
	    //float min = 20;
		//float max = 100;
		initialSpeed = (float) 60; //(float) (Math.random() < 0.5 ? ((1-Math.random()) * (max-min) + min) : (Math.random() * (max-min) + min));
		
	    return initialSpeed;
	 }
	
	public Float updateSpeed (Float speed) {
    	Float updatedSpeed = speed;
    	return updatedSpeed;
    }
	
	// calculate speed difference to trigger acceleration or deceleration
	public Integer calculateSpeedDifference (Float cruisingSpeed, Float currentSpeed) {
		Integer speedDifference = null;
		
		if (cruisingSpeed < currentSpeed){
			speedDifference = 0; // decelerate
		}
		else if (cruisingSpeed > currentSpeed){
			speedDifference = 1; // accelerate
		}else if (cruisingSpeed == currentSpeed)
		{
			speedDifference = 2;
		}
		return speedDifference;
    }
	
}