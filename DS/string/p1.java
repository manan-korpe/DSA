public class p1 {
    static public void main(String[] args) {
        //String is a class in java
        //immutable object
        //sequence of characters
        //stored in heap memory
        //internally uses char array to store characters

        String str = "Hello";
        System.out.println(str);

        char ch = str.charAt(0);
        System.out.println(ch);

        int len = str.length();
        System.out.println(len);

        String substr = str.substring(1, 4);  // from index 1 to 3
        System.out.println(substr);

        int idx = str.indexOf('e',3); // index of first occurrence of 'e' after index 3
        System.out.println(idx);

        String replacedStr = str.replace('H', 'h'); //return new String
        System.out.println(replacedStr);

        String upperStr = str.toUpperCase();    
        System.out.println(upperStr);

        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);

        String trimmedStr = "  Hello World  ".trim(); 
        System.out.println(trimmedStr);

        String[] words = str.split(""); 
        for (String word : words) {
            System.out.println(word);
        }

        //case-sensitive comparison and returns boolean
        //if compare to another string like normal == then it compares reference  [ObjectAddress == ObjectAddress] not values
        boolean isEqual = str.equals("Hello"); 
        System.out.println(isEqual); 

        System.out.println(str.indent(1));
        System.out.println("    mcmdcm".strip());  //same as trim but better for unicode
        
    }
}
