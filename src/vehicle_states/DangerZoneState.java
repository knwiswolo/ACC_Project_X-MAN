package vehicle_states;

import notifications.NotificationFactory;
import actuators_impl.BrakesImpl;

public class DangerZoneState implements VehicleState{

	public int emergencyBrakePressure = 50;
	
	Float _currentSpeed;
	Float _cruisingSpeed;
	
	BrakesImpl brakes = new BrakesImpl();
	NotificationFactory notificationFactory = new NotificationFactory();
	
	@Override
	public void doAction(VehicleStateContext vsContext, Float clearance, Float safetyDistance, Float currentSpeed, Float cruisingSpeed) {
		
		_currentSpeed = currentSpeed;
		_cruisingSpeed = cruisingSpeed;
		
		notificationFactory.createNotification("danger zone");
		vsContext.setVehicleState(this);
		
		for(float i = currentSpeed; i > 0; i--){
			try{
				Thread.sleep(emergencyBrakePressure);
				currentSpeed = brakes.applyEmergencyBrakes(currentSpeed);
				System.out.println("<current speed>: " + currentSpeed);
			}
			catch(Exception ex){ex.printStackTrace();}
		}
		System.out.println("-------------------------");
		System.out.println("ACC_Vehicle immobile.");
		System.out.println("-------------------------");
	}
	
	public String toString(){
		return "DANGER ZONE!";
	}
}
