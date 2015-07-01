package control_system;
/** This is Java interface of the component distanceControl
*/
		
public interface DistanceControl {
	public Float calculateDistanceFromSafetyDistance (Float currentDistance, Float safetyDistance); 
	public void decrementDistance (Float clearance, Float distanceFromSafetyDistance); 
	public  void  incrementDistance (Float clearance, Float distanceFromSafetyDistance); 
}