class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resMap = new HashMap<>();

        for(String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            String s = new String(charArray);

            resMap.putIfAbsent(s,new ArrayList<>());
            resMap.get(s).add(word);
        }

        return new ArrayList<>(resMap.values());
    }
}
