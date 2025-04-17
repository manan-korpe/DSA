class Node{
    int data;
    Node next=null;

    Node(int value){
        this.data = value;
    }
}


public class addToNum {
    public Node head;

    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;
    
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
    
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
    
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
    
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
    
        return dummy.next;
    }
    
    public static void traverse(Node list) {
        Node temp = list;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        addToNum obj = new addToNum();
        obj.insert(9);
        obj.insert(9);
        obj.insert(9);
        obj.insert(9);
        obj.insert(9);
        obj.insert(9);
        obj.insert(9);

        addToNum obj2 = new addToNum();
        obj2.insert(9);
        obj2.insert(9);
        obj2.insert(9); 
        obj2.insert(9); 
        
        Node asn = obj.addTwoNumbers(obj.head, obj2.head);
        traverse(asn);
    }
}
