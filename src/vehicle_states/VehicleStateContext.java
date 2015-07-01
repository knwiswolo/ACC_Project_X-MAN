package vehicle_states;

public class VehicleStateContext {
	
	private VehicleState vehicleState;
	
	public VehicleStateContext(){
		vehicleState = null;
	}

	public VehicleState getVehicleState() {
		return vehicleState;
	}

	public void setVehicleState(VehicleState vehicleState) {
		this.vehicleState = vehicleState;
	}
	
}
