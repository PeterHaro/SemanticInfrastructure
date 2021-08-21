package no.sintef.datamodels.generic;

public class Location {
	
	private String type;
	private double[] coordinates;
	
	private Location (LocationBuilder builder) {
		
		this.type = builder.type;
		this.coordinates = builder.coordinates;
		
	}
		
	public static class LocationBuilder {
		
		private String type;
		private double[] coordinates;
		
		public LocationBuilder() {}

		public LocationBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public LocationBuilder setCoordinates(double[] coordinates) {
			this.coordinates = coordinates;
			return this;
		}
		
		public Location build() {
			return new Location(this);
		}

	}

	public String getType() {
		return type;
	}

	public double[] getCoordinates() {
		return coordinates;
	}


}
