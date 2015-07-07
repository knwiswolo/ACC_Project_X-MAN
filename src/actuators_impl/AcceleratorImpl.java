package actuators_impl;
/*
		* This is Java implementation of the atomic component Accelerator
		*/
		
import actuators.Accelerator;
		
public class AcceleratorImpl implements Accelerator {
	
	private static Float MAX_SPEED = (float)250;

	/**
	 * Constructor of atomic component Accelerator
	 */
	public AcceleratorImpl() {}
	
	public Float accelerate (Float currentSpeed) {
		Float acceleratedSpeed = null;
		if (currentSpeed < MAX_SPEED){ 
			acceleratedSpeed = currentSpeed++;
			return acceleratedSpeed;
		}else System.out.println ("MAX SPEED REACHED!");
		return acceleratedSpeed;
	}
	
	public Float decelerate (Float currentSpeed) {
		Float deceleratedSpeed = null;
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			deceleratedSpeed = currentSpeed--;
			return deceleratedSpeed;
		}else System.out.println ("VEHICLE STATIONARY!");
		return deceleratedSpeed;
	}
	
}