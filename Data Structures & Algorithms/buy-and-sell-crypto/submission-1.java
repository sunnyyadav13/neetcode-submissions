class Solution {
    public int maxProfit(int[] arr) {

       int n = arr.length;

        // SLIDING WINDOW APPROACH
        int maxP = 0;
        int l = 0,r = 1;
        while(r < n){
            if(arr[l] < arr[r]){
                maxP = Math.max(maxP,arr[r]-arr[l]); // l stick to minimum index, only r will r++
            }
            else{
                l = r;
            }

            r++;

        }

        return maxP;
    }
}
