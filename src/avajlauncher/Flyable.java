package avajlauncher;

public abstract class Flyable {
	protected WeatherTower weatherTower;

	public abstract void updateConditions();

	public void registerTower(WeatherTower tower) {
		// TODO: Implement
	}
}
