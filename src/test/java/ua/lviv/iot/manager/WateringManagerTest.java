package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.WateringManager;
import ua.lviv.iot.manager.WateringManagerUtils;
import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SortingType;
import ua.lviv.iot.tools.*;

class WateringManagerTest extends AbstractWateringManagerTest{

	private Pump pump;
	
	@BeforeEach
	public void setUp() {
		pump = new Pump(0, 0, null, 0, null, null, 0, null, null, 0);
	}
	
	@Test
	public void testSearch() {
		List<AbstractWateringTool> tools = null;
		double priceInUAH = 0.0;
		WateringManagerUtils.findToolsCheaperThan(tools, priceInUAH);
	}
	

}
