import java.util.Scanner;

class Node{
    Node pre=null;
    int data;
    Node next=null;

    public Node(int value){
        this.data = value;
    }   
}

class DoublyList{
    private Node head=null;

    public void insertStart(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
    }
    
    public void insertEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node  tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.pre = tempNode;
        }
    }

    public void show(){
        Node tempNode = head;
        if(head != null){
            do{
                System.out.print(tempNode.data+" -> ");
                tempNode = tempNode.next;
            }while(tempNode != null);
        }
        System.out.println("null");
    }

    public void removeStart(){
        if(head == null){
            System.out.println("Your dosen't have data");
        }else{
            head = head.next;
            head.pre = null;
            System.out.println("Removed from Start Done");
        }
    }

    public void removeEnd(){
        if(head == null){
            System.out.println("Your dosen't have data");
        }else{
            Node tempNode = head;
            Node preNode = null;
            while(tempNode.next != null){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = null;
         System.out.println("Removed from End Done");
        }
    }

    public void removeByValue(int value){
         if(head == null){
            System.out.println("Your dosen't have data");
        }else{
            Node tempNode = head;
            Node preNode = null;
            boolean isFound = false;

            do{
                if(value == head.data){
                    removeStart();
                    isFound = true;
                    break;
                }else if(value == tempNode.data){
                    preNode.next = tempNode.next;
                    tempNode.next.pre = preNode;
                    isFound = true;
                    break;
                }
                preNode = tempNode;
                tempNode = tempNode.next;
            }while(tempNode.next != null);

            if(isFound){
                System.out.println("Value Removed");
            }else{
                System.out.println("Value not Found");
            }
        } 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyList list = new DoublyList();
        boolean isContinue = true;

        do{
            int choice;
            int value;
            System.out.println("|------------------------------|");
            System.out.println("| 1.Add into Start             |");
            System.out.println("| 2.Add into End               |");
            System.out.println("| 3.Remove from Start          |");
            System.out.println("| 4.Remove from End            |");
            System.out.println("| 5.Remove by value            |");
            System.out.println("| 6.show                       |");
            // System.out.println("| 7.Find                       |");
            System.out.println("| 0.exit                       |");
            System.out.println("|------------------------------|");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter value:");
                    value = sc.nextInt();
                    list.insertStart(value);
                    System.out.println("Value inserted in Start");
                    break;
                case 2:
                    System.out.print("Enter value:");
                    value = sc.nextInt();
                    list.insertEnd(value);
                    System.out.println("Value inserted in End");
                    break;
                case 3:
                    list.removeStart();
                    break;
                case 4:
                    list.removeEnd();
                    break;
                case 5:
                    System.out.print("Enter value:");
                    value = sc.nextInt();
                    list.removeByValue(value);
                    break;
                case 6:
                    list.show();
                    break;
                // case 7:
                //     System.out.print("Enter value:");
                //     value = sc.nextInt();
                //     list.find(value);
                //     break;
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