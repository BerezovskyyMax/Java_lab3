
package ua.lviv.iot.manager;


import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.SortingType;

public class WateringManagerUtilsTest extends AbstractWateringManagerTest {
	
	@Test
	public void testSortingAscending() {
		WateringManagerUtils.sortToolsByWarrantyPeriod(surfacePumps, SortingType.ASCENDING);
		WateringManagerUtils.sortToolsByPrice(surfacePumps, SortingType.ASCENDING);
	}
	
	@Test
	public void testSortingDescending() {
		WateringManagerUtils.sortToolsByWarrantyPeriod(hoses, SortingType.DESCENDING);
		WateringManagerUtils.sortToolsByPrice(hoses, SortingType.DESCENDING);
	}
	
	
}
