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
        }

        else if (sortingType == SortingType.DESCENDING) {
            tools.sort(priceInUAHComparator.reversed());

        }

    }

    // static inner class sorting

    public static void sortToolsByWarrantyPeriod(List<AbstractWateringTool> tools, SortingType sortingType) {
        if (sortingType == SortingType.ASCENDING) {
            tools.sort(new ToolsSorterByWarrantyPeriod());
        }

        else if (sortingType == SortingType.DESCENDING) {
            tools.sort(new ToolsSorterByWarrantyPeriod().reversed());
        }
    }

    // non static inner class sorting

    public static void sortToolsByWeightInGramms(List<AbstractWateringTool> tools, SortingType sortingType) {

        WateringManagerUtils managerUtils = new WateringManagerUtils();

        ToolsSorterByWeightInGramms sorterByWeightInGramms = managerUtils.new ToolsSorterByWeightInGramms();

        if (sortingType == SortingType.ASCENDING) {
            tools.sort(sorterByWeightInGramms);
        }

        else if (sortingType == SortingType.DESCENDING) {
            tools.sort(sorterByWeightInGramms.reversed());
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
