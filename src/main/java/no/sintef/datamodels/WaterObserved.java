package no.sintef.datamodels;

import no.sintef.datamodels.generic.Location;

public class WaterObserved {

	private String id;
	private String type;
	private String source;
	private String dateCreated;
	private String dateObserved;
	private double flow;
	private double height;
	private double dischargeAmount;
	private Location location;

	private WaterObserved (WaterObservedBuilder builder) {

		this.id = builder.id;
		this.type = builder.type;
		this.source = builder.source;
		this.dateCreated = builder.dateCreated;
		this.dateObserved = builder.dateObserved;
		this.flow = builder.flow;
		this.height = builder.height;
		this.dischargeAmount = builder.dischargeAmount;
		this.location = builder.location;

	}

	public static class WaterObservedBuilder {

		private String id;
		private String type;
		private String source;
		private String dateCreated;
		private String dateObserved;
		private double flow;
		private double height;
		private double dischargeAmount;
		private Location location;

		public WaterObservedBuilder() {}

		public WaterObservedBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public WaterObservedBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public WaterObservedBuilder setSource(String source) {
			this.source = source;
			return this;
		}

		public WaterObservedBuilder setDateCreated(String dateCreated) {
			this.dateCreated = dateCreated;
			return this;
		}

		public WaterObservedBuilder setDateObserved(String dateObserved) {
			this.dateObserved = dateObserved;
			return this;
		}

		public WaterObservedBuilder setFlow(double flow) {
			this.flow = flow;
			return this;
		}

		public WaterObservedBuilder setHeight(double height) {
			this.height = height;
			return this;
		}

		public WaterObservedBuilder setDischargeAmount(double dischargeAmount) {
			this.dischargeAmount = dischargeAmount;
			return this;
		}

		public WaterObservedBuilder setLocation(Location location) {
			this.location = location;
			return this;
		}

		public WaterObserved build() {
			return new WaterObserved(this);
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

	public double getFlow() {
		return flow;
	}

	public double getHeight() {
		return height;
	}

	public double getDischargeAmount() {
		return dischargeAmount;
	}

	public Location getLocation() {
		return location;
	}

}
