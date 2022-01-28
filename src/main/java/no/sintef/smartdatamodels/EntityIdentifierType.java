package no.sintef.smartdatamodels;

import org.json.JSONArray;


/**
 * Property. Unique identifier of the entity
 * 
 * Created from https://smart-data-models.github.io/data-models/common-schema.json#/definitions/EntityIdentifierType
 */
public class EntityIdentifierType {
	private final Object object;

	public EntityIdentifierType(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public int size() {
		return ((JSONArray) object).length();
	}
}
