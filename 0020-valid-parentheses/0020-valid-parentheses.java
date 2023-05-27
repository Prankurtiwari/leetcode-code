class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 != 0)
            return false;
        Map <Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char chr=s.charAt(i);
            if (chr == '(' || chr == '{' || chr == '[')
                stack.push(chr);
            else if (chr == ')' || chr == '}' || chr == ']' ) {
                if (stack.isEmpty() || map.get(chr) != stack.pop() )
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}