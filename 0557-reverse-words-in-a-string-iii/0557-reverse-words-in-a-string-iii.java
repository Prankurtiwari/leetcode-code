class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();

        String[] sArr = s.split(" ");

        for(String str : sArr) {
            StringBuffer sb1 = new StringBuffer(str);
            sb.append(sb1.reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}