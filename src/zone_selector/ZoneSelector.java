/**
 * this is implementation of composite component ZoneSelector  in Java
 */

package zone_selector;

import zones.ZoneB;
import zones.ZoneC;
import zones.ZoneD;
import actuators.Brakes;
import actuators_impl.BrakesImpl;

public final class ZoneSelector {
	/*
	 * Active service pointer
	 */
	private String activeServiceName = null;

	/*
	 * Component instances declaration
	 */
	private ZoneD zoneD;
	private ZoneC zoneC;
	private ZoneB zoneB;
	private Brakes zoneA;
	private Brakes dangerZone;/*
							 * Data channel variable declaration
							 */
	Integer System_zoneSelector_service_zone__SEL_1_zone = null;
	Integer System_zoneSelector_service_speedDifference__zoneB_zoneB_service_speedDifference = null;
	Integer System_zoneSelector_service_speedDifference__zoneC_zoneC_service_speedDifference = null;
	Integer System_zoneSelector_service_speedDifference__zoneD_zoneD_service_speedDifference = null;
	Float System_zoneSelector_service_currentSpeed__dangerZone_applyEmergencyBrakes_currentSpeed = null;
	Float System_zoneSelector_service_currentSpeed__zoneA_applyBrakes_currentSpeed = null;
	Float System_zoneSelector_service_currentSpeed__zoneB_zoneB_service_currentSpeed = null;
	Float System_zoneSelector_service_currentSpeed__zoneC_zoneC_service_currentSpeed = null;
	Float System_zoneSelector_service_currentSpeed__zoneD_zoneD_service_currentSpeed = null;
	Float zoneD_zoneD_service_updatedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float zoneC_zoneC_service_updatedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float zoneB_zoneB_service_updatedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float zoneA_applyBrakes_speedAfterBrake__System_updatedSpeed_updatedSpeed = null;
	Float dangerZone_applyEmergencyBrakes_speedAfterEmergencyBrake__System_updatedSpeed_updatedSpeed = null;

	/**
	 * Constructor of composite component ZoneSelector
	 */
	public ZoneSelector() {
		/* init data elements of this component */

		/* instantiate sub-component zoneD */
		this.zoneD = new ZoneD();
		/* instantiate sub-component zoneC */
		this.zoneC = new ZoneC();
		/* instantiate sub-component zoneB */
		this.zoneB = new ZoneB();
		/* instantiate sub-component zoneA */
		this.zoneA = new BrakesImpl();
		/* instantiate sub-component dangerZone */
		this.dangerZone = new BrakesImpl();
	}

	/**
	 * Service zoneSelector_service of the system
	 */
	public Float zoneSelector_service(Integer zone, Integer speedDifference,
			Float currentSpeed) {
		this.activeServiceName = "zoneSelector_service";
		/* push data to channels */
		System_zoneSelector_service_zone__SEL_1_zone = zone; /*
															 * push value to
															 * channel
															 */
		System_zoneSelector_service_speedDifference__zoneB_zoneB_service_speedDifference = speedDifference; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		System_zoneSelector_service_speedDifference__zoneC_zoneC_service_speedDifference = speedDifference; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		System_zoneSelector_service_speedDifference__zoneD_zoneD_service_speedDifference = speedDifference; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		System_zoneSelector_service_currentSpeed__dangerZone_applyEmergencyBrakes_currentSpeed = currentSpeed; /*
																												 * push
																												 * value
																												 * to
																												 * channel
																												 */
		System_zoneSelector_service_currentSpeed__zoneA_applyBrakes_currentSpeed = currentSpeed; /*
																								 * push
																								 * value
																								 * to
																								 * channel
																								 */
		System_zoneSelector_service_currentSpeed__zoneB_zoneB_service_currentSpeed = currentSpeed; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		System_zoneSelector_service_currentSpeed__zoneC_zoneC_service_currentSpeed = currentSpeed; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		System_zoneSelector_service_currentSpeed__zoneD_zoneD_service_currentSpeed = currentSpeed; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		/* invoke the top level connector */
		invokeSEL_1();
		/* pull data from channels */
		Float updatedSpeed = null;
		if (zoneD_zoneD_service_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = zoneD_zoneD_service_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
																								 * pull
																								 * value
																								 * from
																								 * channel
																								 */
		}
		if (zoneC_zoneC_service_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = zoneC_zoneC_service_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
																								 * pull
																								 * value
																								 * from
																								 * channel
																								 */
		}
		if (zoneB_zoneB_service_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = zoneB_zoneB_service_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
																								 * pull
																								 * value
																								 * from
																								 * channel
																								 */
		}
		if (zoneA_applyBrakes_speedAfterBrake__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = zoneA_applyBrakes_speedAfterBrake__System_updatedSpeed_updatedSpeed; /*
																								 * pull
																								 * value
																								 * from
																								 * channel
																								 */
		}
		if (dangerZone_applyEmergencyBrakes_speedAfterEmergencyBrake__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = dangerZone_applyEmergencyBrakes_speedAfterEmergencyBrake__System_updatedSpeed_updatedSpeed; /*
																														 * pull
																														 * value
																														 * from
																														 * channel
																														 */
		}
		return updatedSpeed;
	}/*
	 * Invoking connector SEL_1 of the system
	 */

