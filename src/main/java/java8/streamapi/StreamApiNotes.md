# Stream API & Collectors

Why use streams? Efficient Operations 
1. In parallel, to leverage the computing power of the multicore cpu
2. Pipelined, to avoid unnecessary intermediary computations

So, what is stream? 
1. An object on which one can define operations
2. An object that does not hold any data
3. An object that should not change any data that it processes
4. An object able to process the data in one pass
5. An object optimised from algorithm point of view and be able to process the data in parallel