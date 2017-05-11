package model;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.format.number.money.CurrencyUnitFormatter;
import org.springframework.stereotype.Component;

@Component
public class Stock {
	Map<Resources, Double> countOfResoursces;

	public Stock() {
		countOfResoursces = new EnumMap<>(Resources.class);
	}	

	public void addToStoredResources(Resources r, double quantity) {
		double currentBalance = countOfResoursces.get(r);
		countOfResoursces.put(r, currentBalance + quantity);
	}

	public boolean pickUpStoredResources(Resources r, double quantity) {
		double currentBalance = countOfResoursces.get(r);
		if (currentBalance > quantity) {
			countOfResoursces.put(r, currentBalance - quantity);
			return true;
		} else
			return false;
	}

	public String toString() {
		return countOfResoursces.toString();
	}
}
