package ua.lviv.iot.model;

public abstract class AbstractWateringTool {

    protected double priceInUAH;
    protected int weightInGramms;
    protected String countryWhereCreated;
    protected int warrantyPeriodInMonths;
    protected String bodyMaterial;
    protected String brand;

    public String getHeaders() {
        return "priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand";
    }

    public String toCSV() {
        return priceInUAH + ", " + weightInGramms + ", " + countryWhereCreated + ", " + warrantyPeriodInMonths + ", "
                + bodyMaterial + ", " + brand;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getWeightInGramms() {
        return weightInGramms;
    }

    public void setWeightInGramms(int weightInGramms) {
        this.weightInGramms = weightInGramms;
    }

    public String getCountryWhereCreated() {
        return countryWhereCreated;
    }

    public void setCountryWhereCreated(String countryWhereCreated) {
        this.countryWhereCreated = countryWhereCreated;
    }

    public int getWarrantyPeriodInMonths() {
        return warrantyPeriodInMonths;
    }

    public void setWarrantyPeriodInMonths(int warrantyPeriodInMonths) {
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public AbstractWateringTool(double priceInUAH, int weightInKilograms, String countryWhereCreated,
            int warrantyPeriodInMonths, String bodyMaterial, String brand) {
        this.priceInUAH = priceInUAH;
        this.weightInGramms = weightInKilograms;
        this.countryWhereCreated = countryWhereCreated;
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
        this.bodyMaterial = bodyMaterial;
        this.brand = brand;
    }

}
