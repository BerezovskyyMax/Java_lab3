package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.model.AbstractWateringTool;

public class WateringManager {

	private List<AbstractWateringTool> tools = new LinkedList<>();

	public void addTools(List<AbstractWateringTool> tools) {

		this.tools.addAll(tools);
	}

	public void addTool(AbstractWateringTool tool) {

		this.tools.add(tool);
	}

	public List<AbstractWateringTool> findToolsCheaperThan(double priceInUAH) {
		List<AbstractWateringTool> result = new LinkedList<>();

		for (AbstractWateringTool currentTool : tools) {
			if (currentTool.getPriceInUAH() < priceInUAH) {
				result.add(currentTool);
			}
		}
		return result;
	}

	public List<AbstractWateringTool> findToolsByWarrantyPeriod(int warrantyPeriodInMonths) {
		List<AbstractWateringTool> result = new LinkedList<>();

		for (AbstractWateringTool currentTool : tools) {
			if (currentTool.getWarrantyPeriodInMonths() == warrantyPeriodInMonths) {
				result.add(currentTool);
			}
		}
		return result;
	}

}
