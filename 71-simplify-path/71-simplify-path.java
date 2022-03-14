class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] absPath = path.split("/+");
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i<absPath.length; i++){
            if( !st.isEmpty() && absPath[i].equals("..") ){
                st.pop();
            }else if( !absPath[i].equals("") && !absPath[i].equals(".") && !absPath[i].equals("..") ){
                st.push(absPath[i]);
            }
        }
        if( st.isEmpty() ) return "/";
        while( !st.isEmpty() ){
            ans.insert(0, st.pop()).insert(0, "/");
        } 
        return ans.toString();
    }
}