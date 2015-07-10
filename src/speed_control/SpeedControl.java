/**
 * this is implementation of composite component SpeedControl  in Java
 */

package speed_control;

import zone_selector.ZoneSelector;
import control_system.ZoneCalculator;
import control_system_impl.ZoneCalculatorImpl;

public final class SpeedControl {
	/*
	 * Active service pointer
	 */
	private String activeServiceName = null;

	/*
	 * Component instances declaration
	 */
	private ZoneCalculator zoneCalculator;
	private ZoneSelector zoneSelector;/*
									 * Data channel variable declaration
									 */
	Integer zoneCalculator_calculateZone_zone__zoneSelector_zoneSelector_service_zone = null;
	Float System_speedControl_service_clearance__zoneCalculator_calculateZone_clearance = null;
	Float System_speedControl_service_safetyDistance__zoneCalculator_calculateZone_safetyDistance = null;
	Integer System_speedControl_service_speedDifference__zoneSelector_zoneSelector_service_speedDifference = null;
	Float System_speedControl_service_cruisingSpeed__zoneSelector_zoneSelector_service_cruisingSpeed = null;
	Float System_speedControl_service_currentSpeed__zoneSelector_zoneSelector_service_currentSpeed = null;
	Float zoneSelector_zoneSelector_service_updatedSpeed__System_updatedSpeed_updatedSpeed = null;

	/**
	 * Constructor of composite component SpeedControl
	 */
	public SpeedControl() {
		/* init data elements of this component */

		/* instantiate sub-component zoneCalculator */
		this.zoneCalculator = new ZoneCalculatorImpl();
		/* instantiate sub-component zoneSelector */
		this.zoneSelector = new ZoneSelector();
	}

	/**
	 * Service speedControl_service of the system
	 */
	public Float speedControl_service(Float clearance, Float safetyDistance,
			Integer speedDifference, Float cruisingSpeed, Float currentSpeed) {
		this.activeServiceName = "speedControl_service";
		/* push data to channels */
		System_speedControl_service_clearance__zoneCalculator_calculateZone_clearance = clearance; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		System_speedControl_service_safetyDistance__zoneCalculator_calculateZone_safetyDistance = safetyDistance; /*
																												 * push
																												 * value
																												 * to
																												 * channel
																												 */
		System_speedControl_service_speedDifference__zoneSelector_zoneSelector_service_speedDifference = speedDifference; /*
																														 * push
																														 * value
																														 * to
																														 * channel
																														 */
		System_speedControl_service_cruisingSpeed__zoneSelector_zoneSelector_service_cruisingSpeed = cruisingSpeed; /*
																													 * push
																													 * value
																													 * to
																													 * channel
																													 */
		System_speedControl_service_currentSpeed__zoneSelector_zoneSelector_service_currentSpeed = currentSpeed; /*
																												 * push
																												 * value
																												 * to
																												 * channel
																												 */
		/* invoke the top level connector */
		invokeSEQUENCER();
		/* pull data from channels */
		Float updatedSpeed = null;
		if (zoneSelector_zoneSelector_service_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = zoneSelector_zoneSelector_service_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
		}
		return updatedSpeed;
	}/*
	 * Invoking connector SEQUENCER of the system
	 */

	private void invokeSEQUENCER() {
		invokezoneCalculator();
		invokezoneSelector();
	}/*
	 * Invoking component instance zoneCalculator in the system
	 */

	private void invokezoneCalculator() {
		if (this.activeServiceName == "speedControl_service") {
			/* pull data from channels */
			Float clearance = null;
			if (System_speedControl_service_clearance__zoneCalculator_calculateZone_clearance != null) {
				clearance = System_speedControl_service_clearance__zoneCalculator_calculateZone_clearance; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			Float safetyDistance = null;
			if (System_speedControl_service_safetyDistance__zoneCalculator_calculateZone_safetyDistance != null) {
				safetyDistance = System_speedControl_service_safetyDistance__zoneCalculator_calculateZone_safetyDistance; /*
																														 * pull
																														 * value
																														 * from
																														 * channel
																														 */
			}
			/* Invoke the service */
			Integer zone = zoneCalculator.calculateZone(clearance,
					safetyDistance);
			/* Push data to channels */
			zoneCalculator_calculateZone_zone__zoneSelector_zoneSelector_service_zone = zone;
		}
	}/*
	 * Invoking component instance zoneSelector in the system
	 */

	private void invokezoneSelector() {
		if (this.activeServiceName == "speedControl_service") {
			/* pull data from channels */
			Integer zone = null;
			if (zoneCalculator_calculateZone_zone__zoneSelector_zoneSelector_service_zone != null) {
				zone = zoneCalculator_calculateZone_zone__zoneSelector_zoneSelector_service_zone; /*
																								 * pull
																								 * value
																								 * from
																								 * channel
																								 */
			}
			Integer speedDifference = null;
			if (System_speedControl_service_speedDifference__zoneSelector_zoneSelector_service_speedDifference != null) {
				speedDifference = System_speedControl_service_speedDifference__zoneSelector_zoneSelector_service_speedDifference; /*
																																 * pull
																																 * value
																																 * from
																																 * channel
																																 */
			}
			Float currentSpeed = null;
			if (System_speedControl_service_currentSpeed__zoneSelector_zoneSelector_service_currentSpeed != null) {
				currentSpeed = System_speedControl_service_currentSpeed__zoneSelector_zoneSelector_service_currentSpeed; /*
																														 * pull
																														 * value
																														 * from
																														 * channel
																														 */
			}
			Float cruisingSpeed = null;
			if (System_speedControl_service_cruisingSpeed__zoneSelector_zoneSelector_service_cruisingSpeed != null) {
				cruisingSpeed = System_speedControl_service_cruisingSpeed__zoneSelector_zoneSelector_service_cruisingSpeed; /*
																															 * pull
																															 * value
																															 * from
																															 * channel
																															 */
			}
			/* Invoke the service */
			Float updatedSpeed = zoneSelector.zoneSelector_service(zone,
					speedDifference, currentSpeed, cruisingSpeed);
			/* Push data to channels */
			zoneSelector_zoneSelector_service_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}
}