package vehicle_states;

public class VehicleStateFactory {
	
	VehicleStateContext vehicleStateContext = new VehicleStateContext();
	
	public VehicleState createVehicleState(Float clearance, Float safetyDistance, Float currentSpeed, Float cruisingSpeed){
		if (clearance == null){
			return null;
		}
		else if(clearance <= safetyDistance/2){
			DangerZoneState dangerZoneState = new DangerZoneState();
			dangerZoneState.doAction(vehicleStateContext, clearance, safetyDistance, currentSpeed, cruisingSpeed);
			return dangerZoneState;
		}
		else if(clearance <= safetyDistance && clearance > safetyDistance/2){
			ZoneAState zoneAState = new ZoneAState();
			zoneAState.doAction(vehicleStateContext, clearance, safetyDistance, currentSpeed, cruisingSpeed);
			return zoneAState;
		}
		else if(clearance > safetyDistance && clearance <= 1.5*safetyDistance){
			ZoneBState zoneBState = new ZoneBState();
			zoneBState.doAction(vehicleStateContext, clearance, safetyDistance, currentSpeed, cruisingSpeed);
			return zoneBState;
		}
		else if(clearance > 1.5*safetyDistance && clearance <= 2*safetyDistance){
			ZoneCState zoneCState = new ZoneCState();
			zoneCState.doAction(vehicleStateContext, clearance, safetyDistance, currentSpeed, cruisingSpeed);
			return zoneCState;
		}
		else if(clearance > 2*safetyDistance){
			ZoneDState zoneDState = new ZoneDState();
			zoneDState.doAction(vehicleStateContext, clearance, safetyDistance, currentSpeed, cruisingSpeed);
			return zoneDState;
		}
		return null;
	} 
}
