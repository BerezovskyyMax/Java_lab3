package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;

public class WateringFunnel extends AbstractWateringTool {
    private int vollumeInLitres;

    public String getHeaders() {
        return super.getHeaders() + "vollumeInLitres";
    }

    public String toCSV() {
        return super.toCSV() + ", " + vollumeInLitres;
    }

    public int getVollumeInLitres() {
        return vollumeInLitres;
    }

    public void setVollumeInLitres(int vollumeInLitres) {
        this.vollumeInLitres = vollumeInLitres;
    }

    public WateringFunnel(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
            String bodyMaterial, String brand, int vollumeInLitres) {
        super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
        this.vollumeInLitres = vollumeInLitres;
    }

    public void refill() {

    }

    public void waterPlants(int vollumeInLitres) {

    }
}
