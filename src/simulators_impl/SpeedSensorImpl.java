package simulators_impl;
/*
		* This is Java implementation of the atomic component SpeedSensor
		*/
		
import simulators.SpeedSensor;
		
public class SpeedSensorImpl implements SpeedSensor {
	
	Float currentSpeed;
	
	public Float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(Float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	/**
	 * Constructor of atomic component SpeedSensor
	 */
	public SpeedSensorImpl() {}
	
	public Float generateSpeed () {
	    Float initialSpeed = null;
	    
	    float min = 20;
		float max = 100;
		initialSpeed = (float) (Math.random() < 0.5 ? ((1-Math.random()) * (max-min) + min) : (Math.random() * (max-min) + min));
		
	    return initialSpeed;
	 }
	
	public  Integer  calculateSpeedDifference (Float cruisingSpeed, Float currentSpeed) {
		Integer speedDifference = null;
		
		if (cruisingSpeed < currentSpeed){
			speedDifference = 0;
		}
		else if (cruisingSpeed > currentSpeed){
			speedDifference = 1;
		}
		return speedDifference;
    }
	
}