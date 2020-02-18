package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.model.*;
import ua.lviv.iot.tools.Hose;
import ua.lviv.iot.tools.SubmersiblePump;
import ua.lviv.iot.tools.SurfacePump;
import ua.lviv.iot.tools.WateringFunnel;
import ua.lviv.iot.tools.WateringGun;


public abstract class AbstractWateringManagerTest {

	protected List<AbstractWateringTool> surfacePumps;
	protected List<AbstractWateringTool> submersiblePumps;
	protected List<AbstractWateringTool> wateringGuns;
	protected List<AbstractWateringTool> hoses;
	protected List<AbstractWateringTool> funnels;
	
	
	public void createSurfacePumps() {
		surfacePumps = new LinkedList<AbstractWateringTool>();
		
		surfacePumps.add(new SurfacePump(129.4, 15000, "Italy", 13, "steel", "AL-KO", 4.5, TypeOfPumpedLiquid.DIRTY, SuctionTypeName.SELF_SUCTION, 3));
		
		surfacePumps.add(new SurfacePump(0, 0, null, 0, null, null, 0, null, null, 0));
		
	}
	
	public void createSubmersiblePumps() {
		submersiblePumps = new LinkedList<AbstractWateringTool>();
		
		submersiblePumps.add(new SubmersiblePump(30, 1000, null, 3, null, null, 5, TypeOfPumpedLiquid.CLEAN, 5, 4));
		
		submersiblePumps.add(new SurfacePump(10, 0, null, 0, null, null, 0, null, null, 0));
		
	}
	
	public void createWateringGuns() {
		wateringGuns = new LinkedList<AbstractWateringTool>();
	
		wateringGuns.add(new WateringGun(40.6, 300, "Italy", 3, "plastic", "Karcher", WateringMode.JET));
		
		wateringGuns.add(new WateringGun(30.6, 200, "Polland", 2, "plastic", "brandName", WateringMode.JET));
		
	}
	
	public void createHoses() {
		hoses = new LinkedList<AbstractWateringTool>();
	
		hoses.add(new Hose(30.5, 200, "Polland", 4, "latex", null, 100, 30, 3));
		
		hoses.add(new Hose(22.5, 250, "Germany", 2, "PVH", null, 50, 20, 4));
		
		hoses.add(new Hose(16.5, 150, "Italy", 2, "PVH", null, 40, 10, 2));
		
	}
	
	public void createFunnels() {
		funnels = new LinkedList<AbstractWateringTool>();
	
		funnels.add(new WateringFunnel(20.5, 1000, "Ukraine", 1, "plastic", null, 3));
		
		funnels.add(new WateringFunnel(30.5, 1050, "Slovakia", 2, "steel", null, 2));
		
	}
	
	public void createAllTools() {
		createSurfacePumps();
		createSubmersiblePumps();
		createWateringGuns();
		createHoses();
		createFunnels();
	}
	

}
