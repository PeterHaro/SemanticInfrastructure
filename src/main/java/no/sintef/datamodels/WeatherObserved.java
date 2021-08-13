package no.sintef.datamodels;

import no.sintef.datamodels.generic.Location;

public class WeatherObserved {
	
	private String id;
	private String type;
	private String source;
	private String dateCreated;
	private String dateObserved;
	private double temperature;
	private double precipitation;
	private double windDirection;
	private double windSpeed;
	private Location location;
	
	private WeatherObserved (WeatherObservedBuilder builder) {

		this.id = builder.id;
		this.type = builder.type;
		this.source = builder.source;
		this.dateCreated = builder.dateCreated;
		this.dateObserved = builder.dateObserved;
		this.temperature = builder.temperature;
		this.precipitation = builder.precipitation;
		this.windDirection = builder.windDirection;
		this.windSpeed = builder.windSpeed;
		this.location = builder.location;

	}
	
	public static class WeatherObservedBuilder {
		
		private String id;
		private String type;
		private String source;
		private String dateCreated;
		private String dateObserved;
		private double temperature;
		private double precipitation;
		private double windDirection;
		private double windSpeed;
		private Location location;
		
		public WeatherObservedBuilder() {}

		public WeatherObservedBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public WeatherObservedBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public WeatherObservedBuilder setSource(String source) {
			this.source = source;
			return this;
		}

		public WeatherObservedBuilder setDateCreated(String dateCreated) {
			this.dateCreated = dateCreated;
			return this;
		}

		public WeatherObservedBuilder setDateObserved(String dateObserved) {
			this.dateObserved = dateObserved;
			return this;
		}

		public WeatherObservedBuilder setTemperature(double temperature) {
			this.temperature = temperature;
			return this;
		}

		public WeatherObservedBuilder setPrecipitation(double precipitation) {
			this.precipitation = precipitation;
			return this;
		}

		public WeatherObservedBuilder setWindDirection(double windDirection) {
			this.windDirection = windDirection;
			return this;
		}

		public WeatherObservedBuilder setWindSpeed(double windSpeed) {
			this.windSpeed = windSpeed;
			return this;
		}

		public WeatherObservedBuilder setLocation(Location location) {
			this.location = location;
			return this;
		}
		
		public WeatherObserved build() {
			return new WeatherObserved(this);
		}
		
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getSource() {
		return source;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public String getDateObserved() {
		return dateObserved;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public double getWindDirection() {
		return windDirection;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public Location getLocation() {
		return location;
	}
	
	

}
