package avajlauncher;

class WeatherProvider {
	private static WeatherProvider instance;
	private String weather[];

	public String getCurrentWeather(Coordinates position) {
		// TODO: Implement
		throw new UnsupportedOperationException("Unimplemented method 'updateConditions'");

	}

	private WeatherProvider() {
	}

	public static WeatherProvider getInstance() {
		if (instance == null) {
			instance = new WeatherProvider();
		}

		return instance;
	}
}
