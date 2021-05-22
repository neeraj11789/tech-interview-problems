package v1.leetcode.arrays101;

/**
 *
 * @LEARNING : How to break this problem into a merge sort problem
 *
 * https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3261/
 */
public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] A) {

		int N = A.length;

		int[] res = new int[N];
		int i=0;
		while (i<N && A[i]<0) i++;

		int j=i-1;
		int k=0;

		System.out.println("i=" + i);
		System.out.println("j=" + j);

		while (j>=0 && i<N){
			int sqI = A[i]*A[i];
			int sqJ = A[j]*A[j];

			if(sqI < sqJ){
				res[k++] = sqI;
				i++;
			}else{
				res[k++] = sqJ;
				j--;
			}
		}

		System.out.println("i=" + i);
		System.out.println("j=" + j);

		while (j>=0){
			res[k++] = A[j]*A[j];
			j--;
		}


		while (i<N){
			res[k++] = A[i]*A[i];
			i++;
		}


		return res;
	}
}
