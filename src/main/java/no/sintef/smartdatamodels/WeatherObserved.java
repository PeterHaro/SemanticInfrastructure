package no.sintef.smartdatamodels;


import org.json.JSONArray;
import org.json.JSONObject;


/**
 * An observation of weather conditions at a certain place and time. This data model has been developed in cooperation with mobile operators and the GSMA.
 * 
 * Created from https://smart-data-models.github.io/dataModel.Weather/WeatherObserved/schema.json
 */
public class WeatherObserved {
	private final JSONObject jsonObject;

	public WeatherObserved(JSONObject jsonObject) {
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

	public WeatherObserved._3 .Type getType() {
		String value = jsonObject.getString("type");
		switch (value) {
			case "WeatherObserved":
			{
				return WeatherObserved._3 .Type.WEATHER_OBSERVED;
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

	public Number getUVIndexMax() {
		return jsonObject.getNumber("uVIndexMax");
	}

	public boolean hasUVIndexMax() {
		return jsonObject.has("uVIndexMax");
	}

	public Number getPrecipitation() {
		return jsonObject.getNumber("precipitation");
	}

	public boolean hasPrecipitation() {
		return jsonObject.has("precipitation");
	}

	public WeatherObserved._3 .RefDevice getRefDevice() {
		return new WeatherObserved._3 .RefDevice(jsonObject.get("refDevice"));
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

	public Number getTemperature() {
		return jsonObject.getNumber("temperature");
	}

	public boolean hasTemperature() {
		return jsonObject.has("temperature");
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

	public Number getSnowHeight() {
		return jsonObject.getNumber("snowHeight");
	}

	public boolean hasSnowHeight() {
		return jsonObject.has("snowHeight");
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

	public Number getSolarRadiation() {
		return jsonObject.getNumber("solarRadiation");
	}

	public boolean hasSolarRadiation() {
		return jsonObject.has("solarRadiation");
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

	public WeatherObserved._3 .PressureTendency getPressureTendency() {
		return new WeatherObserved._3 .PressureTendency(jsonObject.get("pressureTendency"));
	}

	public boolean hasPressureTendency() {
		return jsonObject.has("pressureTendency");
	}

	public Number getDewPoint() {
		return jsonObject.getNumber("dewPoint");
	}

	public boolean hasDewPoint() {
		return jsonObject.has("dewPoint");
	}

	public Number getFeelsLikesTemperature() {
		return jsonObject.getNumber("feelsLikesTemperature");
	}

	public boolean hasFeelsLikesTemperature() {
		return jsonObject.has("feelsLikesTemperature");
	}

	public String getName() {
		return jsonObject.getString("name");
	}

	public boolean hasName() {
		return jsonObject.has("name");
	}

	public Number getRelativeHumidity() {
		return jsonObject.getNumber("relativeHumidity");
	}

	public boolean hasRelativeHumidity() {
		return jsonObject.has("relativeHumidity");
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

	public Number getStreamGauge() {
		return jsonObject.getNumber("streamGauge");
	}

	public boolean hasStreamGauge() {
		return jsonObject.has("streamGauge");
	}


	/**
	 * Created from https://smart-data-models.github.io/dataModel.Weather/WeatherObserved/schema.json#/allOf/3
	 */
	public static class _3 {
		private final JSONObject jsonObject;

		public _3(JSONObject jsonObject) {
			this.jsonObject = jsonObject;
		}

		public JSONObject getJSONObject() {
			return jsonObject;
		}

		public Number getSnowHeight() {
			return jsonObject.getNumber("snowHeight");
		}

		public boolean hasSnowHeight() {
			return jsonObject.has("snowHeight");
		}

		public String getDateObserved() {
			return jsonObject.getString("dateObserved");
		}

		public boolean hasDateObserved() {
			return jsonObject.has("dateObserved");
		}

		public Number getSolarRadiation() {
			return jsonObject.getNumber("solarRadiation");
		}

		public boolean hasSolarRadiation() {
			return jsonObject.has("solarRadiation");
		}

		public String getType() {
			return jsonObject.getString("type");
		}

		public boolean hasType() {
			return jsonObject.has("type");
		}

		public WeatherObserved._3 .PressureTendency getPressureTendency() {
			return new WeatherObserved._3 .PressureTendency(jsonObject.get("pressureTendency"));
		}

		public boolean hasPressureTendency() {
			return jsonObject.has("pressureTendency");
		}

		public Number getDewPoint() {
			return jsonObject.getNumber("dewPoint");
		}

		public boolean hasDewPoint() {
			return jsonObject.has("dewPoint");
		}

		public Number getUVIndexMax() {
			return jsonObject.getNumber("uVIndexMax");
		}

		public boolean hasUVIndexMax() {
			return jsonObject.has("uVIndexMax");
		}

		public Number getPrecipitation() {
			return jsonObject.getNumber("precipitation");
		}

		public boolean hasPrecipitation() {
			return jsonObject.has("precipitation");
		}

		public WeatherObserved._3 .RefDevice getRefDevice() {
			return new WeatherObserved._3 .RefDevice(jsonObject.get("refDevice"));
		}

		public boolean hasRefDevice() {
			return jsonObject.has("refDevice");
		}

		public Number getFeelsLikesTemperature() {
			return jsonObject.getNumber("feelsLikesTemperature");
		}

		public boolean hasFeelsLikesTemperature() {
			return jsonObject.has("feelsLikesTemperature");
		}

		public Number getTemperature() {
			return jsonObject.getNumber("temperature");
		}

		public boolean hasTemperature() {
			return jsonObject.has("temperature");
		}

		public Number getRelativeHumidity() {
			return jsonObject.getNumber("relativeHumidity");
		}

		public boolean hasRelativeHumidity() {
			return jsonObject.has("relativeHumidity");
		}

		public Number getStreamGauge() {
			return jsonObject.getNumber("streamGauge");
		}

		public boolean hasStreamGauge() {
			return jsonObject.has("streamGauge");
		}


		/**
		 * Property. Model:'https://schema.org/DateTime'. Enum:'falling, raising, steady'. Is the pressure rising or falling? It can be expressed in quantitative terms or qualitative terms.
		 * 
		 * Created from https://smart-data-models.github.io/dataModel.Weather/WeatherObserved/schema.json#/allOf/3/properties/pressureTendency
		 */
		public static class PressureTendency {
			private final Object object;

			public PressureTendency(Object object) {
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
		 * Relationship. Model:'https://schema.org/URL'. A reference to the device(s) which captured this observation.
		 * 
		 * Created from https://smart-data-models.github.io/dataModel.Weather/WeatherObserved/schema.json#/allOf/3/properties/refDevice
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
		 * Created from https://smart-data-models.github.io/dataModel.Weather/WeatherObserved/schema.json#/allOf/3/properties/type
		 */
		public enum Type {
			WEATHER_OBSERVED;
		}
	}
}