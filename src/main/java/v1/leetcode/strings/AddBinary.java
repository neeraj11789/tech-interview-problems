package v1.leetcode.strings;

/**
 *
 * #revise
 *
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();

		if (a.length() == 0 || b.length() == 0) return sb.toString();

		if(a.length() == 0) return b;
		if(b.length() == 0) return a;

		char[] a_arr = a.toCharArray();
		char[] b_arr = b.toCharArray();

		int i = a.length()-1;
		int j = b.length()-1;

		int sum=0;
		int carry=0;

		while (i>=0 || j>=0){
			// Get Integer Values of the Characters
			int c1 = 0;
			int c2 = 0;

			if(i>=0)
				c1 = a_arr[i] - '0';

			if(j>=0)
				c2 = b_arr[j] - '0';

			// Idea here is doing a maths using base 2
			sum = c1 + c2 + carry;

			if(sum <= 1){ // in binary limit
				sb.append(sum);
				carry = 0;
			}else {
				sb.append(sum % 2);
				carry = 1;
			}

			i--;
			j--;
		}

		// add carry
		if(carry == 1)
			sb.append(carry);

		return sb.reverse().toString();
	}
}
