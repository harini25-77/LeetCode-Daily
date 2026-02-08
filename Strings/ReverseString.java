// Leetcode 344 - Reverse String
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char[] a=new char[n];
        for(int i=0;i<n;i++) {
            a[i]=s[n-(i+1)];
        }
        for(int i=0;i<n;i++) {
            s[i]=a[i];
        }
    }
}
