import java.util.Scanner;

public class Node{
    int data;
    Node next=null;

    public Node(int value){
        this.data = value;
    }
}

class Basic{
    private Node head = null;

    public void push(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Your stack is empty");
        }else{
            head = head.next;
        }
    }

    public void peek(){
        System.out.println(head.data);
    }

    public void isEmpty(){
        if(head == null){
            System.out.println("stack is empy");
        }else{
            System.out.println("stack is not empty");
        }
    }

    public void size(){
        Node tempNode = head; 
        int count=0;
        while(tempNode != null){
            count++;
            tempNode = tempNode.next;
        }
        System.out.println("total element in stack is : "+count);
    }

    public void show(){
        Node tempNode = head; 
        while(tempNode != null){
            System.out.println("|  "+tempNode.data+"  |");
            tempNode = tempNode.next;
        }
        System.out.println("|~~~~~~|");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Basic stack = new Basic();
        boolean isContinue = true;

        do{
            int choice;
            int value;
            System.out.println("");
            System.out.println("|------------------------------|");
            System.out.println("| 1.push                       |");
            System.out.println("| 2.pop                        |");
            System.out.println("| 3.peek                       |");
            System.out.println("| 4.isEmpty                    |");
            System.out.println("| 5.size                       |");
            System.out.println("| 6.show                       |");
            System.out.println("| 0.exit                       |");
            System.out.println("|------------------------------|");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter value :");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.isEmpty();
                    break;
                case 5:
                    stack.size();
                    break;
                case 6:
                    stack.show();
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(isContinue);

    }
}