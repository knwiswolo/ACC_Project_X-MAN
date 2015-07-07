/**
		* this is implementation of composite component InitializationComponent  in Java
		*/
			
		package acc_system;
		
		import java.util.*;
		
		public final class  InitializationComponent {
		/*
     	* Active service pointer
     	*/
		private String activeServiceName = null;

		/*
	 	* Component instances declaration
	 	*/
private RadarSimulator radarSimulator;private SpeedSensor speedSensor;/*
* Data channel variable declaration
*/	
Float radarSimulator_simulateInitialClearance_initialClearance__initializationComponent_initializationService_initialClearance = null;
Float speedSensor_generateSpeed_initialSpeed__initializationComponent_initializationService_initialSpeed = null;
/**
 * Constructor of composite component InitializationComponent
 */
public InitializationComponent() {
	/* init data elements of this component */

/* instantiate sub-component radarSimulator */
this.radarSimulator = new RadarSimulatorImpl();
/* instantiate sub-component speedSensor */
this.speedSensor = new SpeedSensorImpl();
}/**
				* Service initializationService of the system
				*/public  Map<String, Object> initializationService( ) {Map<String, Object> returnValues = new HashMap<String, Object>();
this.activeServiceName = "initializationService";
    		/* push data to channels */

/* invoke the top level connector*/
invokeSEQUENCER();
/* pull data from channels*/
Float initialClearance = null;if (radarSimulator_simulateInitialClearance_initialClearance__initializationComponent_initializationService_initialClearance != null) {
								 initialClearance = radarSimulator_simulateInitialClearance_initialClearance__initializationComponent_initializationService_initialClearance; /* pull value from channel */
								 returnValues.put("initialClearance", initialClearance);
							}Float initialSpeed = null;if (speedSensor_generateSpeed_initialSpeed__initializationComponent_initializationService_initialSpeed != null) {
								 initialSpeed = speedSensor_generateSpeed_initialSpeed__initializationComponent_initializationService_initialSpeed; /* pull value from channel */
								 returnValues.put("initialSpeed", initialSpeed);
							}return returnValues;
    			}/*
	 				* Invoking connector SEQUENCER of the system
					*/private void invokeSEQUENCER() {invokeradarSimulator();invokespeedSensor();}/*
	 				* Invoking component instance radarSimulator in the system
					*/
					private void invokeradarSimulator() {if (this.activeServiceName == "initializationService") {
/* pull data from channels*/

/* Invoke the service */
Float initialClearance = 
								radarSimulator.simulateInitialClearance(
 );
/* Push data to channels */
radarSimulator_simulateInitialClearance_initialClearance__initializationComponent_initializationService_initialClearance = initialClearance
;
}}/*
	 				* Invoking component instance speedSensor in the system
					*/
					private void invokespeedSensor() {if (this.activeServiceName == "initializationService") {
/* pull data from channels*/

/* Invoke the service */
Float initialSpeed = 
								speedSensor.generateSpeed(
 );
/* Push data to channels */
speedSensor_generateSpeed_initialSpeed__initializationComponent_initializationService_initialSpeed = initialSpeed
;
}}}