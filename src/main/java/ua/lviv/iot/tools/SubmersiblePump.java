package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractPump;
import ua.lviv.iot.model.TypeOfPumpedLiquid;

public class SubmersiblePump extends AbstractPump {
    private double productivityInLitresPerHour;
    private int maxPreasureInBars;

    public String getHeaders() {
        return super.getHeaders() + "productivityInLitresPerHour, maxPreasureInMeters";
    }

    public String toCSV() {
        return super.toCSV() + ", " + productivityInLitresPerHour + ", " + maxPreasureInBars;
    }

    public SubmersiblePump(double priceInUAH, int weightInKilograms, String countryWhereCreated,
            int warrantyPeriodInMonths, String bodyMaterial, String brand, double powerInKilowatts,
            TypeOfPumpedLiquid typeOfPumpedLiquid, double productivityInLitresPerHour, int maxPreasureInMeters) {
        super(priceInUAH, weightInKilograms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand,
                powerInKilowatts, typeOfPumpedLiquid);
        this.productivityInLitresPerHour = productivityInLitresPerHour;
        this.maxPreasureInBars = maxPreasureInMeters;
    }

    public double getProductivityInLitresPerHour() {
        return productivityInLitresPerHour;
    }

    public void setProductivityInLitresPerHour(double productivityInLitresPerHour) {
        this.productivityInLitresPerHour = productivityInLitresPerHour;
    }

    public int getMaxPreasureInMeters() {
        return maxPreasureInBars;
    }

    public void setMaxPreasureInMeters(int maxPreasureInMeters) {
        this.maxPreasureInBars = maxPreasureInMeters;
    }

}
