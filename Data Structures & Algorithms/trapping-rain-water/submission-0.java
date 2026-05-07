class Solution {
    public int trap(int[] height) {

        int len = height.length;

        if(height == null && len == 0){
            return 0;
        }

        int l = 0, r = len-1 ;
        int leftMax = height[0], rightMax = height[len-1];
        int res = 0;

        while(l<r){

            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                res+=leftMax-height[l];

            }
            else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                res+=rightMax-height[r];
            }
        }
        return res;
        
    }
}
