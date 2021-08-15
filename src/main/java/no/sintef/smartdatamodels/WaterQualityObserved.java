package no.sintef.smartdatamodels;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Water Quality data model is intended to represent water quality parameters at a certain water mass (river,  lake, sea, etc.) section
 * 
 * Created from https://smart-data-models.github.io/dataModel.WaterQuality/WaterQualityObserved/schema.json
 * Using the transformation tool jsonSchemaTypes https://tryjsonschematypes.appspot.com/#java
 */
public class WaterQualityObserved {
	private final JSONObject jsonObject;

	public WaterQualityObserved(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JSONObject getJSONObject() {
		return jsonObject;
	}

	public Number getTurbidity() {
		return jsonObject.getNumber("turbidity");
	}

	public boolean hasTurbidity() {
		return jsonObject.has("turbidity");
	}

	public Number getTds() {
		return jsonObject.getNumber("tds");
	}

	public boolean hasTds() {
		return jsonObject.has("tds");
	}

	public Number getO2() {
		return jsonObject.getNumber("O2");
	}

	public boolean hasO2() {
		return jsonObject.has("O2");
	}

	public Number getCl() {
		return jsonObject.getNumber("Cl-");
	}

	public boolean hasCl() {
		return jsonObject.has("Cl-");
	}

	public String getDescription() {
		return jsonObject.getString("description");
	}

	public boolean hasDescription() {
		return jsonObject.has("description");
	}

	public WaterQualityObserved._2 .Measurand getMeasurand() {
		return new WaterQualityObserved._2 .Measurand(jsonObject.getJSONArray("measurand"));
	}

	public boolean hasMeasurand() {
		return jsonObject.has("measurand");
	}

	public String getSource() {
		return jsonObject.getString("source");
	}

	public boolean hasSource() {
		return jsonObject.has("source");
	}

	public WaterQualityObserved._2 .Type getType() {
		String value = jsonObject.getString("type");
		switch (value) {
			case "WaterQualityObserved":
			{
				return WaterQualityObserved._2 .Type.WATER_QUALITY_OBSERVED;
			}
		}
		throw new IllegalStateException(("Unexpected enum "+ value));
	}

	public Number getConductance() {
		return jsonObject.getNumber("conductance");
	}

	public boolean hasConductance() {
		return jsonObject.has("conductance");
	}

	public GSMACommons.SeeAlso getSeeAlso() {
		return new GSMACommons.SeeAlso(jsonObject.get("seeAlso"));
	}

	public boolean hasSeeAlso() {
		return jsonObject.has("seeAlso");
	}

	public String getDateCreated() {
		return jsonObject.getString("dateCreated");
	}

	public boolean hasDateCreated() {
		return jsonObject.has("dateCreated");
	}

	public Number getNO3() {
		return jsonObject.getNumber("NO3");
	}

	public boolean hasNO3() {
		return jsonObject.has("NO3");
	}

	public Number getConductivity() {
		return jsonObject.getNumber("conductivity");
	}

	public boolean hasConductivity() {
		return jsonObject.has("conductivity");
	}

	public Number getPO4() {
		return jsonObject.getNumber("PO4");
	}

	public boolean hasPO4() {
		return jsonObject.has("PO4");
	}

	public Number getTss() {
		return jsonObject.getNumber("tss");
	}

	public boolean hasTss() {
		return jsonObject.has("tss");
	}

	public Number getTemperature() {
		return jsonObject.getNumber("temperature");
	}

	public boolean hasTemperature() {
		return jsonObject.has("temperature");
	}

	public Number getPH() {
		return jsonObject.getNumber("pH");
	}

	public boolean hasPH() {
		return jsonObject.has("pH");
	}

	public Number getChla() {
		return jsonObject.getNumber("Chla");
	}

	public boolean hasChla() {
		return jsonObject.has("Chla");
	}

	public EntityIdentifierType getId() {
		return new EntityIdentifierType(jsonObject.get("id"));
	}

	public GSMACommons.Owner getOwner() {
		return new GSMACommons.Owner(jsonObject.getJSONArray("owner"));
	}

	public boolean hasOwner() {
		return jsonObject.has("owner");
	}

	public Number getSalinity() {
		return jsonObject.getNumber("salinity");
	}

	public boolean hasSalinity() {
		return jsonObject.has("salinity");
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

	public Number getOrp() {
		return jsonObject.getNumber("orp");
	}

	public boolean hasOrp() {
		return jsonObject.has("orp");
	}

	public WaterQualityObserved._2 .RefPointOfInterest getRefPointOfInterest() {
		return new WaterQualityObserved._2 .RefPointOfInterest(jsonObject.get("refPointOfInterest"));
	}

	public boolean hasRefPointOfInterest() {
		return jsonObject.has("refPointOfInterest");
	}

	public Number getPC() {
		return jsonObject.getNumber("PC");
	}

	public boolean hasPC() {
		return jsonObject.has("PC");
	}

	public Number getPE() {
		return jsonObject.getNumber("PE");
	}

	public boolean hasPE() {
		return jsonObject.has("PE");
	}

	public Number getBod() {
		return jsonObject.getNumber("bod");
	}

	public boolean hasBod() {
		return jsonObject.has("bod");
	}

	public String getName() {
		return jsonObject.getString("name");
	}

	public boolean hasName() {
		return jsonObject.has("name");
	}

	public Number getNH3() {
		return jsonObject.getNumber("NH3");
	}

	public boolean hasNH3() {
		return jsonObject.has("NH3");
	}

	public Number getCod() {
		return jsonObject.getNumber("cod");
	}

	public boolean hasCod() {
		return jsonObject.has("cod");
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

	public Number getNH4() {
		return jsonObject.getNumber("NH4");
	}

	public boolean hasNH4() {
		return jsonObject.has("NH4");
	}


	/**
	 * Created from https://smart-data-models.github.io/dataModel.WaterQuality/WaterQualityObserved/schema.json#/allOf/2
	 */
	public static class _2 {
		private final JSONObject jsonObject;

		public _2(JSONObject jsonObject) {
			this.jsonObject = jsonObject;
		}

		public JSONObject getJSONObject() {
			return jsonObject;
		}

		public Number getTurbidity() {
			return jsonObject.getNumber("turbidity");
		}

		public boolean hasTurbidity() {
			return jsonObject.has("turbidity");
		}

		public Number getTds() {
			return jsonObject.getNumber("tds");
		}

		public boolean hasTds() {
			return jsonObject.has("tds");
		}

		public Number getO2() {
			return jsonObject.getNumber("O2");
		}

		public boolean hasO2() {
			return jsonObject.has("O2");
		}

		public Number getCl() {
			return jsonObject.getNumber("Cl-");
		}

		public boolean hasCl() {
			return jsonObject.has("Cl-");
		}

		public WaterQualityObserved._2 .Measurand getMeasurand() {
			return new WaterQualityObserved._2 .Measurand(jsonObject.getJSONArray("measurand"));
		}

		public boolean hasMeasurand() {
			return jsonObject.has("measurand");
		}

		public WaterQualityObserved._2 .Type getType() {
			String value = jsonObject.getString("type");
			switch (value) {
				case "WaterQualityObserved":
				{
					return WaterQualityObserved._2 .Type.WATER_QUALITY_OBSERVED;
				}
			}
			throw new IllegalStateException(("Unexpected enum "+ value));
		}

		public boolean hasType() {
			return jsonObject.has("type");
		}

		public Number getConductance() {
			return jsonObject.getNumber("conductance");
		}

		public boolean hasConductance() {
			return jsonObject.has("conductance");
		}

		public Number getNO3() {
			return jsonObject.getNumber("NO3");
		}

		public boolean hasNO3() {
			return jsonObject.has("NO3");
		}

		public Number getConductivity() {
			return jsonObject.getNumber("conductivity");
		}

		public boolean hasConductivity() {
			return jsonObject.has("conductivity");
		}

		public Number getPO4() {
			return jsonObject.getNumber("PO4");
		}

		public boolean hasPO4() {
			return jsonObject.has("PO4");
		}

		public Number getTss() {
			return jsonObject.getNumber("tss");
		}

		public boolean hasTss() {
			return jsonObject.has("tss");
		}

		public Number getTemperature() {
			return jsonObject.getNumber("temperature");
		}

		public boolean hasTemperature() {
			return jsonObject.has("temperature");
		}

		public Number getPH() {
			return jsonObject.getNumber("pH");
		}

		public boolean hasPH() {
			return jsonObject.has("pH");
		}

		public Number getChla() {
			return jsonObject.getNumber("Chla");
		}

		public boolean hasChla() {
			return jsonObject.has("Chla");
		}

		public Number getSalinity() {
			return jsonObject.getNumber("salinity");
		}

		public boolean hasSalinity() {
			return jsonObject.has("salinity");
		}

		public String getDateObserved() {
			return jsonObject.getString("dateObserved");
		}

		public boolean hasDateObserved() {
			return jsonObject.has("dateObserved");
		}

		public Number getOrp() {
			return jsonObject.getNumber("orp");
		}

		public boolean hasOrp() {
			return jsonObject.has("orp");
		}

		public WaterQualityObserved._2 .RefPointOfInterest getRefPointOfInterest() {
			return new WaterQualityObserved._2 .RefPointOfInterest(jsonObject.get("refPointOfInterest"));
		}

		public boolean hasRefPointOfInterest() {
			return jsonObject.has("refPointOfInterest");
		}

		public Number getPC() {
			return jsonObject.getNumber("PC");
		}

		public boolean hasPC() {
			return jsonObject.has("PC");
		}

		public Number getPE() {
			return jsonObject.getNumber("PE");
		}

		public boolean hasPE() {
			return jsonObject.has("PE");
		}

		public Number getBod() {
			return jsonObject.getNumber("bod");
		}

		public boolean hasBod() {
			return jsonObject.has("bod");
		}

		public Number getNH3() {
			return jsonObject.getNumber("NH3");
		}

		public boolean hasNH3() {
			return jsonObject.has("NH3");
		}

		public Number getCod() {
			return jsonObject.getNumber("cod");
		}

		public boolean hasCod() {
			return jsonObject.has("cod");
		}

		public Number getNH4() {
			return jsonObject.getNumber("NH4");
		}

		public boolean hasNH4() {
			return jsonObject.has("NH4");
		}


		/**
		 * Property. An array of strings containing details (see format below) about extra measurands provided by this observation.
		 * 
		 * Created from https://smart-data-models.github.io/dataModel.WaterQuality/WaterQualityObserved/schema.json#/allOf/2/properties/measurand
		 */
		public static class Measurand
			implements Iterable<String>
		{
			private final JSONArray jsonArray;

			public Measurand(JSONArray jsonArray) {
				this.jsonArray = jsonArray;
			}

			public JSONArray getJSONArray() {
				return jsonArray;
			}

			public String getItem(int index) {
				return jsonArray.getString(index);
			}

			public Iterator<String> iterator() {
				Iterator<Object> iterator = jsonArray.iterator();
				return new Iterator<String>() {

					public boolean hasNext() {
						return iterator.hasNext();
					}

					public String next() {
						return ((String) iterator.next());
					}
				}
				;
			}

			public int size() {
				return jsonArray.length();
			}
		}


		/**
		 * Relationship. A reference to a point of interest associated to this observation.
		 * 
		 * Created from https://smart-data-models.github.io/dataModel.WaterQuality/WaterQualityObserved/schema.json#/allOf/2/properties/refPointOfInterest
		 */
		public static class RefPointOfInterest {
			private final Object object;

			public RefPointOfInterest(Object object) {
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
		 * Created from https://smart-data-models.github.io/dataModel.WaterQuality/WaterQualityObserved/schema.json#/allOf/2/properties/type
		 */
		public enum Type {
			WATER_QUALITY_OBSERVED;
		}
	}
}
