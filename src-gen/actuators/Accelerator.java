package actuators;
/*
		* This is Java interface of the component Accelerate
		*/
		
public interface Accelerator {
	public Float accelerate(Float currentSpeed); 
	public Float decelerate(Float currentSpeed); 
}