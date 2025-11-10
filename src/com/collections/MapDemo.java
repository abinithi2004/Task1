package com.collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.HashMap;
//import java.util.TreeMap;
public class MapDemo {
public static void main(String[] args) {
	//HashMap hm=new HashMap();
	//TreeMap hm=new TreeMap();
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(2, "Mango");
	hm.put(3, "Tango");
	//hm.put('x', 33.44f);
	//hm.put("A", 55);
	hm.put(1, "Apple");
	//hm.put("", 32);
	Set<Integer> s=hm.keySet();
	//for(int x::s) {
	//	System.out.println(x);
	//}
	System.out.println(hm);
	//System.out.println(hm.size());
	//System.out.println(hm.containsKey("A"));
	//System.out.println(hm.get('x'));
	//System.out.println(hm.get(hm.remove(3)));
	//System.out.println(hm);x
	//s.forEach(x->{System.out.println(x);});
	//Collection<String> c=hm.values();
	//for(String str: c) {
		//System.out.println(str);
	//}
	for(Map.Entry<Integer,String> m: hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
