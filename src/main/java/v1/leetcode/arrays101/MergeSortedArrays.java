package v1.leetcode.arrays101;

/**
 *
 * @NOTE: Use the questions details that we need to insert in the first
 * array only
 *
 * @LEARNING: For all the mergesort type questions - we need to remember to
 * copy the remaining elements
 *
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 */
public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int ptrM = m-1;
		int ptrN = n-1;
		int ptrT = m+n-1;

		// Compare and copy
		while (ptrM >=0 && ptrN>=0 && ptrT>=0){
			if(nums1[ptrM] > nums2[ptrN]){
				nums1[ptrT] = nums1[ptrM];
				ptrM--;
			}else {
				nums1[ptrT] = nums2[ptrN];
				ptrN--;
			}
			ptrT--;
		}


		// Copy Remaining Elements left
		while(ptrN>=0){
			nums1[ptrT--] = nums2[ptrN--];
		}
	}
}
