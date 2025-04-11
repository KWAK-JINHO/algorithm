class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> cnts = new HashMap<>();

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        
        for (String word : words) {
            if(!ban.contains(word)) {
                cnts.put(word, cnts.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(cnts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}