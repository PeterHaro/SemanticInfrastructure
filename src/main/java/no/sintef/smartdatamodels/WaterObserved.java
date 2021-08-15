package no.sintef.smartdatamodels;

import org.json.JSONArray;
import org.json.JSONObject;


/**
 *  Water observation data model is intended to represent the parameters of flow, level and volume of water observed, as well as the swell information, over a fixed or variable area. This observation also includes the masses of floating objects on this area. The data collected is provided by Sensors, Cameras,Water stations positioned at specific or sensitive locations for rivers, streams, torrent, lakes, seas, etc.
 * Created from https://smart-data-models.github.io/data-models/Environment/WaterObserved/schema.js
 *  Using the transformation tool jsonSchemaTypes https://tryjsonschematypes.appspot.com/#java
 */

public class WaterObserved {
	private final JSONObject jsonObject;

	public WaterObserved(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JSONObject getJSONObject() {
		return jsonObject;
	}

	public String getDescription() {
		return jsonObject.getString("description");
	}

	public boolean hasDescription() {
		return jsonObject.has("description");
	}

	public String getSource() {
		return jsonObject.getString("source");
	}

	public boolean hasSource() {
		return jsonObject.has("source");
	}

	public Number getObjectVolume() {
		return jsonObject.getNumber("objectVolume");
	}

	public boolean hasObjectVolume() {
		return jsonObject.has("objectVolume");
	}

	public WaterObserved._2 .Type getType() {
		String value = jsonObject.getString("type");
		switch (value) {
			case "WaterObserved":
			{
				return WaterObserved._2 .Type.WATER_OBSERVED;
			}
		}
		throw new IllegalStateException(("Unexpected enum "+ value));
	}

	public GSMACommons.SeeAlso getSeeAlso() {
		return new GSMACommons.SeeAlso(jsonObject.get("seeAlso"));
	}

	public boolean hasSeeAlso() {
		return jsonObject.has("seeAlso");
	}

	public WaterObserved._2 .RefDevice getRefDevice() {
		return new WaterObserved._2 .RefDevice(jsonObject.get("refDevice"));
	}

	public boolean hasRefDevice() {
		return jsonObject.has("refDevice");
	}

	public String getDateCreated() {
		return jsonObject.getString("dateCreated");
	}

	public boolean hasDateCreated() {
		return jsonObject.has("dateCreated");
	}

	public Number getSwellHeight() {
		return jsonObject.getNumber("swellHeight");
	}

	public boolean hasSwellHeight() {
		return jsonObject.has("swellHeight");
	}

	public Number getSwellDirection() {
		return jsonObject.getNumber("swellDirection");
	}

	public boolean hasSwellDirection() {
		return jsonObject.has("swellDirection");
	}

	public EntityIdentifierType getId() {
		return new EntityIdentifierType(jsonObject.get("id"));
	}

	public Number getWaveLength() {
		return jsonObject.getNumber("waveLength");
	}

	public boolean hasWaveLength() {
		return jsonObject.has("waveLength");
	}

	public Number getFlow() {
		return jsonObject.getNumber("flow");
	}

	public boolean hasFlow() {
		return jsonObject.has("flow");
	}

	public Number getObjectHeightAverage() {
		return jsonObject.getNumber("objectHeightAverage");
	}

	public boolean hasObjectHeightAverage() {
		return jsonObject.has("objectHeightAverage");
	}

	public Number getHeight() {
		return jsonObject.getNumber("height");
	}

	public boolean hasHeight() {
		return jsonObject.has("height");
	}

	public GSMACommons.Owner getOwner() {
		return new GSMACommons.Owner(jsonObject.getJSONArray("owner"));
	}

	public boolean hasOwner() {
		return jsonObject.has("owner");
	}

	public String getDateObservedTo() {
		return jsonObject.getString("dateObservedTo");
	}

	public boolean hasDateObservedTo() {
		return jsonObject.has("dateObservedTo");
	}

	public Number getObjectArea() {
		return jsonObject.getNumber("objectArea");
	}

	public boolean hasObjectArea() {
		return jsonObject.has("objectArea");
	}

	public LocationCommons.Address getAddress() {
		return new LocationCommons.Address(jsonObject.getJSONObject("address"));
	}

	public boolean hasAddress() {
		return jsonObject.has("address");
	}

	public String getDateObserved() {
		return jsonObject.getString("dateObserved");
	}

	public String getAreaServed() {
		return jsonObject.getString("areaServed");
	}

	public boolean hasAreaServed() {
		return jsonObject.has("areaServed");
	}

	public Number getSwellPeriod() {
		return jsonObject.getNumber("swellPeriod");
	}

	public boolean hasSwellPeriod() {
		return jsonObject.has("swellPeriod");
	}

	public String getDateModified() {
		return jsonObject.getString("dateModified");
	}

	public boolean hasDateModified() {
		return jsonObject.has("dateModified");
	}

	public String getAlternateName() {
		return jsonObject.getString("alternateName");
	}

	public boolean hasAlternateName() {
		return jsonObject.has("alternateName");
	}

	public Number getMeasuredArea() {
		return jsonObject.getNumber("measuredArea");
	}

	public boolean hasMeasuredArea() {
		return jsonObject.has("measuredArea");
	}

	public String getDateObservedFrom() {
		return jsonObject.getString("dateObservedFrom");
	}

	public boolean hasDateObservedFrom() {
		return jsonObject.has("dateObservedFrom");
	}

	public Number getObjectHeightMax() {
		return jsonObject.getNumber("objectHeightMax");
	}

	public boolean hasObjectHeightMax() {
		return jsonObject.has("objectHeightMax");
	}

	public String getName() {
		return jsonObject.getString("name");
	}

	public boolean hasName() {
		return jsonObject.has("name");
	}

	public LocationCommons.Location getLocation() {
		return new LocationCommons.Location(jsonObject.get("location"));
	}

	public String getDataProvider() {
		return jsonObject.getString("dataProvider");
	}

	public boolean hasDataProvider() {
		return jsonObject.has("dataProvider");
	}


	/**
	 * Created from https://smart-data-models.github.io/data-models/Environment/WaterObserved/schema.js#/allOf/2
	 */
	public static class _2 {
		private final JSONObject jsonObject;

		public _2(JSONObject jsonObject) {
			this.jsonObject = jsonObject;
		}

		public JSONObject getJSONObject() {
			return jsonObject;
		}

		public String getDateObservedTo() {
			return jsonObject.getString("dateObservedTo");
		}

		public boolean hasDateObservedTo() {
			return jsonObject.has("dateObservedTo");
		}

		public Number getObjectArea() {
			return jsonObject.getNumber("objectArea");
		}

		public boolean hasObjectArea() {
			return jsonObject.has("objectArea");
		}

		public String getDateObserved() {
			return jsonObject.getString("dateObserved");
		}

		public boolean hasDateObserved() {
			return jsonObject.has("dateObserved");
		}

		public Number getSwellPeriod() {
			return jsonObject.getNumber("swellPeriod");
		}

		public boolean hasSwellPeriod() {
			return jsonObject.has("swellPeriod");
		}

		public Number getMeasuredArea() {
			return jsonObject.getNumber("measuredArea");
		}

		public boolean hasMeasuredArea() {
			return jsonObject.has("measuredArea");
		}

		public Number getObjectVolume() {
			return jsonObject.getNumber("objectVolume");
		}

		public boolean hasObjectVolume() {
			return jsonObject.has("objectVolume");
		}

		public WaterObserved._2 .Type getType() {
			String value = jsonObject.getString("type");
			switch (value) {
				case "WaterObserved":
				{
					return WaterObserved._2 .Type.WATER_OBSERVED;
				}
			}
			throw new IllegalStateException(("Unexpected enum "+ value));
		}

		public boolean hasType() {
			return jsonObject.has("type");
		}

		public String getDateObservedFrom() {
			return jsonObject.getString("dateObservedFrom");
		}

		public boolean hasDateObservedFrom() {
			return jsonObject.has("dateObservedFrom");
		}

		public Number getObjectHeightMax() {
			return jsonObject.getNumber("objectHeightMax");
		}

		public boolean hasObjectHeightMax() {
			return jsonObject.has("objectHeightMax");
		}

		public WaterObserved._2 .RefDevice getRefDevice() {
			return new WaterObserved._2 .RefDevice(jsonObject.get("refDevice"));
		}

		public boolean hasRefDevice() {
			return jsonObject.has("refDevice");
		}

		public Number getSwellHeight() {
			return jsonObject.getNumber("swellHeight");
		}

		public boolean hasSwellHeight() {
			return jsonObject.has("swellHeight");
		}

		public Number getSwellDirection() {
			return jsonObject.getNumber("swellDirection");
		}

		public boolean hasSwellDirection() {
			return jsonObject.has("swellDirection");
		}

		public Number getWaveLength() {
			return jsonObject.getNumber("waveLength");
		}

		public boolean hasWaveLength() {
			return jsonObject.has("waveLength");
		}

		public Number getFlow() {
			return jsonObject.getNumber("flow");
		}

		public boolean hasFlow() {
			return jsonObject.has("flow");
		}

		public Number getObjectHeightAverage() {
			return jsonObject.getNumber("objectHeightAverage");
		}

		public boolean hasObjectHeightAverage() {
			return jsonObject.has("objectHeightAverage");
		}

		public Number getHeight() {
			return jsonObject.getNumber("height");
		}

		public boolean hasHeight() {
			return jsonObject.has("height");
		}


		/**
		 * Relationship. A reference to a point of interest associated to this observation.
		 * 
		 * Created from https://smart-data-models.github.io/data-models/Environment/WaterObserved/schema.js#/allOf/2/properties/refDevice
		 */
		public static class RefDevice {
			private final Object object;

			public RefDevice(Object object) {
				this.object = object;
			}

			public Object getObject() {
				return object;
			}

			public int size() {
				return ((JSONArray) object).length();
			}
		}


		/**
		 * Created from https://smart-data-models.github.io/data-models/Environment/WaterObserved/schema.js#/allOf/2/properties/type
		 */
		public enum Type {
			WATER_OBSERVED;
		}
	}
}
