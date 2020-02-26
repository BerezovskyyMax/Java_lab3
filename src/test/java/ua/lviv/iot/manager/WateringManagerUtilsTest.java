
package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.SortingType;

public class WateringManagerUtilsTest extends AbstractWateringManagerTest {

	@Test
	public void testSortingDescending() {
		createAllTools();

		WateringManagerUtils.sortToolsByWarrantyPeriod(hoses, SortingType.DESCENDING);
		assertEquals(7, hoses.get(0).getWarrantyPeriodInMonths());
		WateringManagerUtils.sortToolsByPriceInUAH(hoses, SortingType.DESCENDING);
		assertEquals(30.5, hoses.get(0).getPriceInUAH());
		WateringManagerUtils.sortToolsByWeightInGramms(hoses, SortingType.DESCENDING);
		assertEquals(250, hoses.get(0).getWeightInGramms());

	}

	@Test
	public void testSortingAscending() {
		createAllTools();

		WateringManagerUtils.sortToolsByWarrantyPeriod(hoses, SortingType.ASCENDING);
		assertEquals(2, hoses.get(0).getWarrantyPeriodInMonths());
		WateringManagerUtils.sortToolsByPriceInUAH(hoses, SortingType.ASCENDING);
		assertEquals(16.5, hoses.get(0).getPriceInUAH());
		WateringManagerUtils.sortToolsByWeightInGramms(hoses, SortingType.ASCENDING);
		assertEquals(150, hoses.get(0).getWeightInGramms());
		WateringManagerUtils.sortToolsBycountryWhereCreatedNaturalOrder(hoses);
		assertEquals("A", hoses.get(0).getCountryWhereCreated());

		System.out.println("");
		System.out.println("");
	}

}
