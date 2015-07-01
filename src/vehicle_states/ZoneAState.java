package vehicle_states;

import notifications.NotificationFactory;
import actuators_impl.AcceleratorImpl;

public class ZoneAState implements VehicleState{

	Float _currentSpeed;
	Float _cruisingSpeed;

	private int decelerationPressure = 1500;
	
	AcceleratorImpl accelerator = new AcceleratorImpl();
	NotificationFactory notificationFactory = new NotificationFactory();
	
	DangerZoneState dangerZoneState = new DangerZoneState();
	
	@Override
	public void doAction(VehicleStateContext vsContext, Float clearance, Float safetyDistance, Float currentSpeed, Float cruisingSpeed) {
		
		_currentSpeed = currentSpeed;
		_cruisingSpeed = cruisingSpeed;
		
		notificationFactory.createNotification("zone A");
		vsContext.setVehicleState(this);
		
		for(float i = (Math.abs((cruisingSpeed - currentSpeed))-1); i >0; i--){
			if(currentSpeed > cruisingSpeed){
				try{
					Thread.sleep(decelerationPressure);
					currentSpeed = accelerator.decelerate(currentSpeed);
					// if clearance reaches half safety distance switch to DANGER ZONE.
					if(clearance <= safetyDistance/2){
						vsContext.setVehicleState(dangerZoneState);
						System.out.println("Switching to DANGER ZONE...");
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
		return "ZONE A";
	}
}
