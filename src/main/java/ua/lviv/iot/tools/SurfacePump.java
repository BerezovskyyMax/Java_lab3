package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SuctionTypeName;
import ua.lviv.iot.model.TypeOfPumpedLiquid;

public class SurfacePump extends AbstractWateringTool {

    private double powerInKilowatts;
    private TypeOfPumpedLiquid typeOfPumpedLiquid;
    private SuctionTypeName suctionTypeName;

    public String getHeaders() {
        return super.getHeaders() + "powerInKilowatts, typeOfPumpedLiquid, suctionTypeName";
    }

    public String toCSV() {
        return super.toCSV() + ", " + powerInKilowatts + ", " + typeOfPumpedLiquid + ", " + suctionTypeName;
    }

    public double getPowerInKilowatts() {
        return powerInKilowatts;
    }

    public void setPowerInKilowatts(double powerInKilowatts) {
        this.powerInKilowatts = powerInKilowatts;
    }

    public TypeOfPumpedLiquid getTypeOfPumpedLiquid() {
        return typeOfPumpedLiquid;
    }

    public void setTypeOfPumpedLiquid(TypeOfPumpedLiquid typeOfPumpedLiquid) {
        this.typeOfPumpedLiquid = typeOfPumpedLiquid;
    }

    public SuctionTypeName getSuctionTypeName() {
        return suctionTypeName;
    }

    public void setSuctionTypeName(SuctionTypeName suctionTypeName) {
        this.suctionTypeName = suctionTypeName;
    }

    public double getWorkingPreasureInBars() {
        return workingPreasureInBars;
    }

    public void setWorkingPreasureInBars(double workingPreasureInBars) {
        this.workingPreasureInBars = workingPreasureInBars;
    }

    private double workingPreasureInBars;

    public SurfacePump(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
            String bodyMaterial, String brand, double powerInKilowatts, TypeOfPumpedLiquid typeOfPumpedLiquid,
            SuctionTypeName suctionTypeName, double workingPreasureInBars) {
        super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
        this.powerInKilowatts = powerInKilowatts;
        this.typeOfPumpedLiquid = typeOfPumpedLiquid;
        this.suctionTypeName = suctionTypeName;
        this.workingPreasureInBars = workingPreasureInBars;
    }

}
