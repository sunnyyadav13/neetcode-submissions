class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);

        int streak=1 , count =1;
        for(int i=1;i<n;i++){
            
            if(nums[i-1] == nums[i]) continue;

            if(nums[i-1]+1 == nums[i]){
                count++;
            }
            else{
                count = 1;
            }

            streak = Math.max(streak, count);
        }

        return streak;

    }
}
