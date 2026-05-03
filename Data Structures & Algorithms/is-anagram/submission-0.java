class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        char[] tArray = t.toCharArray();

        for(int i=0; i<n; i++){
            char charS = s.charAt(i);
            boolean found = false;
            for(int j=0; j<m; j++){

                if(tArray[j]== charS){
                    tArray[j]= '#'; // to handle duplicate char in both string
                    found = true;
                    break;
                }
            }

            if(!found) return false; // return handle mis-match string
        }
        return true;
    }
}
