/**
 * Performs a depth-first preorder traversal of a tree.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class DFS {
	
	private static int height;
	private static int nodesTraversed;
	
	/**
	 * Begins traversal of the tree. Once it is finished,
	 * it will print the number of nodes traversed and
	 * the height of the tree.
	 * @param aTree the tree to traverse
	 */
	public static void startTraversal(Tree aTree) {
		height = 0;
		nodesTraversed = 0;
		dfs(aTree.getRoot(), 1);
		System.out.println("Nodes traversed: " + nodesTraversed);
		System.out.println("Height of tree: " + height);
	}
	
	/**
	 * Traverses a node, printing out the data of the current node.
	 * Also keeps track of height.
	 * @param currentNode the node being traversed
	 * @param currentHeight the height of the current node
	 */
	private static void dfs(Node currentNode, int currentHeight) {
		nodesTraversed++;
		if (currentHeight > height) {
			height = currentHeight;
		}
		
		System.out.println("Traversing node: " + currentNode.getData());
		
		/* Children will only be traversed if they exist,
		 * so this implicitly accounts for leaf nodes. */
		if (currentNode.getlChild() != null) {
			dfs(currentNode.getlChild(), currentHeight + 1);
		}
		
		if (currentNode.getrChild() != null) {
			dfs(currentNode.getrChild(), currentHeight + 1);
		}
	}
	
}
