import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import composite_components.InitializationComponent;


public class TestExample {
	
	/*
	@Test
	public void test() {
		int number = 10;
		
		//fail("Not yet implemented");
		assertEquals(10, number);
	}*/
	
	@Test
	public void testInitializationComponent(){
		
		InitializationComponent initializationComponent = new InitializationComponent();
		initializationComponent.initializationService();
		
		Map<String, Object> expectedValues = new HashMap<String, Object>();
		expectedValues.put("expectedRadarReading", (float)35);
		expectedValues.put("expectedSpeedGenerated", (float)60);
		
		assertEquals(35.0, ((Float)initializationComponent.initializationService().get("initialClearance")).floatValue(),0);
		assertEquals(60.0, ((Float)initializationComponent.initializationService().get("initialSpeed")).floatValue(),0);
		//boolean equal = expectedValues.equals(initializationComponent.initializationService().values());
		//assertEquals(equal, true);
	}

}
