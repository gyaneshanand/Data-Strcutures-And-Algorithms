package Tree;

//class Node {
//
//    public int data;
//    public Node left;
//    public Node right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}

public class Representation {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
    }
}
