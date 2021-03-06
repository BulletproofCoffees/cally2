package cally.acbook.beans;

import java.util.Comparator;
import java.util.HashMap;

public class MapComparator implements Comparator<HashMap<String, Object>>  {
	private final String key;

	public MapComparator(String key) {
		this.key = key;
	}

	@Override
	public int compare(HashMap<String, Object> first, HashMap<String, Object> second) {
		int result = ((String) first.get(key)).compareTo((String)second.get(key));
		return result;
	}


}
