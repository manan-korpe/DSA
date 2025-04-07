function reverce(str,idx) {
    if(idx==0){
        console.log(str.charAt(idx));
        return;
    }
    console.log(str.charAt(idx));
    reverce(str,idx-1);
}
const value = "manan";
reverce(value,value.length-1)