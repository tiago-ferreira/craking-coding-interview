package br.com.mio.di.bao.trees;

public class IsThisABinarySearchTree {

	private static boolean checkBST(Node root) {
	    return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean check(Node node, int min, int max){
	   return (node == null) || 
	        (min < node.root && node.root < max && 
	        check(node.left, min, node.root) && 
	        check(node.right, node.root, max));
	}
	
	public static void main(String[] args) {
		Node node = new Node(4);
		node.insert(2);
		node.insert(3);
		node.insert(1);
		node.insert(6);
		node.insert(7);
		node.insert(5);
		System.out.println(checkBST(node));
	}
	
}

class Node {
    int root;
    Node left;
    Node right;
    

    public Node(int root){
      this.root = root;
      left = right = null;
    }
    
    public void insert(int insertValue){
        if (insertValue < root){
          if (left == null)
        	  left = new Node(insertValue);
          else
        	  left.insert(insertValue);
        } else if (insertValue > root){
          if (right == null)
        	  right = new Node(insertValue);
          else
        	  right.insert(insertValue);
        }
      }
 }

