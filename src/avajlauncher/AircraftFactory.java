package avajlauncher;

import avajlauncher.aircrafts.Balloon;
import avajlauncher.aircrafts.Helicopter;
import avajlauncher.aircrafts.JetPlane;

class AircraftFactory {
	private static final long INIT_ID = 0;

	private static AircraftFactory instance;
	private long lastId;

	private AircraftFactory() {
		lastId = INIT_ID;
	}

	public static AircraftFactory getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}

		return instance;
	}

	Flyable newAircraft(String type, String name, Coordinates coordinates) {
		Flyable aircraft;

		switch (type) {
			case "Balloon": {
				aircraft = new Balloon(lastId, name, coordinates);
				break;
			}
			case "Helicopter": {
				aircraft = new Helicopter(lastId, name, coordinates);
				break;
			}
			case "JetPlane": {
				aircraft = new JetPlane(lastId, name, coordinates);
				break;
			}
			default: {
				throw new UnsupportedOperationException(String.format("Invalid vehicle type: '%s'", type));
			}
		}

		++lastId;

		return aircraft;
	}
}
