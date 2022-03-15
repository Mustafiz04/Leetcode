class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = 0; i<n; i++){
            char c = arr[i];
            if( c == '(' ){
                count++;
            }else if( c == ')' ){
                if( count == 0 ){
                    arr[i] = '#';
                }else{
                    count--;
                }
            }
        }
        for(int i = n - 1; i>= 0; i--){
            if( arr[i] == '(' && count > 0 ){
                arr[i] = '#';
                count--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c != '#' ) sb.append(c);
        }
        return sb.toString();
    }
}