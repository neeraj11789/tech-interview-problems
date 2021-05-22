package v1.leetcode.arrays101;

/**
 * @LEARNING: Using 2 pointers - Write Pointer & I pointer
 *
 * https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 */
public class RemoveElements {
	public int removeElement(int[] nums, int val) {
		int N = nums.length;

		int i = 0;
		int writePtr = 0;

		while (i<N){
			if(nums[i] != val){
				if (i>writePtr){
					nums[writePtr] = nums[i];
				}

				writePtr++;
			}
			i++;
		}

		return writePtr;
	}
}
