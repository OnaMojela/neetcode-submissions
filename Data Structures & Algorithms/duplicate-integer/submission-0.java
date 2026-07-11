class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;

        for(int i = 0; i<size ; i++){
            int temp = nums[i];
            for(int j=i+1; j<size; j++){
                if(temp == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}