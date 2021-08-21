package no.sintef.datamodels.generic;

public class Coordinate {
	
	private double latitude;
	private double longitude;
	
	private Coordinate (CoordinateBuilder builder) {
		
		this.latitude = builder.latitude;
		this.longitude = builder.longitude;
	}

	public static class CoordinateBuilder {
		
		private double latitude;
		private double longitude;
		
		public CoordinateBuilder() {}

		public CoordinateBuilder setLatitude(double latitude) {
			this.latitude = latitude;
			return this;
		}

		public CoordinateBuilder setLongitude(double longitude) {
			this.longitude = longitude;
			return this;
		}
		
		public Coordinate build() {
			return new Coordinate(this);
		}
		
		
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	
	
}
