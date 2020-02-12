package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractWateringTool;

public class Hose extends AbstractWateringTool {

	private int lengthInMeters;
	private int thicknessInMilimetres;
	private int diameterInCentimetres;

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
