package org.example.classbox;

public class IntegerToRoman {
    public int getInt(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }

    }
    public int romanToInt(String s) {
        int n = s.length() , curr = 0 , result = 0,next = 0,i=0;
        while(i<n){
            if(i==n-1){
                result += getInt(s.charAt(i));
                return result;
            }
            curr = getInt(s.charAt(i));
            next = getInt(s.charAt(i+1));
            if(curr>=next){
                result += curr;
                i = i+1;
            }
            else{
                result += next - curr;
                i = i+2;
            }
        }
        return result;
    }

}
