package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree tree = new BinaryTree();
tree.insert(8);
tree.insert(7);
tree.insert(12);
tree.insert(15);
tree.insert(2);
tree.insert(5);

tree.inorder();
tree.preorder();

	}

}
