public class Solution {

    public String encode(List<String> str){

        StringBuilder res = new StringBuilder();

        for(String word : str){
            res.append(word.length()).append("#").append(word);
        }

        return res.toString();

    }

    public List<String> decode(String str){
        List<String> stringList = new ArrayList<>();

        if(str.length() == 0 ) return new ArrayList<>();

        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){  // j stops right at '#'
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j)); // [i,j)
            i = j+1;
            j = i+len;

            stringList.add(str.substring(i,j));
            i = j;

        }

        return stringList;

    }
}