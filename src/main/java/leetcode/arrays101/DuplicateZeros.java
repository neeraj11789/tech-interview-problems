package leetcode.arrays101;

/**
 * https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 *
 * @NOTE:
 * The idea is very simmple that you count the number of
 * zeros then consider inserting into a bigger size
 * array. TRICK is to always check the boundary condition
 * while inserting the element. So we are abiding the
 * in place size restrictions.
 *
 * @LEARNING - Write Pointer check while every insert
 * if(writePtr < N) arr[writePtr] = arr[i];
 *
 */
public class DuplicateZeros {
	public void duplicateZeros(int[] arr) {
		int N = arr.length;
		int countZeros = 0;

		for(int ele: arr)
			if(ele==0) countZeros++;

		int i = N-1;
		int writePtr = N-1 + countZeros;

		while(i>=0){
			if(arr[i] !=0){// we see a non-zero. Just Copy
				if(writePtr < N) arr[writePtr] = arr[i];
				writePtr--;
			}else{ // we see a zero
				// copy zero 2 times
				if(writePtr < N) arr[writePtr] = arr[i];
				writePtr--;
				if(writePtr < N) arr[writePtr] = arr[i];
				writePtr--;
			}
			i--;
		}

	}
}
