package simulators_impl;

import simulators.RadarSimulator;

/** This is Java implementation of the atomic component RadarSimulator
		*/
		

public class RadarSimulatorImpl implements RadarSimulator {

	// Constructor of atomic component RadarSimulator
	public RadarSimulatorImpl() {}
	
	public Float simulateInitialClearance() {	
		Float initialClearance = null;
		float min = 5;
		float max = 30;
		
		initialClearance = min + max; //(float) (Math.random() < 0.5 ? ((1-Math.random()) * (max-min) + min) : (Math.random() * (max-min) + min));
		return initialClearance;		
	}
	
	public Float updateClearance (Float clearance) {
		Float updatedClearance = clearance;
		return updatedClearance;
	}
	
}