package ua.lviv.iot.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SortingType;

public class WateringManagerUtils {

	// lambda sorting

	public static void sortToolsBycountryWhereCreatedNaturalOrder(List<AbstractWateringTool> tools) {

		Comparator<AbstractWateringTool> lambdaCountryWhereCreatedSorter = (AbstractWateringTool firstTool,
				AbstractWateringTool secondTool) -> firstTool.getCountryWhereCreated()
						.compareTo(secondTool.getCountryWhereCreated());

		tools.sort(lambdaCountryWhereCreatedSorter);
		for (AbstractWateringTool currentTool : tools) {
			System.out.println("country of creation of " + currentTool.getClass().getSimpleName() + " class: "
					+ currentTool.getCountryWhereCreated());
		}
	}

	// anonymous inner class sorting

	public static void sortToolsByPriceInUAH(List<AbstractWateringTool> tools, SortingType sortingType) {

		Comparator<AbstractWateringTool> priceInUAHComparator = new Comparator<AbstractWateringTool>() {

			@Override
			public int compare(AbstractWateringTool firstTool, AbstractWateringTool secondTool) {
				return (int) (firstTool.getPriceInUAH() - secondTool.getPriceInUAH());
			}
		};

		if (sortingType == SortingType.ASCENDING) {
			tools.sort(priceInUAHComparator);
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("price in UAH of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getPriceInUAH());
			}
		}

		else if (sortingType == SortingType.DESCENDING) {
			tools.sort(priceInUAHComparator.reversed());
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("price in UAH of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getPriceInUAH());
			}
		}

	}

	// static inner class sorting

	public static void sortToolsByWarrantyPeriod(List<AbstractWateringTool> tools, SortingType sortingType) {
		if (sortingType == SortingType.ASCENDING) {
			tools.sort(new ToolsSorterByWarrantyPeriod());
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("warranty period in months of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getWarrantyPeriodInMonths());
			}
		}

		else if (sortingType == SortingType.DESCENDING) {
			tools.sort(new ToolsSorterByWarrantyPeriod().reversed());
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("warranty period in months of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getWarrantyPeriodInMonths());
			}
		}
	}

	// non static inner class sorting

	public static void sortToolsByWeightInGramms(List<AbstractWateringTool> tools, SortingType sortingType) {

		WateringManagerUtils managerUtils = new WateringManagerUtils();

		ToolsSorterByWeightInGramms sorterByWeightInGramms = managerUtils.new ToolsSorterByWeightInGramms();

		if (sortingType == SortingType.ASCENDING) {
			tools.sort(sorterByWeightInGramms);
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("weight in gramms of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getWeightInGramms());
			}
		}

		else if (sortingType == SortingType.DESCENDING) {
			tools.sort(sorterByWeightInGramms.reversed());
			for (AbstractWateringTool currentTool : tools) {
				System.out.println("weight in gramms of " + currentTool.getClass().getSimpleName() + " class: "
						+ currentTool.getWeightInGramms());
			}
		}
	}

	private static class ToolsSorterByWarrantyPeriod implements Comparator<AbstractWateringTool>, Serializable {

		private static final long serialVersionUID = 1L;

		@Override
		public int compare(AbstractWateringTool firstTool, AbstractWateringTool secondTool) {
			return firstTool.getWarrantyPeriodInMonths() - secondTool.getWarrantyPeriodInMonths();
		}
	}

	private class ToolsSorterByWeightInGramms implements Comparator<AbstractWateringTool> {

		@Override
		public int compare(AbstractWateringTool firstTool, AbstractWateringTool secondTool) {
			return firstTool.getWeightInGramms() - secondTool.getWeightInGramms();
		}
	}

}
