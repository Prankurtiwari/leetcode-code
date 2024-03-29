class Solution {
    public boolean isAnagram(String s, String t) {
        //non-optimise
        
//         HashMap<Character,Integer> mp = new HashMap<>();
//         if (s.length() != t.length()) {
//             return false;
//         }
//         for(int i =0 ; i<s.length(); i++){
//             int count = mp.getOrDefault(s.charAt(i), 0);
//             mp.put(s.charAt(i), count+1);
//         }
        
//         for(int i =0 ; i<t.length(); i++){
//            if(mp.containsKey(t.charAt(i))) {
//              int count = mp.get(t.charAt(i));
//              if (count == 1) {
//                  mp.remove(t.charAt(i));
//              } else if (count > 1) {
//                  mp.put(t.charAt(i), --count);
//              }  
//            }
//         }
//         return mp.size() == 0;
//     }
        
        //optimise way
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];
        for(int i =0 ; i< s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
            
        }
        
        for(int i =0; i<26; i++) {
            if (count[i] != 0)
                return false;
        }
        
        return true;
    }
        
}