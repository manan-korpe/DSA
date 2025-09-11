import java.util.*;

//Time Complexity O(M * log n) 
//space complexity O(M)

public class q_202 {
    static public boolean isHappy(int n) {
        HashSet<Integer> hs= new HashSet<Integer>();

        while(n > 1 && !hs.contains(n)){
            hs.add(n);

            int temp = n, sum=0;
            while(temp>0){
                sum += Math.pow(temp % 10,2);
                temp /=10;
            }
            n = sum;
        }

        return n == 1 ? true : false;
    }
    public static void main(String[] args) {
        
    }
}

//optimized solution using two pointer and cycle dection
//Time Complexity O(M * log n) 
//space complexity O(M)
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    private int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}


