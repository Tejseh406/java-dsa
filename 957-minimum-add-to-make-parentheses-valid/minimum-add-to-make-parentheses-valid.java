class Solution {
    public int minAddToMakeValid(String s) {
        int depth = 0;
        int add = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                depth++;
            }else{
                if(depth > 0){
                    depth--;
                }else{
                    add++;
                }
            }
        }

        return depth+add;
    }
}