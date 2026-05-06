class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            int diff = target-nums[i];

            if(mp.containsKey(diff)){
                return new int[]{Math.min(i+1,mp.get(diff)), Math.max(i+1,mp.get(diff))};
            }
            mp.put(nums[i],i+1);
            
        }

        return new int[2];
    }
}
