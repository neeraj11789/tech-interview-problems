package v1.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	// Number of Vertices
	private int V;

	// Adjency Lists
	private LinkedList<Integer> adj[];

	/**
	 * Constructor for graph
	 * @param v
	 */
	public Graph(int v) {
		V = v;
		adj = new LinkedList[v];
	    for (int i = 0; i< v; i++) {
		    adj[i] = new LinkedList<>();
	    }
	}


	/**
	 * Add the edges for the vertex V
	 * @param v
	 * @param w
	 */
	void addEdge(int v, int w){
		adj[v].add(w);
	}

	/**
	 * Breadth First Traversal from Node n
	 * @param n
	 */
	void BFS(int n){

		boolean visited[] = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();

		int current = n;
		// mark current as visited and push to the queue
		visited[current] = true;
		queue.offer(current);



	    while (queue.size()!=0){
			current = queue.poll();
		    visited[current] = true;
            System.out.println("Visiting " + current);

		    Iterator<Integer> iterator = adj[current].listIterator();
		    while (iterator.hasNext()){

		    	current = iterator.next();
		    	if (!visited[current]){
		    		queue.offer(current);
			    }
		    }
	    }
	}

	void DFSUtil(int v,boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.println("Visiting " + v);

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].iterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v)
	{
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}
}
