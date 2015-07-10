/**
 * this is implementation of composite component ACCSystem  in Java
 */

package acc_system;

import initialization_component.InitializationComponent;

import java.util.*;

import simulators.SpeedSensor;
import simulators_impl.SpeedSensorImpl;
import speed_control.SpeedControl;

public final class ACCSystem {
	/*
	 * Active service pointer
	 */
	private String activeServiceName = null;

	/*
	 * Component instances declaration
	 */
	private InitializationComponent initializationComponent;
	private SpeedSensor speedSensor;
	private SpeedControl speedControl;/*
									 * Data channel variable declaration
									 */
	Float initializationComponent_initializationService_initialSpeed__speedSensor_calculateSpeedDifference_currentSpeed = null;
	Float initializationComponent_initializationService_initialClearance__speedControl_speedControl_service_clearance = null;
	Integer speedSensor_calculateSpeedDifference_speedDifference__speedControl_speedControl_service_speedDifference = null;
	Float System_acc_service_safetyDistance__speedControl_speedControl_service_safetyDistance = null;
	Float System_acc_service_cruisingSpeed__speedControl_speedControl_service_cruisingSpeed = null;
	Float System_acc_service_cruisingSpeed__speedSensor_calculateSpeedDifference_cruisingSpeed = null;
	Float speedControl_speedControl_service_updatedSpeed__System_updatedSpeed_updatedSpeed = null;
	Float initializationComponent_initializationService_initialSpeed__speedControl_speedControl_service_currentSpeed = null;

	/**
	 * Constructor of composite component ACCSystem
	 */
	public ACCSystem() {
		/* init data elements of this component */

		/* instantiate sub-component initializationComponent */
		this.initializationComponent = new InitializationComponent();
		/* instantiate sub-component speedSensor */
		this.speedSensor = new SpeedSensorImpl();
		/* instantiate sub-component speedControl */
		this.speedControl = new SpeedControl();
	}

	/**
	 * Service acc_service of the system
	 */
	public Float acc_service(Float safetyDistance, Float cruisingSpeed) {
		this.activeServiceName = "acc_service";
		/* push data to channels */
		System_acc_service_safetyDistance__speedControl_speedControl_service_safetyDistance = safetyDistance; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		System_acc_service_cruisingSpeed__speedControl_speedControl_service_cruisingSpeed = cruisingSpeed; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		System_acc_service_cruisingSpeed__speedSensor_calculateSpeedDifference_cruisingSpeed = cruisingSpeed; /*
																											 * push
																											 * value
																											 * to
																											 * channel
																											 */
		/* invoke the top level connector */
		invokeSEQUENCER();
		/* pull data from channels */
		Float updatedSpeed = null;
		if (speedControl_speedControl_service_updatedSpeed__System_updatedSpeed_updatedSpeed != null) {
			updatedSpeed = speedControl_speedControl_service_updatedSpeed__System_updatedSpeed_updatedSpeed; /*
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
		invokeinitializationComponent();
		invokespeedSensor();
		invokespeedControl();
	}/*
	 * Invoking component instance initializationComponent in the system
	 */

	private void invokeinitializationComponent() {
		if (this.activeServiceName == "acc_service") {
			/* pull data from channels */

			/* Invoke the service */
			Map<String, Object> vals = initializationComponent
					.initializationService();
			/* Push data to channels */
			initializationComponent_initializationService_initialClearance__speedControl_speedControl_service_clearance = (Float) vals
					.get("initialClearance");
			initializationComponent_initializationService_initialSpeed__speedSensor_calculateSpeedDifference_currentSpeed = (Float) vals
					.get("initialSpeed");
			initializationComponent_initializationService_initialSpeed__speedControl_speedControl_service_currentSpeed = (Float) vals
					.get("initialSpeed");
		}
	}/*
	 * Invoking component instance speedSensor in the system
	 */

	private void invokespeedSensor() {
		if (this.activeServiceName == "acc_service") {
			/* pull data from channels */
			Float cruisingSpeed = null;
			if (System_acc_service_cruisingSpeed__speedSensor_calculateSpeedDifference_cruisingSpeed != null) {
				cruisingSpeed = System_acc_service_cruisingSpeed__speedSensor_calculateSpeedDifference_cruisingSpeed; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Float currentSpeed = null;
			if (initializationComponent_initializationService_initialSpeed__speedSensor_calculateSpeedDifference_currentSpeed != null) {
				currentSpeed = initializationComponent_initializationService_initialSpeed__speedSensor_calculateSpeedDifference_currentSpeed; /*
																																			 * pull
																																			 * value
																																			 * from
																																			 * channel
																																			 */
			}
			/* Invoke the service */
			Integer speedDifference = speedSensor.calculateSpeedDifference(
					cruisingSpeed, currentSpeed);
			/* Push data to channels */
			speedSensor_calculateSpeedDifference_speedDifference__speedControl_speedControl_service_speedDifference = speedDifference;
		}
	}/*
	 * Invoking component instance speedControl in the system
	 */

	private void invokespeedControl() {
		if (this.activeServiceName == "acc_service") {
			/* pull data from channels */
			Float clearance = null;
			if (initializationComponent_initializationService_initialClearance__speedControl_speedControl_service_clearance != null) {
				clearance = initializationComponent_initializationService_initialClearance__speedControl_speedControl_service_clearance; /*
																																		 * pull
																																		 * value
																																		 * from
																																		 * channel
																																		 */
			}
			Float safetyDistance = null;
			if (System_acc_service_safetyDistance__speedControl_speedControl_service_safetyDistance != null) {
				safetyDistance = System_acc_service_safetyDistance__speedControl_speedControl_service_safetyDistance; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Integer speedDifference = null;
			if (speedSensor_calculateSpeedDifference_speedDifference__speedControl_speedControl_service_speedDifference != null) {
				speedDifference = speedSensor_calculateSpeedDifference_speedDifference__speedControl_speedControl_service_speedDifference; /*
																																			 * pull
																																			 * value
																																			 * from
																																			 * channel
																																			 */
			}
			Float cruisingSpeed = null;
			if (System_acc_service_cruisingSpeed__speedControl_speedControl_service_cruisingSpeed != null) {
				cruisingSpeed = System_acc_service_cruisingSpeed__speedControl_speedControl_service_cruisingSpeed; /*
																													 * pull
																													 * value
																													 * from
																													 * channel
																													 */
			}
			Float currentSpeed = null;
			if (initializationComponent_initializationService_initialSpeed__speedControl_speedControl_service_currentSpeed != null) {
				currentSpeed = initializationComponent_initializationService_initialSpeed__speedControl_speedControl_service_currentSpeed; /*
																																			 * pull
																																			 * value
																																			 * from
																																			 * channel
																																			 */
			}
			/* Invoke the service */
			Float updatedSpeed = speedControl.speedControl_service(clearance,
					safetyDistance, speedDifference, cruisingSpeed,
					currentSpeed);
			/* Push data to channels */
			speedControl_speedControl_service_updatedSpeed__System_updatedSpeed_updatedSpeed = updatedSpeed;
		}
	}
}