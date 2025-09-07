import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] c1 = new int[5];
        
        Arrays.fill(c1,10);
        
        int[] newC1 = Arrays.copyOf(c1,2);
        int[] newC2 = Arrays.copyOfRange(c1,1,3);

        boolean ans = Arrays.equals(newC1,newC2); //Compares values, not just references.
        System.out.println(ans);
        String str = Arrays.toString(c1);
        System.out.println(str + "a"); //it is string
    }
}
