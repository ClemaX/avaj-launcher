package avajlauncher.aircrafts;

import avajlauncher.Aircraft;
import avajlauncher.Coordinates;

public class Balloon extends Aircraft {
	public Balloon(long id, String name, Coordinates coordinates) {
		super(id, name, coordinates);
	}

	@Override
	public void updateConditions() {
		// TODO: Implement
		throw new UnsupportedOperationException("Unimplemented method 'updateConditions'");
	}
}
