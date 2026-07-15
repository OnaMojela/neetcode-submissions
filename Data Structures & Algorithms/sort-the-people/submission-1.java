class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length-1;i++){
            for(int j = i+1; j<heights.length;j++){
                if(heights[j] > heights[i]){ 
                    int temp = heights[j];
                    String sTemp = names[j];
                    heights[j] = heights[i];
                    names[j] = names[i];
                    heights[i] = temp;
                    names[i] = sTemp;
                }
            }
        }

        return names;

    }
}