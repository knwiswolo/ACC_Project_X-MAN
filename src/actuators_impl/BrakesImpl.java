package actuators_impl;

import control_system_impl.SpeedControlImpl;
import actuators.Brakes;

/*
		* This is Java implementation of the atomic component AcceleratorImpl
		*/
				
public class BrakesImpl implements Brakes {
/**
 * Constructor of atomic component BrakesImpl
 */	
	public BrakesImpl() {}
	
	SpeedControlImpl speedControl = new SpeedControlImpl();
	
	@Override
	public Float applyBrakes(Float currentSpeed) {
		System.out.println("<brakes applied | currentSpeed>: " + speedControl.increaseSpeed(currentSpeed));
		return speedControl.decreaseSpeed(currentSpeed);
	}
	
	@Override
	public Float applyEmergencyBrakes(Float currentSpeed) {
		System.out.println("<emergency brakes applied | currentSpeed>: " + speedControl.decreaseSpeed(currentSpeed));
		return speedControl.decreaseSpeed(currentSpeed);
	}
		
}