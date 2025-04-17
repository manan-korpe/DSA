public class Node{
    int data,height;
    Node leftNode;
    Node rightNode;

    public Node(int value){
        this.data = value;
        this.height = 1;
    }
}

public class AVLTree {
    public Node root ; 

    void insert(int value){
        this.root = insertrec(this.root,value);
    }
    
    int height(Node N) {
        return (N == null) ? 0 : N.height;
    }

    int getBalance(Node N) {
        return (N == null) ? 0 : height(N.leftNode) - height(N.rightNode);
    }

    Node rightRotate(Node y) {
        Node x = y.leftNode;
        Node T2 = x.rightNode;

        x.rightNode = y;
        y.leftNode = T2;

        y.height = Math.max(height(y.leftNode), height(y.rightNode)) + 1;
        x.height = Math.max(height(x.leftNode), height(x.rightNode)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.rightNode;
        Node T2 = y.leftNode;

        y.leftNode = x;
        x.rightNode = T2;

        // Update heights
        x.height = Math.max(height(x.leftNode), height(x.rightNode)) + 1;
        y.height = Math.max(height(y.leftNode), height(y.rightNode)) + 1;

        return y;
    }

    public Node insertrec(Node root, int value){
        if(root == null){
            return new Node(value);
        }

        if(value < root.data){
            root.leftNode = insertrec(root.leftNode, value);
        } else if(value > root.data){
            root.rightNode = insertrec(root.rightNode, value);
        }else{
            return root;
        }
        root.height = 1 + Math.max(height(root.leftNode), height(root.rightNode));
        
        int balance = getBalance(root);

        if (balance < -1 && value > root.rightNode.data)
        return leftRotate(root);

        if (balance > 1 && value > root.leftNode.data) {
            root.leftNode = leftRotate(root.leftNode);
            return rightRotate(root);
        }

        if (balance < -1 && value < root.rightNode.data) {
            root.rightNode = rightRotate(root.rightNode);
            return leftRotate(root);
        }
        return root;
    }   

    public void inOrder(Node node) {
        if (root != null) {
            inOrder(node.leftNode);
            System.out.print(root.data + " ");
            inOrder(node.rightNode);
        }
    }

    public static void main(String[] args) {
        Binary obj = new Binary();

       obj.insert(8);
       obj.insert(9);
       obj.insert(10);
       obj.insert(11);
       obj.insert(12);
       obj.insert(13);

       obj.inOrder(obj.root);
    }
}
