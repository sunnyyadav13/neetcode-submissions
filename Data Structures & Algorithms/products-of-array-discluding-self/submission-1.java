class Solution {
    public int[] productExceptSelf(int[] nums) {

        //Most Optimial solution
        int n = nums.length;
        int[] res = new int[n];

        // creating prefix array below
        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1]*nums[i-1]; // res[i-1] is the product of all before element i-1
        }

        int postfix = 1;
        for(int i =n-1;i>=0;i--){
            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }

        return res;
    }
}  
