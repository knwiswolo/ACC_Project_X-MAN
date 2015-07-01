package vehicle_states;

import actuators_impl.AcceleratorImpl;

public class ZoneBState implements VehicleState{

	Float _currentSpeed;
	Float _cruisingSpeed;

	private int accelerationPressure = 1000;
	private int decelerationPressure = 1500;
	
	AcceleratorImpl accelerator = new AcceleratorImpl();
	
	@Override
	public void doAction(VehicleStateContext vsContext, Float clearance, Float safetyDistance, Float currentSpeed, Float cruisingSpeed) {
		
		_currentSpeed = currentSpeed;
		_cruisingSpeed = cruisingSpeed;
		
		System.out.println("Vehicle is in <Zone B>");
		vsContext.setVehicleState(this);
		
		if(currentSpeed > cruisingSpeed){
			for(float i = (Math.abs((cruisingSpeed - currentSpeed))-1); i >0; i--){
				try{
					Thread.sleep(decelerationPressure);
					currentSpeed = accelerator.decelerate(currentSpeed);
					// if... switch to ZONE A.
					if(clearance <= safetyDistance && clearance > safetyDistance/2){
						ZoneAState zoneAState = new ZoneAState();
						vsContext.setVehicleState(zoneAState);
						System.out.println("Switching to ZONE A...");
					}
					else if(clearance > 1.5*safetyDistance && clearance <= 2*safetyDistance){
						ZoneCState zoneCState = new ZoneCState();
						vsContext.setVehicleState(zoneCState);
						System.out.println("Switching to ZONE C...");
					}
					System.out.println("<current speed>: " + currentSpeed);
				}
				catch(Exception ex){ex.printStackTrace();}
			}
		}
		else if(currentSpeed < cruisingSpeed){
			for(float i = (Math.abs((cruisingSpeed - currentSpeed))-1); i >0; i--){
				try{
					Thread.sleep(accelerationPressure);
					currentSpeed = accelerator.accelerate(currentSpeed);
					// if... switch to ZONE A.
					if(clearance <= safetyDistance && clearance > safetyDistance/2){
						ZoneAState zoneAState = new ZoneAState();
						vsContext.setVehicleState(zoneAState);
						System.out.println("Switching to ZONE A...");
					}
					else if(clearance > 1.5*safetyDistance && clearance <= 2*safetyDistance){
						ZoneCState zoneCState = new ZoneCState();
						vsContext.setVehicleState(zoneCState);
						System.out.println("Switching to ZONE C...");
					}
					System.out.println("<current speed>: " + currentSpeed);
				}
				catch(Exception ex){ex.printStackTrace();}
			}
		}
		System.out.println("-------------------------");
		System.out.println("Cruise control speed reached");
		System.out.println("-------------------------");
	}
	
	public String toString(){
		return "ZONE B";
	}
}
