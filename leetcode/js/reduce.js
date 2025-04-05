function sum(num,init){
    return init + num;
}

function sum(num,init){
    return init + num*num;
}

let reduce = function(nums, fn, init){
    let i=0; 
    while (i<nums.length) {
        init = fn(nums[i],init);
        i++;
      }
      return init;
}

const ans = reduce([1,2,3,4],sum,0);
console.log(ans);