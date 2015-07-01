package control_system_impl;
import control_system.DistanceControl;

/** This is Java implementation of the atomic component distanceControl
		*/

public class DistanceControlImpl implements DistanceControl {

	//Constructor of atomic component distanceControl
	public DistanceControlImpl() {}
		
	public Float calculateDistanceFromSafetyDistance (Float safetyDistance, Float clearance) {
	    Float distanceFromSafetyDistance = safetyDistance - clearance; 
	    return distanceFromSafetyDistance;
	}
	
	public void decrementDistance(Float clearance, Float distanceFromSafetyDistance){
		clearance--;
		distanceFromSafetyDistance--;
	}
	
	public void incrementDistance(Float clearance, Float distanceFromSafetyDistance){
		clearance++;
		distanceFromSafetyDistance++;
	}

	//public Float calculateThrottlePosition(Float currentSpeed, Float cruiseControlSpeed) {
		//return null;
	//}
}