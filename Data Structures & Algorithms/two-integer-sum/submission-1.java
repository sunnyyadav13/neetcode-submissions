public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[][] freqMatrix = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            freqMatrix[i][0] = nums[i]; // value
            freqMatrix[i][1] = i; // index
        }

        Arrays.sort(freqMatrix, Comparator.comparingInt(a->a[0]));

        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int sum = freqMatrix[left][0] + freqMatrix[right][0];

            if(sum == target){

                return new int[]{Math.min(freqMatrix[left][1],freqMatrix[right][1]),
                Math.max(freqMatrix[left][1],freqMatrix[right][1])};
            }
            else if(sum < target){
                left++;
            }
            else {
                right--;
            }
        }

        return new int[0];
    }
}