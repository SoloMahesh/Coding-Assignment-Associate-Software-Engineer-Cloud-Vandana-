const arr = [5, 2, 9, 1, 5, 6];

for(var i=0;i<arr.length-1;i++){
    for(var j=i;j<arr.length;j++){
        if (arr[i]<arr[j]) {
            arr[i]=arr[i]+arr[j]
            arr[j]=arr[i]-arr[j]
            arr[i]=arr[i]-arr[j]
        }
    }
}
console.log(arr); 