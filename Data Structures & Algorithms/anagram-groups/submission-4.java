class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] freq = new int[26];

            // Count characters
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            // Build a unique key from frequencies
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append('#').append(count);
            }
            String key = keyBuilder.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());

        
// Map<String, List<String>> map = new HashMap<>();

//         for (String word : strs) {
//             char[] arr = word.toCharArray();
//             Arrays.sort(arr);                // O(k log k)
//             String key = new String(arr);

//             map.computeIfAbsent(key, s -> new ArrayList<>()).add(word);
//         }
//         return new ArrayList<>(map.values());

    }
}