package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 100);
		map.put("2", 90);
		map.put("3", 95);
		map.put("4", 80);
		map.put("5", 90);
		
		System.out.println(map.get("5"));
		
		Set<String> ketset = map.keySet();
		Iterator<String> keyIterator = ketset.iterator();
	
		

			while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+"  "+value);
		}
		
		
		

	}

}
