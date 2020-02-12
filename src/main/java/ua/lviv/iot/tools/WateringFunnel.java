package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;

public class WateringFunnel extends AbstractWateringTool{
	private int vollumeInLitres;

	public WateringFunnel(double priceInUAH, int weightInGramms, String countryWhereCreated,
			int warrantyPeriodInMonths, String bodyMaterial, String brand, int vollumeInLitres) {
		super(priceInUAH, weightInGramms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand);
		this.vollumeInLitres = vollumeInLitres;
	}
	
	public void refill() {
		
	}
	
	public void waterPlants(int vollumeInLitres) {
		
	}
}
