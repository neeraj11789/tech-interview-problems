package v1.leetcode.arrays101;

public class MoveZeros {

	public void moveZeroes(int[] nums) {

		int N = nums.length;

		int readPtr = 0;
		int writePtr = 0;


		while (readPtr < N){

			if(nums[readPtr] != 0){

				if(readPtr>writePtr){
					nums[writePtr] = nums[readPtr];
				}
				writePtr++;
			}

			readPtr++;
		}


		while (writePtr < N) nums[writePtr++] = 0;

	}

}
