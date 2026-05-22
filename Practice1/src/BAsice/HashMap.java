package BAsice;

import java.util.*;

public class HashMap {

	public static void main(String[] args) {

		String name="abcdabcdabcdr";
		
		Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
		
		for (char c : name.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map);
	}

}
