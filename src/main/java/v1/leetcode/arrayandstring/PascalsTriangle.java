package v1.leetcode.arrayandstring;

import java.util.ArrayList;
import java.util.List;


/**
 * @LEARNING: If able to define all the cases of the problem, then coding should not be difficult
 *
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();

		if (numRows < 1) return result;

		List<Integer> subList = new ArrayList<>();
		List<Integer> prevList = new ArrayList<>();

		for (int i=1; i<=numRows; i++){

			for (int count=1; count<=i; count++){
				subList.add(generateElement(prevList, count, i));
			}
			result.add(subList);
			prevList = subList;
			subList = new ArrayList<>();

		}

		return result;
	}

	private Integer generateElement(List<Integer> prevList, int index, int totalElements) {
		if (index == 1 || index == totalElements)
			return 1;
		else
			return prevList.get(index-1) + prevList.get(index-2); // Convert 1 index to 0 index
	}
}
