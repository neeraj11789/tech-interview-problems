package v1.leetcode.arrays101;

/**
 * @LEARNING : ReadPointer & WritePointer
 * This can be used as template
 * We move the readPtr in all the cases.
 * We move the OtherPtr only when conditions are met - and we do it only when
 *
 * readPtr > evenPtr(otherPointer)
 *
 * https://leetcode.com/problems/sort-array-by-parity/submissions/
 */
public class SortByParity {
	public int[] sortArrayByParity(int[] A) {
		int N = A.length;

		int readPtr;
		int evenPtr=0;

		for(readPtr=0; readPtr<N; readPtr++){
			if(A[readPtr] % 2 == 0){

				if(readPtr > evenPtr){
					int tmp = A[evenPtr];
					A[evenPtr] = A[readPtr];
					A[readPtr] = tmp;
				}

				evenPtr++;
			}
		}

		return A;
	}
}
