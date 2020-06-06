package leetcode.junechallenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @NOTE: Coming up with proper sorting strategy is half the battle. Sort first on the basis of height,
 * then on the number of people right before the current person
 *
 * @LEARN: Insertion Sort Used to insert the elements finally. This could be hint at values less than 1100 as
 * described by Question
 *
 * https://leetcode.com/problems/queue-reconstruction-by-height/
 *
 * Explanation
 * https://www.youtube.com/watch?v=khddrw6Bfyw
 *
 * #revise #redo #comparator
 */
public class QueueReconstructionByHeight {
	/**
	 * @param people
	 * @return
	 */
	public int[][] reconstructQueue(int[][] people) {
		int M = people.length;
		// Edge Case
		if(M==0) return people;

		int N = people[0].length;
		// Edge Case
		if (N==0) return people;

		int[][] res = new int[M][N];

		// init with -1
		for (int i = 0; i < M; i++) {
			res[i][0] = -1;
		}

		Comparator<int[]> comparator = (int[] a, int[] b) -> a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
		Arrays.sort(people,comparator);

		for (int i = 0; i < M; i++) {
			int count = people[i][1];

			for (int j = 0; j < M; j++) {
				if(res[j][0]==-1 && count==0){
					res[j][0] = people[i][0];
					res[j][1] = people[i][1];
					break;
				}else if(res[j][0]==-1 || res[j][0]>=people[i][0]){
					count--;
				}
			}
		}

		return res;
	}
}