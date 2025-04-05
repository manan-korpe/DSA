Array.prototype.snail = function(rowsCount, colsCount) {
    const newArray = Array.from({length:rowsCount},()=>Array(colsCount));
    if((rowsCount * colsCount)!==this.length){
        return [];
    }
   
    let startIndex = 0
    for(let j=0;j<colsCount;j++){
        if(j%2==0){
            for(let i=0;i<rowsCount;i++){
             newArray[i][j] = this[startIndex]; 
             startIndex++;
            }
        }else{
            for(let i=rowsCount-1;i>=0;i--){
                newArray[i][j] = this[startIndex]; 
                startIndex++;
            }
        }
    }   
    return newArray;
}

const arr = [19, 10, 3, 7, 9, 8, 5, 2, 1, 17, 16, 14, 12, 18, 6, 13, 11, 20, 4, 15];
console.log(arr.snail(5,4));