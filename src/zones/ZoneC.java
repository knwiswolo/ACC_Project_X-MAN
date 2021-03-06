/**
 * this is implementation of composite component ZoneC  in Java
 */

package zones;

import actuators.Accelerator;
import actuators_impl.AcceleratorImpl;
import simulators.SpeedSensor;
import simulators_impl.SpeedSensorImpl;

public final class ZoneC {
	/*
	 * Active service pointer
	 */
	private String activeServiceName = null;

	/*
	 * Component instances declaration
	 */
	private SpeedSensor speedSensor;
	private Accelerator accelerator1;
	private Accelerator accelerator2;/*
									 * Data channel variable declaration
									 */
	Integer System_zoneC_service_speedDifference__SEL_1_speedDifference = null;
	Float System_zoneC_service_currentSpeed__accelerator2_accelerate_currentSpeed = null;
	Float System_zoneC_service_currentSpeed__accelerator1_decelerate_currentSpeed = null;
	Float System_zoneC_service_currentSpeed__speedSensor_updateSpeed_speed = null;
	Float System_zoneC_service_cruisingSpeed__accelerator2_accelerate_cruisingSpeed = null;
	Float System_zoneC_service_cruisingSpeed__accelerator1_decelerate_cruisingSpeed = null;
	Float accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float speedSensor_updateSpeed_updatedSpeed__System_updatedSpeed_updatedSpeed = null;

	/**
	 * Constructor of composite component ZoneC
	 */
	public ZoneC() {
		/* init data elements of this component */

		/* instantiate sub-component speedSensor */
		this.speedSensor = new SpeedSensorImpl();
		/* instantiate sub-component accelerator1 */
		this.accelerator1 = new AcceleratorImpl();
		/* instantiate sub-component accelerator2 */
		this.accelerator2 = new AcceleratorImpl();
	}

	/**
	 * Service zoneC_service of the system
	 */
	public Float zoneC_service(Integer speedDifference, Float currentSpeed,
			Float cruisingSpeed) {
		this.activeServiceName = "zoneC_service";
		/* push data to channels */
		System_zoneC_service_speedDifference__SEL_1_speedDifference = speedDifference; /*
																						 * push
																						 * value
																						 * to
																						 * channel
																						 */
		System_zoneC_service_currentSpeed__accelerator2_accelerate_currentSpeed = currentSpeed; /*
																								 * push
																								 * value
																								 * to
																								 * channel
																								 */
		System_zoneC_service_currentSpeed__accelerator1_decelerate_currentSpeed = currentSpeed; /*
																								 * push
																								 * value
																								 * to
																								 * channel
																								 */
		System_zoneC_service_currentSpeed__speedSensor_updateSpeed_speed = currentSpeed; /*
																						 * push
																						 * value
																						 * to
																						 * channel
																						 */
		System_zoneC_service_cruisingSpeed__accelerator2_accelerate_cruisingSpeed = cruisingSpeed; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		System_zoneC_service_cruisingSpeed__accelerator1_decelerate_cruisingSpeed = cruisingSpeed; /*
																									 * push
																									 * value
																									 * to
																									 * channel
																									 */
		/* invoke the top level connector */
		invokeSEL_1();
		/* pull data from channels */
		Float updatedSpeed = null;
		if (accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
		}
		if (accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
		}
		if (speedSensor_updateSpeed_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = speedSensor_updateSpeed_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
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
		if (System_zoneC_service_speedDifference__SEL_1_speedDifference != null) {
			speedDifference = System_zoneC_service_speedDifference__SEL_1_speedDifference;
			System_zoneC_service_speedDifference__SEL_1_speedDifference = null;
		}
		if (speedDifference == 0) {
			invokeaccelerator1();
		}
		if (speedDifference == 1) {
			invokeaccelerator2();
		}
		if (speedDifference == 2) {
			invokespeedSensor();
		}
	}/*
	 * Invoking component instance speedSensor in the system
	 */

	private void invokespeedSensor() {
		if (this.activeServiceName == "zoneC_service") {
			/* pull data from channels */
			Float speed = null;
			if (System_zoneC_service_currentSpeed__speedSensor_updateSpeed_speed != null) {
				speed = System_zoneC_service_currentSpeed__speedSensor_updateSpeed_speed; /*
																						 * pull
																						 * value
																						 * from
																						 * channel
																						 */
			}
			/* Invoke the service */
			Float updatedSpeed = speedSensor.updateSpeed(speed);
			/* Push data to channels */
			speedSensor_updateSpeed_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}/*
	 * Invoking component instance accelerator1 in the system
	 */

	private void invokeaccelerator1() {
		if (this.activeServiceName == "zoneC_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneC_service_currentSpeed__accelerator1_decelerate_currentSpeed != null) {
				currentSpeed = System_zoneC_service_currentSpeed__accelerator1_decelerate_currentSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
			}
			Float cruisingSpeed = null;
			if (System_zoneC_service_cruisingSpeed__accelerator1_decelerate_cruisingSpeed != null) {
				cruisingSpeed = System_zoneC_service_cruisingSpeed__accelerator1_decelerate_cruisingSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			/* Invoke the service */
			Float deceleratedSpeed = accelerator1.decelerate(currentSpeed,
					cruisingSpeed);
			/* Push data to channels */
			accelerator1_decelerate_deceleratedSpeed__System_updatedSpeed_updatedSpeed = deceleratedSpeed;
		}
	}/*
	 * Invoking component instance accelerator2 in the system
	 */

	private void invokeaccelerator2() {
		if (this.activeServiceName == "zoneC_service") {
			/* pull data from channels */
			Float currentSpeed = null;
			if (System_zoneC_service_currentSpeed__accelerator2_accelerate_currentSpeed != null) {
				currentSpeed = System_zoneC_service_currentSpeed__accelerator2_accelerate_currentSpeed; /*
																										 * pull
																										 * value
																										 * from
																										 * channel
																										 */
			}
			Float cruisingSpeed = null;
			if (System_zoneC_service_cruisingSpeed__accelerator2_accelerate_cruisingSpeed != null) {
				cruisingSpeed = System_zoneC_service_cruisingSpeed__accelerator2_accelerate_cruisingSpeed; /*
																											 * pull
																											 * value
																											 * from
																											 * channel
																											 */
			}
			/* Invoke the service */
			Float acceleratedSpeed = accelerator2.accelerate(currentSpeed,
					cruisingSpeed);
			/* Push data to channels */
			accelerator2_accelerate_acceleratedSpeed__System_updatedSpeed_updatedSpeed = acceleratedSpeed;
		}
	}
}