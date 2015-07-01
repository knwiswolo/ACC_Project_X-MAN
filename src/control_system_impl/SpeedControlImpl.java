package control_system_impl;
/*
		* This is Java implementation of the atomic component SpeedControl
		*/
		
import control_system.SpeedControl;
		
public class SpeedControlImpl implements SpeedControl {
	
	private static Float MAX_SPEED = (float)250;
	Float speedDifference;

	public SpeedControlImpl() {}
	
	public Float calculateSpeedDifference (Float currentSpeed, Float cruisingSpeed) {
		speedDifference = cruisingSpeed - currentSpeed;
		return speedDifference;
	}
	
	public Float increaseSpeed (Float currentSpeed) {
		if (currentSpeed < MAX_SPEED){ // figure this out!
			currentSpeed++;
			return currentSpeed;
		}else System.out.println ("MAX SPEED REACHED!");
		return currentSpeed;
	}
	
	public  Float  decreaseSpeed (Float currentSpeed) {
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			currentSpeed--;
			return currentSpeed;
		}else System.out.println ("VEHICLE IMMOBILE!");
		return currentSpeed;
	}
	
}