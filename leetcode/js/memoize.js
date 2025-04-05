//when we store key as array form in Map so we need refrence of the stored array(key array) 
function memoize(fn){
    const map = new Map();
    let callCount = 0;
    return function(...args){
       const key = String(args);

        if(!key){
            return `call count : ${callCount}`;
        }
        
        if(map.has(key)){
            return map.get(String([...args])).value;
        }

        const ans = fn(...args);
        map.set(key,{value:ans});
        ++callCount;
        return ans;
    }
}

const sum = (a,b) => {
    return a+b;
};

const factorial = (n) => {
    if(n<=1){
        return 1;
    }
    return n*factorial(n-1);
}
const fibbonaci = (n) => {
    if(n<=1){
        return 1;
    }
    return fibbonaci(n - 1) + fibbonaci(n - 2);
}

const memoizeSum = memoize(sum);
const memoizefac = memoize(factorial);
console.log(memoizeSum(0,0));
console.log(memoizeSum(0,0));
console.log(memoizeSum());

// const memoizefib = memoize(fibbonaci);
// console.log(memoizefib(10));
// console.log(memoizefib(20));
// console.log(memoizefib(20));