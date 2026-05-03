class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
                nums[k++]= nums[i];
            }
            
        }

        return k; // before k index all the elements in array is not equal to val
                    // returning k-index; k is at 3rd index means there are 2 unique element


        
    }
}