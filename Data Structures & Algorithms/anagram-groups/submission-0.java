class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String str : strs){

            int count[] = new int[26];
            for(char c: str.toCharArray()){
                count[c-'a']++;
            }

            String strCount = Arrays.toString(count);
            res.putIfAbsent(strCount, new ArrayList<>());
            res.get(strCount).add(str); 

        }

        return new ArrayList<>(res.values());
    }
}
