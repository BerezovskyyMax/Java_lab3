package ua.lviv.iot.model;

public abstract class AbstractWateringTool {

	private double priceInUAH;
	private int weightInGramms;
	private String countryWhereCreated;
	private int warrantyPeriodInMonths;
	private String bodyMaterial;
	private String brand;

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
