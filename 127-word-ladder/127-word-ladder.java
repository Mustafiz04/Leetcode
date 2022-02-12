class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        HashSet<String> hs = new HashSet<>();
        boolean isPresent = false;
        for(String word : wordList){
            hs.add(word);
            if(word.equals(endWord)){
                isPresent = true;
            }
        }
        if( !isPresent ){
            return 0;
        }
        Queue<String> q = new ArrayDeque<>();
        q.add(beginWord);
        int depth = 0;
        while( !q.isEmpty() ){
            depth += 1;
            int lsize = q.size();
            while( lsize-- > 0 ){
                String word = q.remove();
                StringBuilder sb = new StringBuilder(word);
                for(int i = 0; i < sb.length(); i++){
                    char curr = sb.charAt(i);
                    for(char ch = 'a'; ch <= 'z'; ch++){
                        if( ch == curr ){
                            continue;
                        }
                        sb.deleteCharAt(i);
                        sb.insert(i, ch);
                        if( sb.toString().equals(endWord) ){
                            return depth + 1;
                        }
                        if( hs.contains(sb.toString()) ){
                            hs.remove(sb.toString());
                            q.add(sb.toString());
                        }
                        sb.deleteCharAt(i);
                        sb.insert(i,curr);
                    }
                }
            }
        }
        return 0;
    }
}