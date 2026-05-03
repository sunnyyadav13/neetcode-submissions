class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        //Insertion Sort divide first half in sorted and 2nd half in unsorted
        for(int i=1; i<n; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]> key){
                nums[j+1]= nums[j];
                j--;
            }

            nums[j+1] = key;
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