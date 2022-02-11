class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        if( a > b ) return false;
        int[] arr = new int[26];
        for(int i = 0; i<a; i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i<b-a; i++){
            if( anagram(arr) ) return true;
            arr[s2.charAt(i) - 'a']++;
            arr[s2.charAt(i + a) - 'a']--;
        }
        
        return anagram(arr);
    }
    
    public boolean anagram(int[] arr){
        for(int i : arr){
            if( i != 0 ) return false;
        }
        return true;
    }
}