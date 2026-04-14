class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String word: strs){

            //converting and sorting
            char [] arr = word.toCharArray();
            Arrays.sort(arr);

            //storing a word as key
            String key = new String(arr);

            //adding words to the correct group
            map.computeIfAbsent(key, s-> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
