class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();
        for(int ast : asteroids){
            while( !s.isEmpty() && s.peek() > 0 && s.peek() < -ast ) s.pop();
            if( s.isEmpty() || s.peek() < 0 || s.peek() > 0 && ast > 0 ) s.push(ast);
            else if( s.peek() == -ast ) s.pop();
        }
        int size = s.size();
        int[] ans = new int[size];
        while(!s.isEmpty()) ans[--size] = s.pop();
        return ans;
    }
}
