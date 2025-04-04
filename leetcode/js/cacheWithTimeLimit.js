var cash = function(params) {
    this.map = new Map();

    this.delete = function(key){
        this.map.delete(key);
    }
}

cash.prototype.set = function(key, value, duration){
    const hasKey = this.map.get(key) ? true :false ;

    if(hasKey){
        const {timeout} = this.map.get(key);
        clearTimeout(timeout);
    }

    const timeout = setTimeout(() => this.delete(key), duration);
    this.map.set(key,{timeout,value});

    return hasKey;
}

cash.prototype.get = function(key){
    if (this.map.has(key)) return this.map.get(key).value;

    return -1;
}

cash.prototype.coutn = function(){
    return this.map.size;
}

const c1 = new cash();

console.log(c1.set(1,10,500))
console.log(c1.coutn())
setTimeout(() => {
    console.log("get",c1.get(1))
    console.log(c1.coutn())
}, 300);