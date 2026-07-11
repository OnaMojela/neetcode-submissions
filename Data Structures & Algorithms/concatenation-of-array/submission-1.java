class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; // =4
        int sizeNew = n*2; // = 8
        int[] ans = new int[sizeNew];

        for(int i = 0; i<n ; i++){
            ans[i] = nums[i];
        }

        for(int k = n; k<sizeNew ; k++){
            ans[k] = nums[k-n];
        }
        return ans;
    }
}