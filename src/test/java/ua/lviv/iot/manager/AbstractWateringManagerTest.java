package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.model.*;
import ua.lviv.iot.tools.Hose;
import ua.lviv.iot.tools.Pump;
import ua.lviv.iot.tools.WateringFunnel;
import ua.lviv.iot.tools.WateringGun;


public abstract class AbstractWateringManagerTest {

	protected List<AbstractWateringTool> pumps;
	protected List<AbstractWateringTool> wateringGuns;
	protected List<AbstractWateringTool> hoses;
	protected List<AbstractWateringTool> funnels;

	public void createPump() {
		pumps = new LinkedList<AbstractWateringTool>();
		
		
		pumps.add(new Pump(150.6, 10000, "Germany", 12, "iron", "Karcher", 4.4, TypeOfPumpedLiquid.DIRTY,
				SuctionTypeName.SELF_SUCTION, 6.7));
		
		pumps.add(new Pump(200.56, 15000, "Italy", 13, "steel", "AL-KO", 4.4, TypeOfPumpedLiquid.CLEAN,
				SuctionTypeName.CENTERED, 7.7));
		
	}
	
	public void createWateringGun() {
		wateringGuns = new LinkedList<AbstractWateringTool>();
	
		wateringGuns.add(new WateringGun(40.6, 300, "Italy", 3, "plastic", "Karcher", WateringMode.JET));
		
		wateringGuns.add(new WateringGun(30.6, 200, "Polland", 2, "plastic", "brandName", WateringMode.JET));
		
	}
	
	public void createHose() {
		hoses = new LinkedList<AbstractWateringTool>();
	
		hoses.add(new Hose(30.5, 200, "Polland", 4, "latex", null, 100, 30, 3));
		
		hoses.add(new Hose(22.5, 250, "Germny", 2, "PVH", null, 50, 20, 4));
		
	}
	
	public void createFunnel() {
		funnels = new LinkedList<AbstractWateringTool>();
	
		funnels.add(new WateringFunnel(20.5, 1000, "Ukraine", 1, "plastic", null, 3));
		
		funnels.add(new WateringFunnel(30.5, 1050, "Slovakia", 2, "steel", null, 2));
		
	}
	

}
