package simulators_impl;

import simulators.RadarSimulator;

/** This is Java implementation of the atomic component RadarSimulator
		*/
		

public class RadarSimulatorImpl implements RadarSimulator {
	
	Float clearance;
	
	public Float getClearance() {
		return clearance;
	}

	public void setClearance(Float clearance) {
		this.clearance = clearance;
	}

	// Constructor of atomic component RadarSimulator
	public RadarSimulatorImpl() {}
	
	public  Float  simulateInitialClearance() {	
		Float initialClearance = null;
		float min = 5;
		float max = 30;
		
		initialClearance = (float) (Math.random() < 0.5 ? ((1-Math.random()) * (max-min) + min) : (Math.random() * (max-min) + min));

		setClearance(initialClearance);
		return initialClearance;		
	}
	
	public Float currentClearance(){
		// update clearance
		return null;
	}
	
}