public class Basic {
    public static void main(String[] args) {
        Integer[] c1 = new Integer[3];
        int[] c2 = new int[2];

        for(int i=0; i<c1.length; i++){
            System.out.println(c1[i]); //default value for all element is null
        }

        for(int i=0; i<c2.length; i++){
            System.out.println(c2[i]); //default value for all element is 0
        }

        
    }
}
