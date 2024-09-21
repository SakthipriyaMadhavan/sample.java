package set;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class sample {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("sakthi",90);
		m.put("priya",80);
		m.put("rani",70);
		m.put("sakthi",100);
		System.out.println(m);
		System.out.println(m.containsKey("sakthi"));
		System.out.println(m.containsValue(80));
		System.out.println(m.isEmpty());
		Set Keys = m.keySet();
		System.out.println(Keys);
		Collection val = m.values();
		System.out.println(val);
		Set<Entry<String,Integer>> mark = m.entrySet();
		for(Entry<String,Integer> p: mark)
			System.out.println(p);
			
		
		
	}
}
