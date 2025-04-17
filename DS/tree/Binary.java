public class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int value){
        this.data = value;
    }
}

public class Binary {
    public Node root ; 

    void insert(int value){
        this.root = insertrec(this.root,value);
    }

    public Node insertrec(Node root, int value){
        if(root == null){
            return new Node(value);
        }

        if(value < root.data){
            root.leftNode = insertrec(root.leftNode, value);
        } else if(value > root.data){
            root.rightNode = insertrec(root.rightNode, value);
        }

        return root;
    }


    public void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.leftNode);
        System.out.println(root.data);
        inOrder(root.rightNode);
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }
    
    public void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
       Binary obj = new Binary();

       obj.insert(15);
       obj.insert(9);
       obj.insert(17);
       obj.insert(4);
       obj.insert(10);

       System.out.println("in order treaversion");
       obj.inOrder(obj.root);
      
       System.out.println("pre order treaversion");
       obj.preOrder(obj.root);

       System.out.println("post order treaversion");
       obj.postOrder(obj.root);
    }
}
