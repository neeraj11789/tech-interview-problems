# DSA Preparation Repository
Data Structures And Problem Solving Deliberate Practice 

## Interview Learnings / Notes

### LinkedList -
* use prev, curr & next pointers
* use fakeHead and return fake.next()
* while reversing, need to track the next pointer so saved it in another variable

### Stack -
```
Stack<Character> stack = new Stack<Character>();
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
### Tips
* for valid parenthesis rather than inserting the orignal parentheses, insert the required parenthesis
* map.getOrDefault(c, 0) + 1
* Think about why extra information has been given. Since they have given the information about m, n we can use the tail to fill the array - https://leetcode.com/problems/merge-sorted-array/
* Check for array questions if you could solve it using 2 pointers
