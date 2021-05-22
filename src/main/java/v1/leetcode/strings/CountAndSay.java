package v1.leetcode.strings;


/**
 * #revise
 *
 * https://leetcode.com/problems/count-and-say/
 *
 */
public class CountAndSay {
	public String countAndSay(int n) {
		if(n==1)
			return new String("1");
		return csUtil(countAndSay(n-1));
	}

	// Consider this function as g(f(x)) when we define recursive functions
	private String csUtil(String s){
		StringBuilder sb = new StringBuilder();
		int count=0;
		char prev = s.charAt(0); // init as first element;
		char curr = s.charAt(0);;
		for(int i=0; i<s.length(); i++){
			curr = s.charAt(i);
			if(prev != curr){
				sb.append(String.valueOf(count) + String.valueOf(prev));
				count=1;
			}else{
				count++;
			}
			prev = curr;
		}
		// Last One to be handled
		sb.append(String.valueOf(count) + String.valueOf(curr));
		return sb.toString();
	}
}
