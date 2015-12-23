package com.pbamotra.ctci;

import java.util.HashMap;
import java.util.Map;

public class StringCompress {
	public static String[] compress(String[] input_strings) {
		
		String[] list = new String[input_strings.length];
		int n_cnt = 0;
		
		for (String str : input_strings) {
			int len = str.length();
			StringBuilder sb = new StringBuilder();
			Map<Character, Integer> map = new HashMap<>(1);
	
			for (int i=0; i<len; i++) {
				if(map.get(str.charAt(i)) == null && map.isEmpty()) {
					map.put(str.charAt(i), 1);
				} else if (map.get(str.charAt(i)) == null && !map.isEmpty()){
					char prev_char = (char) map.keySet().toArray()[0];
					sb.append(map.get(prev_char)).append(prev_char);
					map.clear();
					map.put(str.charAt(i), 1);
				} else {
					int counter = map.get(str.charAt(i)) + 1;
					map.put(str.charAt(i), counter);
				}
			}
			
			char prev_char = (char) map.keySet().toArray()[0];
			sb.append(map.get(prev_char)).append(prev_char);
			
			list[n_cnt++] = sb.toString();
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		String[] inp = new String[] {"12", "21"};
		String[] out = compress(inp);
		
		for (String s : out) {
			System.out.println(s);
		}
	}
}
