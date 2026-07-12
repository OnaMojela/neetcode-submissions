class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int size = s.length();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        for(int i=0; i<size-1 ; i++){
            for(int k=i+1 ; k<size; k++){
                if(arr1[i]>arr1[k]){
                    char temp = arr1[k];
                    arr1[k] = arr1[i];
                    arr1[i] = temp;
                }
                if(arr1[i]==arr1[k]){
                    char temp = arr1[i+1];
                    arr1[i+1] = arr1[k];
                    arr1[k] = temp;
                }
            }
            for(int j=i+1 ; j<size; j++){
                if(arr2[i]>arr2[j]){
                    char temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
                if(arr2[i]==arr2[j]){
                    char temp = arr2[i+1];
                    arr2[i+1] = arr2[j];
                    arr2[j] = temp;
                }
            }
            
        }

        for(int i = 0; i<size ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;

    }
}
