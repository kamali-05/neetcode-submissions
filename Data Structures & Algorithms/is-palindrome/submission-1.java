class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder str=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
           str.append(Character.toLowerCase(s.charAt(i)));
        }
     }
     String t=str.toString();
     int l=0,r=t.length()-1;
     while(l<r){
        if(t.charAt(l)!=t.charAt(r)){
            return false;
        }
        l++;
        r--;
     }
     return true;
     }
    }

