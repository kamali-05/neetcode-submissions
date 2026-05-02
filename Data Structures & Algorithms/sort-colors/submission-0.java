class Solution {
    public static void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        //use mid to traverse the element and to fix the element place at low,mid,high;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;                 
            }
        }
    }
}