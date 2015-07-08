/**
 * this is implementation of composite component ZoneB  in Java
 */

package zones;

import actuators.Accelerator;
import actuators_impl.AcceleratorImpl;

public final class ZoneB {
	/*
	 * Active service pointer
	 */
	private String activeServiceName = null;

	/*
	 * Component instances declaration
	 */
	private Accelerator accelerator1;
	private Accelerator accelerator2;/*
									 * Data channel variable declaration
									 */
	Integer System_zoneB_service_speedDifference__SEL_1_speedDifference = null;
	Float System_zoneB_service_currentSpeed__accelerator1_decelerate_currentSpeed = null;
	Float System_zoneB_service_currentSpeed__accelerator2_accelerate_currentSpeed = null;
	Float accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed = null;

	/**
	 * Constructor of composite component ZoneB
	 */
	public ZoneB() {
		/* init data elements of this component */

		/* instantiate sub-component accelerator1 */
		this.accelerator1 = new AcceleratorImpl();
		/* instantiate sub-component accelerator2 */
		this.accelerator2 = new AcceleratorImpl();
	}

	/**
	 * Service zoneB_service of the system
	 */
	public Float zoneB_service(Integer speedDifference, Float currentSpeed) {
		this.activeServiceName = "zoneB_service";
		/* push data to channels */
		System_zoneB_service_speedDifference__SEL_1_speedDifference = speedDifference; /*
																						 * push
																						 * value
																						 * to
																						 * channel
																						 */
		System_zoneB_service_currentSpeed__accelerator1_decelerate_currentSpeed = currentSpeed; /*
																								 * push
																								 * value
																								 * to
																								 * channel
																								 */
		System_zoneB_service_currentSpeed__accelerator2_accelerate_currentSpeed = currentSpeed; /*
																								 * push
																								 * value
																								 * to
																								 * channel
																								 */
		/* invoke the top level connector */
		invokeSEL_1();
		/* pull data from channels */
		Float updatedSpeed = null;
		if (accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
		}
		if (accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed; /*
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
		Integer speedDifference = null;
		if (System_zoneB_service_speedDifference__SEL_1_speedDifference != null) {
			speedDifference = System_zoneB_service_speedDifference__SEL_1_speedDifference;
			System_zoneB_service_speedDifference__SEL_1_speedDifference = null;
		}
		if (speedDifference == 0) {
			invokeaccelerator1();
		}
		if (speedDifference == 1) {
			invokeaccelerator2();
		}
	}/*
	 * Invoking component instance accelerator1 in the system
	 */

	private void invokeaccelerator1() {
		if (this.activeServiceName == "zoneB_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneB_service_currentSpeed__accelerator1_decelerate_currentSpeed != null) {
				currentSpeed = System_zoneB_service_currentSpeed__accelerator1_decelerate_currentSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
			}
			/* Invoke the service */
			Float deceleratedSpeed = accelerator1.decelerate(currentSpeed);
			/* Push data to channels */
			accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed = deceleratedSpeed;
		}
	}/*
	 * Invoking component instance accelerator2 in the system
	 */

	private void invokeaccelerator2() {
		if (this.activeServiceName == "zoneB_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneB_service_currentSpeed__accelerator2_accelerate_currentSpeed != null) {
				currentSpeed = System_zoneB_service_currentSpeed__accelerator2_accelerate_currentSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
			}
			/* Invoke the service */
			Float acceleratedSpeed = accelerator2.accelerate(currentSpeed);
			/* Push data to channels */
			accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed = acceleratedSpeed;
		}
	}
}