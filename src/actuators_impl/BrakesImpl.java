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
		int timing = (int) (currentSpeed*25);
		Float speedAfterBrake = null;
		Float initialSpeed = currentSpeed;
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			while(currentSpeed > initialSpeed/2){
				try{
					speedAfterBrake = currentSpeed-=(float)1.0;
					System.out.println("applyingBrakes... | speed = " + speedAfterBrake);
					Thread.sleep(timing);
				}catch(Exception ex){ex.printStackTrace();}
			}
		}else System.out.println ("Invalid <brake> Action");
		System.out.println("updated speed = " + speedAfterBrake);
		return speedAfterBrake;
		
	} // at the moment brake, emergency brake are the same - make actuator pressure differ
	
	public Float applyEmergencyBrakes(Float currentSpeed) {
		int timing = (int) (currentSpeed*1);
		Float speedAfterEmergencyBrake = null;
		if (currentSpeed <= MAX_SPEED){
			while(currentSpeed > 0){
				try{
					speedAfterEmergencyBrake = currentSpeed-=(float)1.0;
					System.out.println("applyingEmergencyBrakes... | speed = " + speedAfterEmergencyBrake);
					Thread.sleep(timing);
				}catch(Exception ex){ex.printStackTrace();}
			}
		}else System.out.println ("Invalid <emergency brake> Action");
		System.out.println("updated speed = " + speedAfterEmergencyBrake);
		return speedAfterEmergencyBrake;
	}
		
}