package ua.lviv.iot.tools;

import ua.lviv.iot.model.AbstractPump;
import ua.lviv.iot.model.TypeOfPumpedLiquid;

public class SubmersiblePump extends AbstractPump {
	private double productivityInLitresPerHour;
	private int maxPreasureInMeters;

	public SubmersiblePump(double priceInUAH, int weightInKilograms, String countryWhereCreated,
			int warrantyPeriodInMonths, String bodyMaterial, String brand, double powerInKilowatts,
			TypeOfPumpedLiquid typeOfPumpedLiquid, double productivityInLitresPerHour, int maxPreasureInMeters) {
		super(priceInUAH, weightInKilograms, countryWhereCreated, warrantyPeriodInMonths, bodyMaterial, brand,
				powerInKilowatts, typeOfPumpedLiquid);
		this.productivityInLitresPerHour = productivityInLitresPerHour;
		this.maxPreasureInMeters = maxPreasureInMeters;
	}

	public double getProductivityInLitresPerHour() {
		return productivityInLitresPerHour;
	}

	public void setProductivityInLitresPerHour(double productivityInLitresPerHour) {
		this.productivityInLitresPerHour = productivityInLitresPerHour;
	}

	public int getMaxPreasureInMeters() {
		return maxPreasureInMeters;
	}

	public void setMaxPreasureInMeters(int maxPreasureInMeters) {
		this.maxPreasureInMeters = maxPreasureInMeters;
	}

}
