package avajlauncher.aircrafts;

import avajlauncher.Aircraft;
import avajlauncher.Coordinates;

public class JetPlane extends Aircraft {
	public JetPlane(long id, String name, Coordinates coordinates) {
		super(id, name, coordinates);
	}

	@Override
	public void updateConditions() {
		// TODO: Implement
		throw new UnsupportedOperationException("Unimplemented method 'updateConditions'");
	}
}
