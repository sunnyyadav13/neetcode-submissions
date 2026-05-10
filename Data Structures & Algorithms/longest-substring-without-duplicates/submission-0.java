class Solution {
    public int lengthOfLongestSubstring(String s) {
        // zxyzxyz
        // abcaabbcdac

        int[] charSet = new int[256]; // ASCII
        Arrays.fill(charSet, -1);

        int l =0, r=0;
        int res = 0;

        while(r < s.length()){

            char ch = s.charAt(r);

            l = Math.max(charSet[ch]+1,l);
            charSet[ch] = r;

            res = Math.max(res, r-l+1);

            r++;
        }

        return res;
    }
}
