package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;

public class Hose extends AbstractWateringTool {

    private int lengthInMeters;
    private int thicknessInMilimetres;
    private int diameterInCentimetres;

    public String getHeaders() {
        return super.getHeaders() + "lengthInMeters, thicknessInMilimetres, diameterInCentimetres";
    }

    public String toCSV() {
        return super.toCSV() + ", " + lengthInMeters + ", " + thicknessInMilimetres + ", " + diameterInCentimetres;
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    public int getThicknessInMilimetres() {
        return thicknessInMilimetres;
    }

    public void setThicknessInMilimetres(int thicknessInMilimetres) {
        this.thicknessInMilimetres = thicknessInMilimetres;
    }

    public int getDiameterInCentimetres() {
        return diameterInCentimetres;
    }

    public void setDiameterInCentimetres(int diameterInCentimetres) {
        this.diameterInCentimetres = diameterInCentimetres;
    }

    public Hose(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
            String bodyMaterial, String brand, int lengthInMeters, int thicknessInMilimetres,
            int diameterInCentimetres) {
        super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
        this.lengthInMeters = lengthInMeters;
        this.thicknessInMilimetres = thicknessInMilimetres;
        this.diameterInCentimetres = diameterInCentimetres;
    }

    public void connectAnotherHose(int lengthInMeters, int diameterInCentimetres) {
        System.out.println("Hose connected!");
    }

}
