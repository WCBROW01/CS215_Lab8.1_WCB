/**
 * Demo application that creates a tree and traverses it.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Application {

	/**
	 * Main method
	 * @param args height of the generated tree
	 */
	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]);
		
		System.out.println("Creating tree of height " + height);
		Tree myTree = new Tree();
		myTree.generatePracticeTree(height);
		System.out.println();
		
		System.out.println("Starting traversal");
		DFS.startTraversal(myTree);
	}

}