	private void invokeSEL_1() {
		Integer zone = null;
		if (System_zoneSelector_service_zone__SEL_1_zone != null) {
			zone = System_zoneSelector_service_zone__SEL_1_zone;
			System_zoneSelector_service_zone__SEL_1_zone = null;
		}
		if (zone == 3) {
			invokezoneB();
		}
		if (zone == 4) {
			invokezoneC();
		}
		if (zone == 5) {
			invokezoneD();
		}
		if (zone == 2) {
			invokezoneA();
		}
		if (zone == 1) {
			invokedangerZone();
		}
	}/*
	 * Invoking component instance zoneD in the system
	 */

	private void invokezoneD() {
		if (this.activeServiceName == "zoneSelector_service") {
			/* pull data from channels */
			Integer speedDifference = null;
			if (System_zoneSelector_service_speedDifference__zoneD_zoneD_service_speedDifference != null) {
				speedDifference = System_zoneSelector_service_speedDifference__zoneD_zoneD_service_speedDifference; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Float currentSpeed = null;
			if (System_zoneSelector_service_currentSpeed__zoneD_zoneD_service_currentSpeed != null) {
				currentSpeed = System_zoneSelector_service_currentSpeed__zoneD_zoneD_service_currentSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			/* Invoke the service */
			Float updatedSpeed = zoneD.zoneD_service(speedDifference,
					currentSpeed);
			/* Push data to channels */
			zoneD_zoneD_service_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}/*
	 * Invoking component instance zoneC in the system
	 */

	private void invokezoneC() {
		if (this.activeServiceName == "zoneSelector_service") {
			/* pull data from channels */
			Integer speedDifference = null;
			if (System_zoneSelector_service_speedDifference__zoneC_zoneC_service_speedDifference != null) {
				speedDifference = System_zoneSelector_service_speedDifference__zoneC_zoneC_service_speedDifference; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Float currentSpeed = null;
			if (System_zoneSelector_service_currentSpeed__zoneC_zoneC_service_currentSpeed != null) {
				currentSpeed = System_zoneSelector_service_currentSpeed__zoneC_zoneC_service_currentSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			/* Invoke the service */
			Float updatedSpeed = zoneC.zoneC_service(speedDifference,
					currentSpeed);
			/* Push data to channels */
			zoneC_zoneC_service_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}/*
	 * Invoking component instance zoneB in the system
	 */

	private void invokezoneB() {
		if (this.activeServiceName == "zoneSelector_service") {
			/* pull data from channels */
			Integer speedDifference = null;
			if (System_zoneSelector_service_speedDifference__zoneB_zoneB_service_speedDifference != null) {
				speedDifference = System_zoneSelector_service_speedDifference__zoneB_zoneB_service_speedDifference; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Float currentSpeed = null;
			if (System_zoneSelector_service_currentSpeed__zoneB_zoneB_service_currentSpeed != null) {
				currentSpeed = System_zoneSelector_service_currentSpeed__zoneB_zoneB_service_currentSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			/* Invoke the service */
			Float updatedSpeed = zoneB.zoneB_service(speedDifference,
					currentSpeed);
			/* Push data to channels */
			zoneB_zoneB_service_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}/*
	 * Invoking component instance zoneA in the system
	 */

	private void invokezoneA() {
		if (this.activeServiceName == "zoneSelector_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneSelector_service_currentSpeed__zoneA_applyBrakes_currentSpeed != null) {
				currentSpeed = System_zoneSelector_service_currentSpeed__zoneA_applyBrakes_currentSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
			}
			/* Invoke the service */
			Float speedAfterBrake = zoneA.applyBrakes(currentSpeed);
			/* Push data to channels */
			zoneA_applyBrakes_speedAfterBrake__System_updatedSpeed_updatedSpeed = speedAfterBrake;
		}
	}/*
	 * Invoking component instance dangerZone in the system
	 */

	private void invokedangerZone() {
		if (this.activeServiceName == "zoneSelector_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneSelector_service_currentSpeed__dangerZone_applyEmergencyBrakes_currentSpeed != null) {
				currentSpeed = System_zoneSelector_service_currentSpeed__dangerZone_applyEmergencyBrakes_currentSpeed; /*
																														 * pull
																														 * value
																														 * from
																														 * channel
																														 */
			}
			/* Invoke the service */
			Float speedAfterEmergencyBrake = dangerZone
					.applyEmergencyBrakes(currentSpeed);
			/* Push data to channels */
			dangerZone_applyEmergencyBrakes_speedAfterEmergencyBrake__System_updatedSpeed_updatedSpeed = speedAfterEmergencyBrake;
		}
	}
}