package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

	private Graph g;

	@BeforeEach
	void setUp() {
		g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
	}

	@Test
	void BFS() {

		System.out.println("Following is Breadth First Traversal "+
		                   "(starting from vertex 2)");

		g.BFS(2);

	}

	@Test
	void DFS(){

		System.out.println("Following is Depth First Traversal "+
		                   "(starting from vertex 2)");
		g.DFS(2);
	}
}