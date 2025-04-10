import java.util.Scanner;

public class PrimeSubOp {
    static boolean isPrime(int num){
        if(num<2){
            return false;
        }

        for(int i=2;i<num;i++){
            if(num%i!=0){
                return false;
            }
        }

        return true;
    }

    static boolean opration(int[] nums){
        Scanner sc =new Scanner(System.in);
        boolean[] pickedArr = new boolean[nums.length];
        int count = 0;
        boolean isContinue = true;
        int index = -1;
        do{
            int choice;
            System.out.println("-----------menu-----------");
            System.out.println("1.coninue");
            System.out.println("2.exit");
            System.out.println("---------------------------");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("pick index");
                    index = sc.nextInt();
                    if(!pickedArr[index]){                        
                        System.out.println("Enter prime number");
                        int prime_num = sc.nextInt();
                        if(!isPrime(prime_num) && nums[index] < prime_num){
                            break;
                        }
                        nums[index] = nums[index] - prime_num;
                        pickedArr[index] = true;
                        count++;
                        System.out.println("success.....");
                    }else{
                        System.out.println("alredy picked " +index+" index");
                    }
                    break;
                case 2:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        }while (isContinue && count<=nums.length);

        //check array is sorted or not
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
        int[] arr = {5,8,3};

        boolean ans = opration(arr);
        System.out.println(ans);
    }
}
