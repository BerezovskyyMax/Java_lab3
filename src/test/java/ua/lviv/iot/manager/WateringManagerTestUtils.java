package ua.lviv.iot.manager;

import java.util.List;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SortingType;

public class WateringManagerTestUtils {

	@Test
	public void testSortingAscending() {
		List<AbstractWateringTool> tools = null;
		WateringManagerUtils.sortToolsByWarrantyPeriod(tools, SortingType.ASCENDING);
		WateringManagerUtils.sortToolsByPrice(tools, SortingType.ASCENDING);
	}
	
	@Test
	public void testSortingDescending() {
		List<AbstractWateringTool> tools = null;
		WateringManagerUtils.sortToolsByWarrantyPeriod(tools, SortingType.DESCENDING);
		WateringManagerUtils.sortToolsByPrice(tools, SortingType.DESCENDING);
	}
	
}
