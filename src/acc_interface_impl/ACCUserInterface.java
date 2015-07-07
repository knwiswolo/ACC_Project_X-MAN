package acc_interface_impl;

import java.util.Scanner;

import simulators_impl.RadarSimulatorImpl;
import simulators_impl.SpeedSensorImpl;
import vehicle_states.VehicleStateFactory;
import control_system_impl.DistanceControlImpl;
import control_system_impl.SpeedControlImpl;

// class serving as interface between Driver and System
public class ACCUserInterface {

	private static Scanner scanner;
	
	private static Float safetyDistance;
	private static Float cruisingSpeed;

	private static Float distanceFromSafetyDistance;
	private static Float speedDifference;
	
	private static Float currentSpeed;
	private static Float currentClearance;
		
	public static Float getCruisingSpeed() {
		return cruisingSpeed;
	}
	
	public static void main(String[] args) {
		
		RadarSimulatorImpl radarSimulator = new RadarSimulatorImpl();
		DistanceControlImpl distanceControl = new DistanceControlImpl();
		
		SpeedSensorImpl speedSensor = new SpeedSensorImpl();
		SpeedControlImpl speedControl = new SpeedControlImpl();
	
		Float initialSpeed = speedSensor.generateSpeed();
		Float initialClearance = radarSimulator.simulateInitialClearance();
		
		VehicleStateFactory vehicleStateFactory = new VehicleStateFactory();
		
		while (true){
			
			System.out.println("-------------------------");
			System.out.println("Initial Speed of ACC_Vehicle: " + initialSpeed + " m/s.");
			System.out.println("Initial Clearance: " + initialClearance + " m");
			System.out.println("-------------------------");
			
			// ask to Switch on ACC.
			System.out.println("Press 'ON' to activate ACC.");
			System.out.println("-------------------------");
			
			try{
					scanner = new Scanner (System.in);
					String input;
					input = scanner.nextLine();
								
					/**start simulation
					ACC vehicle is moving at randomly generated speed. - ACC OFF.
					- show current speed.
					*/
					if(input.equalsIgnoreCase("ON")){
						
						System.out.println("-------------------------");
						System.out.println("ACC System ACTIVATED!");
						System.out.println("-------------------------");
						
						//Initiate ACC System.
								
						// ask for safety distance from driver
						System.out.println("Input safety distance (m): ");
						
						scanner = new Scanner(System.in);
						safetyDistance = scanner.nextFloat();
						
						// ask for cruise control speed from driver
						System.out.println("Input cruising speed (m/s): ");
						scanner = new Scanner(System.in);
						cruisingSpeed = scanner.nextFloat();
							
						distanceFromSafetyDistance = distanceControl.calculateDistanceFromSafetyDistance(initialClearance, safetyDistance);
						speedDifference = speedControl.calculateSpeedDifference(initialSpeed, cruisingSpeed);
						
						// setting initial speed and distance as currents
						//speedSensor.setCurrentSpeed(initialSpeed);
						//currentSpeed = speedSensor.getCurrentSpeed();
						//radarSimulator.setClearance(initialClearance);
						//currentClearance = radarSimulator.getClearance();
						
						System.out.println("Distance from safety distance: " + distanceFromSafetyDistance);
						System.out.println("Current clearance: " + currentClearance);
						System.out.println("Speed Differnce: " + speedDifference);
						System.out.println("");
						
						/* conditions on vehicle states
						 * should be done in the composite control_system - change later 
						 * # driver should be able to set current speed as cruise control speed 
						 * # implement OVERRIDE: acceleration and brake */
						vehicleStateFactory.createVehicleState(currentClearance, safetyDistance, currentSpeed, cruisingSpeed);

					}
			}
			catch(Exception ex){ex.printStackTrace();}
		}
	}

}
