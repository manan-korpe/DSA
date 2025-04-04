class Triplate {
    static public void main(String[] args) {
       int[] nums = {1000000,1,1000000};
       long i=0;
       long diff = 0;
       long ans = 0;

       for(int x=2;x<nums.length;x++){
        // if(nums.length<2){
        //     ans = 0;
        //     break;
        // }
        i = Math.max(i,nums[x-2]);
        if(x>=1){
            diff = Math.max(diff,i - nums[x-1]);
        }
        if(x>=2){
            ans = Math.max(ans,diff*nums[x]);
        }
       }

       System.out.println(ans);
    }
}