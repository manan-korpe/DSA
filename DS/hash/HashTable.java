import java.util.Scanner;


class HashTable{
    public String[] hash_table = new String[10];

    public int hash(String value){
        int sum=0;
        for(int i=0;i<value.length();i++){
            sum +=(int) value.charAt(i);
        }

        return sum % 10;
    }

    public void add(String value){
        System.out.println(value);
        int hash_code = hash(value);
        this.hash_table[hash_code] = value;
        System.out.println("value added in hash table");
    }

    public void find(String value){
        int hash_code = hash(value);
        System.out.println("value in hash table at "+hash_code+" index");

    }

    public void show(){
        for(String element:this.hash_table){
            System.out.println(element);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashTable ht = new HashTable();
        boolean iscontinue = true;

        do{
            int choice;
            String value;
            System.out.println("");
            System.out.println("|------------------------------|");
            System.out.println("| 1.add                        |");
            System.out.println("| 2.find                       |");
            System.out.println("| 3.show                       |");
            System.out.println("| 0.exit                       |");
            System.out.println("|------------------------------|");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter value:");
                    value = sc.nextLine();
                    ht.add(value);
                    break;
                case 2:
                    System.out.print("Enter value");
                    value = sc.nextLine();
                    ht.find(value);
                    break;
                case 3:
                    ht.show();
                    break;
                 case 0:
                    iscontinue = false;
                    break;
                default:
                    System.out.println("Enter valid value");
                    break;
            }
        }while(iscontinue);
       
    }
}