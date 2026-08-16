class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                List<String> newWord = new ArrayList<>();
                map.put(key, newWord);
            }
                map.get(key).add(word);
        }





        return new ArrayList<>(map.values());
    }
}
