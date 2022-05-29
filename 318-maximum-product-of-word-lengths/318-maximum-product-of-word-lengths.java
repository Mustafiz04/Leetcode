class Solution {
    public int maxProduct(String[] words) {
       int n = words.length;
        int[] bitmask = new int[n]; 
        int max = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<words[i].length(); j++) {
                int index = words[i].charAt(j) - 'a';
                
                bitmask[i] |= (1 << index);
            }
            
            for(int j=0; j<i; j++) {
                if( (bitmask[i] & bitmask[j]) == 0 ) 
                    max = Math.max(max, words[i].length()*words[j].length());	
            }
        }

        return max; 
    }
}