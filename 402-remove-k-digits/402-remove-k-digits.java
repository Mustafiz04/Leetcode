class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            //check whether the current num is smaller than the top of the stack (means we have the peak)
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                //eliminate the peak
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        // handles the scenario where digits are equal, (1111, k=3)
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        //as stack follows LIFO
        sb.reverse();
        
        //remove leading zeros
        while (sb.toString().startsWith("0")) {
            sb.deleteCharAt(0);

        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}