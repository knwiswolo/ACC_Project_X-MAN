package actuators_impl;

import actuators.Brakes;

/*
		* This is Java implementation of the atomic component BrakeImpl
		*/
				
public class BrakesImpl implements Brakes {

	private static Float MAX_SPEED = (float)250;

	/**
	 * Constructor of atomic component BrakesImpl
	 */	
	public BrakesImpl() {}
		
	public Float applyBrakes(Float currentSpeed) {
		Float speedAfterBrake = null;
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			speedAfterBrake = currentSpeed--;
			return speedAfterBrake;
		}else System.out.println ("VEHICLE STATIONARY!");
		return speedAfterBrake;
	} // at the moment brake, emergency brake are the same - make actuator pressure differ
	
	public Float applyEmergencyBrakes(Float currentSpeed) {
		Float speedAfterEmergencyBrake = null;
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			speedAfterEmergencyBrake = currentSpeed--;
			return speedAfterEmergencyBrake;
		}else System.out.println ("VEHICLE STATIONARY!");
		return speedAfterEmergencyBrake;
	}
		
}