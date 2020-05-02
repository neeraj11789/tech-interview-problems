# DSA Preparation Repository
Data Structures And Problem Solving Deliberate Practice 

## Interview Notes

### LinkedList -
* use prev, curr & next pointers
* use fakeHead and return fake.next()
* while reversing, need to track the next pointer so saved it in another variable

### Stack -
```
Stack<Character> stack = new Stack<Character>();

// Iterating over stack
Iterator<Character> iterator = stack.iterator();
while(iterator.hasNext()){
    Character c = iterator.next();
    sb.append(c);
}

```

### Queue -
```
Queue<Node> q = new LinkedList<Node>();
```

### HashMap -
```
// Single Element HashMap
Map.Entry<Integer,Integer> majorityEle = null;
// Interator for Hashmap
Iterator iterator = countMap.entrySet().iterator();
        while(iterator.hasNext()){
            // We need to convert the values as it is object
            Map.Entry currentEle = (Map.Entry) iterator.next();
```
OR
```
Map<Integer, Integer> counterMap = new HashMap<>();
for(Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
        pq.offer(entry);
    }
```

### Heaps

Important Point to remember we use o1-o2 for ascending order and o2-o1 for ascending order
More Details on how to use Comparator Interface [here](https://github.com/neeraj11789/famng/blob/master/src/test/java/javapractice/MovieTest.java)

```
// Create the PriorityQ by defining the Order of Elements - Using Lambda
PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(k, (o1,o2)-> o1.getValue() - o2.getValue());

// Create the PriorityQ by defining the Order of Elements - Using Comparator Interface
PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(k, Comparator.comparingInt(Map.Entry::getValue));

```
For Creating the PriorityQ with LIMITED SIZE. Since Insertion and Heapify Operation comes with Olog(n) complexity, Limiting the size of the Heap would improve the running time of Algorithm 
```
pq.offer(iterator.next());
if (pq.size() > SIZE_LIMIT)
    pq.poll();
```

* Check Heap Implementation as Inserting/BubbleUp/Sink are important functions to know
* https://algorithms.tutorialhorizon.com/heap-sort-java-implementation/

### Set
```
//Set Example -
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
```

### Character -
```
// String to Character Array =>
for (char c : s.toCharArray()){}
```

### Arrays - 
Sort and equals utility
```
public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
```

### Template for In-Memory Operations with Array -
```
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
```

### Tips
* for valid parenthesis rather than inserting the orignal parentheses, insert the required parenthesis
* map.getOrDefault(c, 0) + 1
* Think about why extra information has been given. Since they have given the information about m, n we can use the tail to fill the array - [Merge Sorted Arrays](https://leetcode.com/problems/merge-sorted-array/)
* For Merge Sort Type of Questions - Use AND conditions to manage pointers while copying. Also, remember to copy rest of the remaining elements [Squares of Sorted Array](https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3261/)
* Check for array questions if you could solve it using 2 pointers. Sometimes we might need different ReadPointer & WritePointer as in [Remove Duplicates from Sorted Array](https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3255/)

