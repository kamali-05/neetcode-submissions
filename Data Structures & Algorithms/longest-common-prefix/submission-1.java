class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        StringBuilder res=new StringBuilder();
        String first=strs[0];
        String last=strs[n-1];
        int i=0,j=0;
        while(i<first.length()){
            if(first.charAt(i)==last.charAt(j)){
                res.append(first.charAt(i));
                i++;
                j++;
            }
            else{
               break;
            }
        }
        return res.toString();
        }
    }
