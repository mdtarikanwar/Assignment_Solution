var arr = new Array();
arr.push(3);
arr.push(4);
arr.push(6);
arr.push(1);
arr.push(3);
arr.push(2);
arr.push(10);

for(var i=0; i<arr.length; i++) {
    for(var j=i+1; j<arr.length; j++) {
        if (arr[i] > arr[j]) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
}

console.log(arr);