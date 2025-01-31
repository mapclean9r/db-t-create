package treeDB;

public class Node {
    Object object;
    Node left;
    Node right;
    public Node(Object object, Node left, Node right){
        this.object = object;
        this.left = left;
        this.right = right;
    }

}
