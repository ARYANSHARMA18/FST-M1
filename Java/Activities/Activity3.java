package activities;

public class Activity3 {
	public static void main(String[] args) {
		System.out.println(adjustDevice("THERMOSTAT",40));
	}

	public static String adjustDevice(String device, int value) {
		String status = switch(device) {
		case null -> "Invlaid device type";
		case String d when d.equals("THERMOSTAT") && value > 40 -> 
		    "[Thermostat] Warning: Temperature high.";		
		case "THERMOSTAT" -> "[Thermostat] Temperature is set to " + value;
		case "LIGHT" -> "[Light] Adjusting brightness to " + value + "%";
		default -> "Unknown device given";
	};
		
		return status;
	}
}
