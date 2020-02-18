package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.WateringManager;
import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SortingType;
import ua.lviv.iot.model.TypeOfPumpedLiquid;
import ua.lviv.iot.tools.*;

class WateringManagerTest extends AbstractWateringManagerTest{
	
	private WateringManager wateringManager;
	
	@BeforeEach
	public void setUp() {
		wateringManager = new WateringManager();
		
		createAllTools();
		
		wateringManager.addTools(surfacePumps);
		wateringManager.addTools(submersiblePumps);
		wateringManager.addTools(wateringGuns);
		wateringManager.addTools(hoses);
		wateringManager.addTools(funnels);
		
	}
	
	@Test
	public void testFindToolsCheaperThan() {
		List<AbstractWateringTool> foundTools = wateringManager.findToolsCheaperThan(20.30);
		
		assertEquals(3, foundTools.size());
	}
	
	@Test
	public void testFindToolsByWarrantyPeriod() {
		List<AbstractWateringTool> foundTools = wateringManager.findToolsByWarrantyPeriod(14);
		
		assertEquals(0, foundTools.size());
	}

}
