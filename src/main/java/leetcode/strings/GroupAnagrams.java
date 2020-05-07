package leetcode.strings;

import java.util.*;

/**
 * @NOTE: Sort Anagrams to get key for the map
 *
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();

		for(String s: strs){
			// incoming string to charArr
			// Sort and compare - add to hashmap
			char[] arr = s.toCharArray();
			char[] sorted_arr = arr.clone(); Arrays.sort(sorted_arr);
			String sortedKey = new String(sorted_arr);

			// Check if this Anagram exists in the Map
			if(map.containsKey(sortedKey)){
				List<String> l = map.get(sortedKey);
				l.add(s);
				map.put(sortedKey, l);
			}else{
				List<String> l = new ArrayList<>();
				l.add(s);
				map.put(sortedKey, l);
			}

		}

		// add lists to the result
		for(Map.Entry<String, List<String>> ele: map.entrySet()){
			res.add(ele.getValue());
		}

		return res;
	}
}
