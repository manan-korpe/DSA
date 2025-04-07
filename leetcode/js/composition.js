let fun1 = (x)=>{
    return x+1;
}
let fun2 = (x)=>{
    return x*x;
}
let fun3 = (x)=>{
    return 2*x;
}

function composition(arr) {
    return function(x){
        let i=arr.length-1;
        while (i>=0){
            console.log(x);
            x = arr[i](x);
            i--;
        }
        return x;
    }
}

const temp = composition([fun1, fun2, fun3]);
console.log(temp(4));