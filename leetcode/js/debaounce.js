let debaounce = function(fn, t) {
    let lastCall;
    return function(){
        clearTimeout(lastCall);
        lastCall = setTimeout(() => {
            fn.apply(this,args);
        }, t);
    }
}