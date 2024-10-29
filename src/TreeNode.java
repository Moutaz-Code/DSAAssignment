public class TreeNode<E extends Comparable<E>> {
	protected E element; // TODO keep for now but delete later
	protected TreeNode<E> left, right;

	int key, value;
	boolean color;

	public TreeNode(int key, int value, boolean color) {
		this.key = key;
		this.value = value;
		this.color = color;
	}
	public boolean hasLeft () { return left != null;}
	public boolean hasRight () { return right != null;}
	public boolean hasTwoChildren () { return left != null && right != null;}
	public boolean isLeaf () { return left == null && right == null;} 
	
	 
  }
