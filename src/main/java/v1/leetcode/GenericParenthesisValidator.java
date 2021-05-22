package v1.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/submissions/
 */
public class GenericParenthesisValidator {

	/**
	 * Validate the Parentesis
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<>();
		initMap(map);
		Stack<Character> stack = new Stack<>();

		if(s.length()<1){
			return true;
		}

		char[] arr = s.toCharArray();
		char ch = arr[0];
		for(int i=0; i<arr.length; i++){
			ch = arr[i];
			if(!isValidChar(map,ch)) continue;

			if(!map.containsKey(ch)){
				stack.push(ch);
			}else{
				// check value from map
				// should be same as top of the stack
				if(stack.empty()){
					return false;
				}else{
					if(map.get(ch) != stack.pop()){
						return false;
					}
				}
			}

		}

		if(!stack.empty())
			return false;

		return true;
	}

	/**
	 * Create a hashmap of Valid Parenthesis
	 * @param map
	 */
	private void initMap(Map<Character, Character> map){
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
	}

	/**
	 * Ignore all the characters apart from the valid parenthesis characters
	 * @param map
	 * @param ch
	 * @return
	 */
	private boolean isValidChar(Map<Character,Character> map, Character ch){
		return map.containsKey(ch) || map.containsValue(ch);
	}
}
