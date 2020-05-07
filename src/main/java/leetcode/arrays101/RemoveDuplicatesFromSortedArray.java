package leetcode.arrays101;


/**
 *
 * @LEARNING : ReadPointer & WritePointer -https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3255/
 *
 * @NOTE: If you dry run, you would understand the edge cases being missed. So the
 * last emement is added And Edge Cases
 * https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		int N = nums.length;

		// Edge Cases
		if(nums==null || nums.length==0) return 0;
		if(N==1) return N;

		int p1 = 1;
		int p2 = 0;

		for(p1=1; p1<N; p1++){
			if(nums[p1] != nums[p2]){
				p2++;
				nums[p2] = nums[p1];
			}
		}

		// copy last element
		nums[p2++] = nums[N-1];

		return p2;
	}

	public int removeDuplicates1(int[] nums) {

		// Check for edge cases.
		if (nums == null) {
			return 0;
		}

		// Use the two pointer technique to remove the duplicates in-place.
		// The first element shouldn't be touched; it's already in its correct place.
		int writePointer = 1;
		// Go through each element in the Array.
		for (int readPointer = 1; readPointer < nums.length; readPointer++) {
			// If the current element we're reading is *different* to the previous
			// element...
			if (nums[readPointer] != nums[readPointer - 1]) {
				// Copy it into the next position at the front, tracked by writePointer.
				nums[writePointer] = nums[readPointer];
				// And we need to now increment writePointer, because the next element
				// should be written one space over.
				writePointer++;
			}
		}

		// This turns out to be the correct length value.
		return writePointer;
	}

}
