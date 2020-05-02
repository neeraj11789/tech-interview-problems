package leetcode;


/**
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

}
