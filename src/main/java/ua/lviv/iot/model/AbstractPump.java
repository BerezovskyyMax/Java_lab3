package ua.lviv.iot.model;

public abstract class AbstractPump extends AbstractWateringTool {

	protected double powerInKilowatts;
	protected TypeOfPumpedLiquid typeOfPumpedLiquid;
	
	
	
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

	public AbstractPump(double priceInUAH, int weightInKilograms, String countryWhereCreated,
			int warrantyPeriodInMonths, String bodyMaterial, String brand, double powerInKilowatts,
			TypeOfPumpedLiquid typeOfPumpedLiquid) {
		super(priceInUAH, weightInKilograms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
		this.powerInKilowatts = powerInKilowatts;
		this.typeOfPumpedLiquid = typeOfPumpedLiquid;
	}
	
	void turnOn() {
		
	}

	void turnOf() {
		
	}
	
	void connectHose(int lengthInMeters, int diameterInCentimetres) {
		
	}
	
	
}
