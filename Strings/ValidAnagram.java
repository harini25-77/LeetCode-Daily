// LeetCode 242 - Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int n=s.length();
        for(char ch='a';ch<='z';ch++) {
            int countS=0;
            int countT=0;
            for(int i=0;i<n;i++) {
                if(s.charAt(i)==ch) {
                    countS++;
                }
                if(t.charAt(i)==ch) {
                    countT++;
                }
            }
            if(countS!=countT) {
                return false;
            }
        }
        return true;
    }
}
