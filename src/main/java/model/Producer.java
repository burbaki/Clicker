package model;

import java.util.Map;

public class Producer {
	String name;
	double costMultiplier;
	double basicCost;
	// Resources it's type of resources, and value it's count of consume or product resources
	Map<Resources, Double> resOutput;
	Map<Resources, Double> resInput;
	
}
