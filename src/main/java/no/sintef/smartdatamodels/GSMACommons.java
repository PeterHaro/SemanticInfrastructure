package no.sintef.smartdatamodels;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/GSMA-Commons
 */
public class GSMACommons {
	private final JSONObject jsonObject;

	public GSMACommons(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JSONObject getJSONObject() {
		return jsonObject;
	}

	public GSMACommons.Owner getOwner() {
		return new GSMACommons.Owner(jsonObject.getJSONArray("owner"));
	}

	public boolean hasOwner() {
		return jsonObject.has("owner");
	}

	public String getDateCreated() {
		return jsonObject.getString("dateCreated");
	}

	public boolean hasDateCreated() {
		return jsonObject.has("dateCreated");
	}

	public String getName() {
		return jsonObject.getString("name");
	}

	public boolean hasName() {
		return jsonObject.has("name");
	}

	public String getDescription() {
		return jsonObject.getString("description");
	}

	public boolean hasDescription() {
		return jsonObject.has("description");
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

	public EntityIdentifierType getId() {
		return new EntityIdentifierType(jsonObject.get("id"));
	}

	public boolean hasId() {
		return jsonObject.has("id");
	}

	public String getSource() {
		return jsonObject.getString("source");
	}

	public boolean hasSource() {
		return jsonObject.has("source");
	}

	public String getDataProvider() {
		return jsonObject.getString("dataProvider");
	}

	public boolean hasDataProvider() {
		return jsonObject.has("dataProvider");
	}

	public GSMACommons.SeeAlso getSeeAlso() {
		return new GSMACommons.SeeAlso(jsonObject.get("seeAlso"));
	}

	public boolean hasSeeAlso() {
		return jsonObject.has("seeAlso");
	}


	/**
	 * Property. A List containing a JSON encoded sequence of characters referencing the unique Ids of the owner(s)
	 * 
	 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/GSMA-Commons/properties/owner
	 */
	public static class Owner
		implements Iterable<EntityIdentifierType>
	{
		private final JSONArray jsonArray;

		public Owner(JSONArray jsonArray) {
			this.jsonArray = jsonArray;
		}

		public JSONArray getJSONArray() {
			return jsonArray;
		}

		public EntityIdentifierType getEntityIdentifierType(int index) {
			return new EntityIdentifierType(jsonArray.get(index));
		}

		public Iterator<EntityIdentifierType> iterator() {
			Iterator<Object> iterator = jsonArray.iterator();
			return new Iterator<EntityIdentifierType>() {

				public boolean hasNext() {
					return iterator.hasNext();
				}

				public EntityIdentifierType next() {
					return new EntityIdentifierType(iterator.next());
				}
			}
			;
		}

		public int size() {
			return jsonArray.length();
		}
	}


	/**
	 * Property. list of uri pointing to additional resources about the item
	 * 
	 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/GSMA-Commons/properties/seeAlso
	 */
	public static class SeeAlso {
		private final Object object;

		public SeeAlso(Object object) {
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