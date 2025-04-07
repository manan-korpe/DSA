class recursion2{
    static int first = -1;
    static int last = -1;

    public static void occurance(String str,int index,char search){
        if(index == str.length()){
            System.out.println("first :"+first);
            System.out.println("last :"+last);
            return;
        }

        if(str.charAt(index) == search){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        occurance(str, index+1, search);
    }
    public static void main(String[] args){
        String str = "maaamsnsmansmss";
        occurance(str, 0, 'm');
    }
}