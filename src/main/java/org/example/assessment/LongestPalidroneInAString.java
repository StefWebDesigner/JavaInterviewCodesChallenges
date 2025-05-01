package org.example.assessment;

public class LongestPalidroneInAString {

    public String longestPalindrome() {
        String s = "yaabccbax";
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                //Rememeber these steps!!!!
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        String res = s.substring(start, end + 1);;
        System.out.println(res);
        return res;
    }

    private int expandAroundCenter(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        int response = r - l - 1;
        return response;
    }

}
