package actuators;
/*
		* This is Java interface of the component Brakes
		*/
				
public interface Brakes {
	public Float applyBrakes (Float currentSpeed); 
	public Float applyEmergencyBrakes (Float currentSpeed); 
}