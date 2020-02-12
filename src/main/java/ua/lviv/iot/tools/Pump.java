package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;
import ua.lviv.iot.model.SuctionTypeName;
import ua.lviv.iot.model.TypeOfPumpedLiquid;

public class Pump extends AbstractWateringTool {

	private double powerInKilowatts;
	private TypeOfPumpedLiquid typeOfPumpedLiquid;
	private SuctionTypeName suctionTypeName;
	private double workingPreasureInBars;

	public Pump(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
			String bodyMaterial, String brand, double powerInKilowatts, TypeOfPumpedLiquid typeOfPumpedLiquid,
			SuctionTypeName suctionTypeName, double workingPreasureInBars) {
		super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
		this.powerInKilowatts = powerInKilowatts;
		this.typeOfPumpedLiquid = typeOfPumpedLiquid;
		this.suctionTypeName = suctionTypeName;
		this.workingPreasureInBars = workingPreasureInBars;
	}

}
