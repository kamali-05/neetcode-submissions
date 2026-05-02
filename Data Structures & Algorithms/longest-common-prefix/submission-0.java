class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String firstword=strs[0];
        String lastword=strs[n-1];
        String res="";
        for(int i=0;i<firstword.length();i++){
            if(firstword.charAt(i)==lastword.charAt(i)){
                 res=res+firstword.charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
}