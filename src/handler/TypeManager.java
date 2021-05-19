package handler;

public class TypeManager {
	public static double getMult(String P1Type, String P2Type) {
		double multiplier = 1;
		if (P1Type == "Water" && P2Type == "Fire") {
			multiplier = 1.25;
		}
		else if (P1Type == "Fire" && P2Type == "Grass") {
				multiplier = 1.25;
		}
		else if (P1Type == "Grass" && P2Type == "Water") {
				multiplier = 1.25;
		}
		return multiplier;
	}
	 


}
