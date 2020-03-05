package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.WateringMode;

public class WateringGun extends AbstractWateringTool {

    private WateringMode wateringMode;

    public String getHeaders() {
        return super.getHeaders() + "wateringMode";
    }

    public String toCSV() {
        return super.toCSV() + ", " + wateringMode;
    }

    void changeWatteringMode(WateringMode wateringMode) {
        System.out.println("watering mode changed!");
    }

    public WateringMode getWateringMode() {
        return wateringMode;
    }

    public void setWateringMode(WateringMode wateringMode) {
        this.wateringMode = wateringMode;
    }

    public WateringGun(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
            String bodyMaterial, String brand, WateringMode wateringMode) {
        super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
        this.wateringMode = wateringMode;
    }

}
