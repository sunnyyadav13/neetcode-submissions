class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int num :nums){
            set.add(num);
        }

        
        int maxChain =0;
        for(int num :nums){
            int count =1;

            while(set.contains(++num)){
                count++;
            }
            maxChain = Math.max(maxChain,count);

        }

        return maxChain;

    }
}
