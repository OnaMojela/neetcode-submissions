class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        int size =  arr.length;
        
        for(int i=0; i<size-1 ; i++){
            max = arr[i+1];
            for(int j=i+1; j<size-1 ; j++){
                if(arr[j+1]>max){
                    max=arr[j+1];
                }
            }
            arr[i] = max;
        }

        arr[size-1] = -1;

        return arr;
    }
}