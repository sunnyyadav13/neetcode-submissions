class Solution {
    public int maxProfit(int[] arr) {

        int n = arr.length;

        int[] prefix =new int[n];
        int[] suffix =new int[n];

        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = Math.min(prefix[i-1],arr[i]);
        }

        suffix[n-1] = arr[n-1];
        for(int j = n-2;j>=0;j--){
            suffix[j] = Math.max(suffix[j+1], arr[j]);
        }

        int MaxProfit =0;

        for(int i=0;i<n;i++){
            MaxProfit = Math.max(MaxProfit, suffix[i]-prefix[i]);
        }        
        

        return MaxProfit;
    }
}
