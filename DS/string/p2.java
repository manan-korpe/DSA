public class p2 {
    public static void main(String[] args){
        char a = 'z';
        char b = '1';
        char c = '/';
        
        System.out.println(Character.isDigit(a) + " " + Character.isDigit(b));  // 0 1
        System.out.println(Character.isLetter(a) + " " + Character.isLetter(b)); // 1 0
        System.out.println(Character.isLetterOrDigit(a) + " " + Character.isLetterOrDigit(b)); //1 1
        System.out.println(Character.isLowerCase(a) + " " + Character.isLowerCase(b) + " " + Character.isLowerCase(c)); //1 0 0
        System.out.println(Character.isWhitespace(a) + " " + Character.isWhitespace(b) + " " + Character.isWhitespace(c)); //1 0 0
        System.out.println(Character.getNumericValue(a) + " " + Character.getNumericValue(b) + " " + Character.getNumericValue(c)); //1 0 0
        System.out.println(Character.valueOf(a) + " " + Character.valueOf(b) + " " + Character.valueOf(c)); //1 0 0

        //convert character to String
        String s1 = String.valueOf(a);
        System.out.println(s1);

        String s2 = Character.toString(a);
        System.out.println(s2);

        String s3 = "" + a;
        System.out.println(s3);
    }    
}
