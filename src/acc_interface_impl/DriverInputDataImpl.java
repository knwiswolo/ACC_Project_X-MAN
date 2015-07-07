package acc_interface_impl;
/*
		* This is Java implementation of the atomic component DriverInputData
		*/
		
import acc_interface.DriverInputData;
		
public class DriverInputDataImpl implements DriverInputData {
	
	/**
	 * Constructor of atomic component DriverInputData
	 */
	public DriverInputDataImpl() {}
	
	public Float cruisingSpeedInput () {
		Float cruisingSpeed = (float) 20.0;
    	return cruisingSpeed;
    }
	
	public Float safetyDistanceInput () {
		Float safetyDistance = (float) 5.0;
		return safetyDistance;
	}
	
}