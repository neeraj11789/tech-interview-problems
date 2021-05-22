package v1.software;

import v1.datastructures.BTNode;
import v1.datastructures.BinaryTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareApplication.class, args);

		binaryTree();

	}

	public static void binaryTree(){
		 /* creating a binary tree and entering
        the nodes */
		BinaryTree tree = new BinaryTree();
		tree.root = new BTNode(1);
		tree.root.left = new BTNode(2);
		tree.root.right = new BTNode(3);
		tree.root.left.left = new BTNode(4);
		tree.root.left.right = new BTNode(5);
		tree.inorder();
	}

}
