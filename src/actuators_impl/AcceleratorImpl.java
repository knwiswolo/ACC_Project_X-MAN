package actuators_impl;

import control_system_impl.SpeedControlImpl;
import actuators.Accelerator;

/*
		* This is Java implementation of the atomic component AcceleratorImpl
		*/
				
public class AcceleratorImpl implements Accelerator {
/**
 * Constructor of atomic component AcceleratorImpl
 */	
	public AcceleratorImpl() {}
	
	SpeedControlImpl speedControl = new SpeedControlImpl();
	
	@Override
	public Float accelerate(Float currentSpeed) {
		System.out.println("<accelerated speed>: " + speedControl.increaseSpeed(currentSpeed));
		return speedControl.increaseSpeed(currentSpeed);
	}
	
	@Override
	public Float decelerate(Float currentSpeed) {
		System.out.println("<decelerated speed>: " + speedControl.decreaseSpeed(currentSpeed));
		return speedControl.decreaseSpeed(currentSpeed);
	}
		
}