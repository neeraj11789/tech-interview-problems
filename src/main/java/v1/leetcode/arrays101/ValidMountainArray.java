package v1.leetcode.arrays101;

/**
 * @TODO: 46/51 test cases passed. Need to look back again sometime.
 * https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 */
public class ValidMountainArray {

	public boolean validMountainArray(int[] A) {

		if(A==null || A.length<3) return false;

		int N = A.length;
		int i=0;

		while (i<N-1 && A[i+1]>A[i]){
			i++;
		}

		// current position of i is pivot
		// slide to the decreasing side
		i=i+1;

		// peak can't be first or last
		if (i == 0 || i == N-1)
			return false;

		while (i<N-1 && A[i]>A[i+1]){
			i++;
		}


		// iterated the full array and all conditions are met
		if(i == N-1) return true;

		return false;
	}

}
