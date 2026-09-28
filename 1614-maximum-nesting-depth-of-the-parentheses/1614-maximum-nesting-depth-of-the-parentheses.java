class Solution {
    public int maxDepth(String s) {
        int currDepth = 0;
        int resDepth = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                currDepth++;
                resDepth = Math.max(resDepth, currDepth);
            }
            else if(ch == ')'){
                currDepth--;
            }
        }
        return resDepth;
    }
}