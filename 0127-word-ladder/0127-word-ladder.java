class Solution {

    public List<String> neighbours(String word, HashSet<String> set) {
        List<String> neighbours = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (ch == word.charAt(i)) continue;
                String newWord = word.substring(0, i) + ch + word.substring(i + 1);
                if (set.contains(newWord)) {
                    neighbours.add(newWord);
                }
            }
        }
        return neighbours;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        if (set.contains(beginWord)) set.remove(beginWord);

        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String node = q.poll();

                if (node.equals(endWord)) return level;

                List<String> list = neighbours(node, set);

                for (String w : list) {
                    q.offer(w);
                    set.remove(w);
                }
            }

            level++;
        }

        return 0;
    }
}
