class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]prefixarr=new int[n];
        prefixarr[0]=1;
        int[]suffixarr=new int[n];
        suffixarr[n-1]=1;
        for(int i=1;i<n;i++){
          prefixarr[i]=prefixarr[i-1]*nums[i-1];
          suffixarr[n-i-1]=suffixarr[n-i]*nums[n-i];
        }
        int []res=new int[n];
        for(int i=0;i<n;i++){
          res[i]=prefixarr[i]*suffixarr[i];
        }
        return res;
    }
}  
