package com.pbamotra.ctci;

import java.util.HashMap;
import java.util.Map;

public class StringCompress {
	public String compress(String str) {
		
		if(str == null || str.isEmpty()) return str;
		
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>(1);

		for (int i=0; i<len; i++) {
			if(map.get(str.charAt(i)) == null && map.isEmpty()) {
				map.put(str.charAt(i), 1);
			} else if (map.get(str.charAt(i)) == null && !map.isEmpty()){
				char prev_char = (char) map.keySet().toArray()[0];
				sb.append(prev_char).append(map.get(prev_char));
				map.clear();
				map.put(str.charAt(i), 1);
			} else {
				int counter = map.get(str.charAt(i)) + 1;
				map.put(str.charAt(i), counter);
			}
		}
		
		char prev_char = (char) map.keySet().toArray()[0];
		sb.append(prev_char).append(map.get(prev_char));
		
		if(str.length() <= sb.toString().length()) return str;
		return sb.toString();
	}
}
