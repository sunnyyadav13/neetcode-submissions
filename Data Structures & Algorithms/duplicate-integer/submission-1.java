class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        //Selection Sort
        for(int i=0; i<n-1; i++){
            int min_index = i;

            for(int j=i+1; j<n; j++){
                if(nums[j] < nums[min_index]){
                    min_index = j;
                }
            }

            //swap 
            int t = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = t;
        }
         // checking duplicate
        for(int k=1;k<n;k++){
            if(nums[k] == nums[k-1]){
                return true;
            }
        }
        return false;
    }
}