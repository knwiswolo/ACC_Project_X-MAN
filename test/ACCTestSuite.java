import static org.junit.Assert.*;
import initialization_component.InitializationComponent;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import simulators_impl.SpeedSensorImpl;
import speed_control.SpeedControl;
import acc_system.ACCSystem;
import actuators_impl.AcceleratorImpl;
import actuators_impl.BrakesImpl;
import zone_selector.ZoneSelector;
import control_system_impl.ZoneCalculatorImpl;


public class ACCTestSuite {
	/*	
	@Test
	public void testAcceleration(){
		AcceleratorImpl accelerator = new AcceleratorImpl();
		Float acceleratedSpeed = accelerator.accelerate((float)25.0, (float)30.0);
		
		assertEquals((float)30.0, acceleratedSpeed.floatValue(),0);
	}
	
	@Test
	public void testDeceleration(){
		AcceleratorImpl accelerator = new AcceleratorImpl();
		Float deceleratedSpeed = accelerator.decelerate((float)30.0, (float)25.0);
		
		assertEquals((float)25.0, deceleratedSpeed.floatValue(),0);
	}
	
	@Test
	public void testBrakeApplication(){
		BrakesImpl brakes = new BrakesImpl();
		Float speedAfterBrake = brakes.applyBrakes((float)30.0);
		
		assertEquals((float)15.0, speedAfterBrake.floatValue(),0);
	}
	
	@Test
	public void testEmergencyBrakeApplication(){
		BrakesImpl emergencyBrakes = new BrakesImpl();
		Float speedAfterEmergencyBrake = emergencyBrakes.applyEmergencyBrakes((float)30.0);
		
		assertEquals((float)0.0, speedAfterEmergencyBrake.floatValue(),0);
	}
	
	@Test
	public void testInitializationComponent(){
		InitializationComponent initializationComponent = new InitializationComponent();
		initializationComponent.initializationService();
				
		Map<String, Object> expectedValues = new HashMap<String, Object>();
		expectedValues.put("expectedRadarReading", (float)50);
		expectedValues.put("expectedSpeedGenerated", (float)60);
		
		assertEquals(50.0, ((Float)initializationComponent.initializationService().get("initialClearance")).floatValue(),0);
		assertEquals(60.0, ((Float)initializationComponent.initializationService().get("initialSpeed")).floatValue(),0);
	}
	
	@Test
	public void testZoneCalculator(){
		ZoneCalculatorImpl zoneCalculatorImpl = new ZoneCalculatorImpl();
		Integer calculatedZone = zoneCalculatorImpl.calculateZone((float)50.0, (float)74.0); // clearance | safetyDistance
		
		//Integer dangerZone = 1;
		Integer zoneA = 2;
		//Integer zoneB = 3;
		//Integer zoneC = 4;
		//Integer zoneD = 5;
		
		assertEquals(zoneA, calculatedZone);
	}
	
	@Test
	public void testZoneSelectorUpdatedSpeedOutput(){
		ZoneSelector zoneSelector = new ZoneSelector();
		Float updatedSpeed = zoneSelector.zoneSelector_service(1, 1, (float)60.0, (float)60.0); // zone | speedDifference | currentSpeed | cruisingSpeed
		
		assertEquals(0.0, updatedSpeed.floatValue(),0);
	}
	*/
	
//	@Test
//	public void speedControlDangerZone(){
//		SpeedControl speedControl = new SpeedControl();
//		Float clearance = (float)30.0;
//		Float safetyDistance = (float)45.0;
//		Float cruisingSpeed = (float)25.0;
//		Float currentSpeed = (float)10.0;
//		Integer speedDifference = 1;
//		
//		Float updatedSpeed = speedControl.speedControl_service(clearance, safetyDistance, speedDifference, cruisingSpeed, currentSpeed); // clearance | safetyDistance | speedDifference | cruisingSpeed | currentSpeed
//		
//		assertEquals((float)0.0, updatedSpeed.floatValue(),0);
//	}
	
//	@Test
//	public void speedControlZoneA(){
//		SpeedControl speedControl = new SpeedControl();
//		Float clearance = (float)30.0;
//		Float safetyDistance = (float)32.0;
//		Float cruisingSpeed = (float)25.0;
//		Float currentSpeed = (float)10.0;
//		Integer speedDifference = 1;
//		
//		Float updatedSpeed = speedControl.speedControl_service(clearance, safetyDistance, speedDifference, cruisingSpeed, currentSpeed); // clearance | safetyDistance | speedDifference | cruisingSpeed | currentSpeed
//		
//		assertEquals((float)25.0, updatedSpeed.floatValue(),0);
//	}
	
//	@Test
//	public void speedControlZoneB(){
//		SpeedControl speedControl = new SpeedControl();
//		Float clearance = (float)30.0;
//		Float safetyDistance = (float)25.0;
//		Float cruisingSpeed = (float)25.0;
//		Float currentSpeed = (float)10.0;
//		Integer speedDifference = 1;
//		
//		Float updatedSpeed = speedControl.speedControl_service(clearance, safetyDistance, speedDifference, cruisingSpeed, currentSpeed); // clearance | safetyDistance | speedDifference | cruisingSpeed | currentSpeed
//		
//		assertEquals((float)25.0, updatedSpeed.floatValue(),0);
//	}
//	
//	@Test
//	public void speedControlZoneC(){
//		SpeedControl speedControl = new SpeedControl();
//		Float clearance = (float)30.0;
//		Float safetyDistance = (float)15.0;
//		Float cruisingSpeed = (float)25.0;
//		Float currentSpeed = (float)25.0;
//		Integer speedDifference = 1;
//		
//		Float updatedSpeed = speedControl.speedControl_service(clearance, safetyDistance, speedDifference, cruisingSpeed, currentSpeed); // clearance | safetyDistance | speedDifference | cruisingSpeed | currentSpeed
//		
//		assertEquals((float)25.0, updatedSpeed.floatValue(),0);
//	}
	
//	@Test
//	public void speedControlZoneD(){
//		SpeedControl speedControl = new SpeedControl();
//		Float clearance = (float)30.0;
//		Float safetyDistance = (float)10.0;
//		Float cruisingSpeed = (float)25.0;
//		Float currentSpeed = (float)5.0;
//		Integer speedDifference = 1;
//		
//		Float updatedSpeed = speedControl.speedControl_service(clearance, safetyDistance, speedDifference, cruisingSpeed, currentSpeed); // clearance | safetyDistance | speedDifference | cruisingSpeed | currentSpeed
//		
//		assertEquals((float)25.0, updatedSpeed.floatValue(),0);
//	}
	
	@Test
	public void testACCSystem(){
		ACCSystem testSystem = new ACCSystem();
		
		Float safetyDistance = (float)5.0;
		Float cruisingSpeed = (float)25.0;
		
		Float driverInput = testSystem.acc_service(safetyDistance, cruisingSpeed); // safetyDistance | cruisingSpeed
		
		assertEquals((float)30.0, driverInput.floatValue(),0);
	}

}
