package leetcode;


import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        List<String> sublist = new ArrayList<>();

        for(String s: strs){
            // incoming string to charArr
            // Sort and compare - add to hashmap
            char[] arr = s.toCharArray();
            char[] s_arr = arr.clone(); Arrays.sort(s_arr);

            // Check if this Anagram exists in the Map
            if(map.containsKey(String.valueOf(s_arr))){
                List<String> l = map.get(String.valueOf(s_arr));
                l.add(s);
                map.put(String.valueOf(s_arr), l);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(String.valueOf(s_arr), l);
            }

        }

        // add lists to the result
        for(Map.Entry<String, List<String>> ele: map.entrySet()){
            res.add(ele.getValue());
        }

        return res;
    }
}
