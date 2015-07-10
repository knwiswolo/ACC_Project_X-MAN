package control_system_impl;

import control_system.ZoneCalculator;

/*
		* This is Java implementation of the atomic component ZoneCalculator
		*/
				
		
public class ZoneCalculatorImpl implements ZoneCalculator {

	private static Integer DANGER_ZONE = 1;
	private static Integer ZONE_A = 2;
	private static Integer ZONE_B = 3;
	private static Integer ZONE_C = 4;
	private static Integer ZONE_D = 5;
	
	//Constructor of atomic component ZoneCalculatorImpl
	public ZoneCalculatorImpl() {}
	
	public Integer calculateZone(Float clearance, Float safetyDistance) {
		if (clearance == null){
			System.out.println("<invalid>");
			return 0;
		}
		else if(clearance <= safetyDistance/1.5){
			System.out.println("<danger zone>");
			return DANGER_ZONE;
		}
		else if(clearance <= safetyDistance && clearance > safetyDistance/2){
			System.out.println("<zone A>");
			return ZONE_A;
		}
		else if(clearance > safetyDistance && clearance <= 1.5*safetyDistance){
			System.out.println("<zone B>");
			return ZONE_B;
		}
		else if(clearance > 1.5*safetyDistance && clearance <= 2*safetyDistance){
			System.out.println("<zone C>");
			return ZONE_C;
		}
		else if(clearance > 2*safetyDistance){
			System.out.println("<zone D>");
			return ZONE_D;
		}
		return 0;
	}

}