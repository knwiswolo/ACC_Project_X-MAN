package vehicle_states;

public interface VehicleState {
	public void doAction(VehicleStateContext vsContext, Float clearance, Float safetyDistance, Float currentSpeed, Float cruisingSpeed);
}
