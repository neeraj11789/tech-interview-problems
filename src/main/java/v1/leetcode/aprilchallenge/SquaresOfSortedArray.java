package v1.leetcode.aprilchallenge;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/solution/
 *
 * @NOTE:
 * Rather than sorting the results. We could mark the pointer for
 * Negative and positive.
 *
 * Then Assume those are 2 different arrays and we process them
 *
 */
public class SquaresOfSortedArray {
	public int[] sortedSquares(int[] A) {
		if(A==null) return A;

		int N = A.length;
		int[] res = new int[N];
		int j = 0;

		while(j < N && A[j] < 0)
			j++;

		int i=j-1;
		int k=0;

		/**
		 * @NOTE: In Merge Sort,
		 * We use AND condition
		 * and then process rest
		 * of the code in next
		 * loops
		 *
		 * Merge Sort Code
		 */
		while(i>=0 && j<N){
			if(A[i]*A[i] < A[j]*A[j]){
				res[k++] = A[i]*A[i];
				i--;
			}else{
				res[k++] = A[j]*A[j];
				j++;
			}
		}

		/**
		 * @NOTE: DO NOT FORGET THIS. Process remaining elements
		 */
		while(i>=0){
			res[k++] = A[i]*A[i];
			i--;
		}

		while(j<N){
			res[k++] = A[j]*A[j];
			j++;
		}

		return res;
	}
}
