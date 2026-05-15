class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;

        int maxF = 0; // most repeating char in substring
        int res = 0;

        for (int r = 0; r < s.length(); r++) {

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, map.get(s.charAt(r)));
            // substringlength - most repeating char in that substring
            while ((r - l + 1) - maxF > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);

        }

        return res;
    }
}