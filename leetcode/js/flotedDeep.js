// function deepCheck(arr,n){
//     if(n<=0){
//         return arr;
//     }
//     return arr.flat(n);
// }


function deepCheck(arr,n){
        // if(n===0){
        //     return arr;
        // }
        let i=0;
        while(i<n){
            let j=0;
            while (j<arr.length) {
                let val = arr[j];
                if(Array.isArray(val)){ //check value is array or not is it is array then use splice method 
                    arr.splice(j,1,...val);     //add from j , remove 1 element from that index, ...val is spreading the array
                    j += val.length;  //incress j steps because we have spreaded array in original array thats why size of array increaced on original array
                }else{
                    j++;
                }
            }
            i++;
        }
        return arr
}

const arr = [1,2,3,[4,5,6],[7,8,[9,10,11],12],[13,14,15]];
const ans = deepCheck(arr,0);
console.log(ans);