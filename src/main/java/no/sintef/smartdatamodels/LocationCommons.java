package no.sintef.smartdatamodels;

import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/Location-Commons
 */
public class LocationCommons {
	private final JSONObject jsonObject;

	public LocationCommons(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JSONObject getJSONObject() {
		return jsonObject;
	}

	public LocationCommons.Location getLocation() {
		return new LocationCommons.Location(jsonObject.get("location"));
	}

	public boolean hasLocation() {
		return jsonObject.has("location");
	}

	public JSONObject getAddress() {
		return jsonObject.getJSONObject("address");
	}

	public boolean hasAddress() {
		return jsonObject.has("address");
	}

	public String getAreaServed() {
		return jsonObject.getString("areaServed");
	}

	public boolean hasAreaServed() {
		return jsonObject.has("areaServed");
	}


	/**
	 * Property. The mailing address. Model:'https://schema.org/address'
	 * 
	 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/Location-Commons/properties/address
	 */
	public static class Address {
		private final JSONObject jsonObject;

		public Address(JSONObject jsonObject) {
			this.jsonObject = jsonObject;
		}

		public JSONObject getJSONObject() {
			return jsonObject;
		}

		public String getAddressCountry() {
			return jsonObject.getString("addressCountry");
		}

		public boolean hasAddressCountry() {
			return jsonObject.has("addressCountry");
		}

		public String getStreetAddress() {
			return jsonObject.getString("streetAddress");
		}

		public boolean hasStreetAddress() {
			return jsonObject.has("streetAddress");
		}

		public String getPostalCode() {
			return jsonObject.getString("postalCode");
		}

		public boolean hasPostalCode() {
			return jsonObject.has("postalCode");
		}

		public String getAddressLocality() {
			return jsonObject.getString("addressLocality");
		}

		public boolean hasAddressLocality() {
			return jsonObject.has("addressLocality");
		}

		public String getAddressRegion() {
			return jsonObject.getString("addressRegion");
		}

		public boolean hasAddressRegion() {
			return jsonObject.has("addressRegion");
		}

		public String getPostOfficeBoxNumber() {
			return jsonObject.getString("postOfficeBoxNumber");
		}

		public boolean hasPostOfficeBoxNumber() {
			return jsonObject.has("postOfficeBoxNumber");
		}
	}


	/**
	 * Geoproperty. Geojson reference to the item. It can be Point, LineString, Polygon, MultiPoint, MultiLineString or MultiPolygon
	 * 
	 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/Location-Commons/properties/location
	 */
	public static class Location {
		private final Object object;

		public Location(Object object) {
			this.object = object;
		}

		public Object getObject() {
			return object;
		}

		public int size() {
			return ((JSONArray) object).length();
		}
	}
}
