package actuators_impl;
/*
		* This is Java implementation of the atomic component Accelerator
		*/
		
import actuators.Accelerator;
		
public class AcceleratorImpl implements Accelerator {
	
	private static Float MAX_SPEED = (float)250;

	/**
	 * Constructor of atomic component Accelerator
	 */
	public AcceleratorImpl() {}
	
	public Float accelerate (Float currentSpeed, Float cruisingSpeed) {
		int timing = (int) (currentSpeed*50);
		Float acceleratedSpeed = null;
		
		if (currentSpeed < MAX_SPEED){ 
			while(currentSpeed < cruisingSpeed){
				try{
					acceleratedSpeed = currentSpeed+=(float)1.0;
					System.out.println("accelerating... | speed = " + acceleratedSpeed);
					Thread.sleep(timing);
				}
				catch(Exception ex){ex.printStackTrace();}
			}
		}else System.out.println ("MAX SPEED REACHED!");

		System.out.println("vehicle at cruising Speed");
		System.out.println("updated speed = " + acceleratedSpeed);
		return acceleratedSpeed;
	}
	
	public Float decelerate (Float currentSpeed, Float cruisingSpeed) {
		int timing = (int) (currentSpeed*50);
		Float deceleratedSpeed = null;
		if (currentSpeed > 0 && currentSpeed <= MAX_SPEED){
			while(currentSpeed > cruisingSpeed){
				try{
					deceleratedSpeed = currentSpeed-=(float)1.0;
					System.out.println("decelerating... | speed = " + deceleratedSpeed);
					Thread.sleep(timing);
				}
				catch(Exception ex){ex.printStackTrace();}
			}
		}else System.out.println ("Invalid <deceleration> Action");
		System.out.println("vehicle at cruising Speed");
		System.out.println("updated speed = " + deceleratedSpeed);
		return deceleratedSpeed;
	}
	
}