package no.sintef.datamodels;

import no.sintef.datamodels.generic.Location;

public class WaterQualityObserved {
	
	private String id;
	private String type;
	private String source;
	private String dateCreated;
	private String dateObserved;
	private double cod;
	private double conductivity;
	private double turbidity;
	private double temperature;
	private double ecoli;
	private Location location;
	
	private WaterQualityObserved (WaterQualityObservedBuilder builder) {

		this.id = builder.id;
		this.type = builder.type;
		this.source = builder.source;
		this.dateCreated = builder.dateCreated;
		this.dateObserved = builder.dateObserved;
		this.cod = builder.cod;
		this.conductivity = builder.conductivity;
		this.turbidity = builder.turbidity;
		this.temperature = builder.temperature;
		this.ecoli = builder.ecoli;
		this.location = builder.location;

	}
	
	public static class WaterQualityObservedBuilder {
		
		private String id;
		private String type;
		private String source;
		private String dateCreated;
		private String dateObserved;
		private double cod;
		private double conductivity;
		private double turbidity;
		private double temperature;
		private double ecoli;
		private Location location;

		public WaterQualityObservedBuilder() {}

		public WaterQualityObservedBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public WaterQualityObservedBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public WaterQualityObservedBuilder setSource(String source) {
			this.source = source;
			return this;
		}

		public WaterQualityObservedBuilder setDateCreated(String dateCreated) {
			this.dateCreated = dateCreated;
			return this;
		}

		public WaterQualityObservedBuilder setDateObserved(String dateObserved) {
			this.dateObserved = dateObserved;
			return this;
		}

		public WaterQualityObservedBuilder setCod(double cod) {
			this.cod = cod;
			return this;
		}

		public WaterQualityObservedBuilder setConductivity(double conductivity) {
			this.conductivity = conductivity;
			return this;
		}

		public WaterQualityObservedBuilder setTurbidity(double turbidity) {
			this.turbidity = turbidity;
			return this;
		}

		public WaterQualityObservedBuilder setTemperature(double temperature) {
			this.temperature = temperature;
			return this;
		}

		public WaterQualityObservedBuilder setEcoli(double ecoli) {
			this.ecoli = ecoli;
			return this;
		}

		public WaterQualityObservedBuilder setLocation(Location location) {
			this.location = location;
			return this;
		}
		
		public WaterQualityObserved build() {
			return new WaterQualityObserved(this);
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

	public double getCod() {
		return cod;
	}

	public double getConductivity() {
		return conductivity;
	}

	public double getTurbidity() {
		return turbidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getEcoli() {
		return ecoli;
	}

	public Location getLocation() {
		return location;
	}
	
	

}
