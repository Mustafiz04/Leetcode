class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int c = 0;
        for(int i=0; i<typed.length(); i++){
            if(c < name.length() && name.charAt(c) == typed.charAt(i))   c++;
            else if(i == 0 || typed.charAt(i) != typed.charAt(i-1))  return false;
        }
        return c == name.length();
    }
}