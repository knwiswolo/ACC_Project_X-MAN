package actuators;
/*
 * This is Java interface of the component Accelerator
 */

public interface Accelerator {
	public Float accelerate(Float currentSpeed, Float cruisingSpeed);
	public Float decelerate(Float currentSpeed, Float cruisingSpeed);
}