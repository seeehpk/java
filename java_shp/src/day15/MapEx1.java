package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("abc123", "abc123!");
		System.out.println(map);
		map.put("def456", "abc123!");
		System.out.println(map);
		map.put("abc123", "qwe123");
		System.out.println(map);
		System.out.println(map.remove("abc123"));
		System.out.println(map);
		
		map.put("admin", "admin");
		map.put("def", "def");
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		for(String tmp : keySet) {
			String value = map.get(tmp);
			System.out.println(value);
			System.out.println("[" + tmp + " , " + value + "]");
		}
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		A a = new A();
		A.B b = a.new B();
		
		for(Map.Entry<String, String> tmp : entrySet) {
			System.out.println("[" + tmp.getKey() + " , " + tmp.getValue() + "]");
		}
	}

}

class A{
	public class B{
		int num;
	}
}

class Entry1<K, V>{
	K key;
	V value;
}




