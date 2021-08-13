package no.sintef.datamodels.generic;

public class Location {
	
	private String type;
	private double longitude;
	private double latitude;
	
	private Location (LocationBuilder builder) {
		
		this.type = builder.type;
		this.longitude = builder.longitude;
		this.latitude = builder.latitude;
		
	}
		
	public static class LocationBuilder {
		
		private String type;
		private double longitude;
		private double latitude;
		
		public LocationBuilder() {}

		public LocationBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public LocationBuilder setLongitude(double longitude) {
			this.longitude = longitude;
			return this;
		}

		public LocationBuilder setLatitude(double latitude) {
			this.latitude = latitude;
			return this;
		}
		
		public Location build() {
			return new Location(this);
		}

	}

	public String getType() {
		return type;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}
	
	

}
