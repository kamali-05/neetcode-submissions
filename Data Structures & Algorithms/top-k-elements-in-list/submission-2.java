class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] arr=new int[k];
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>entry=new ArrayList<>(mp.entrySet());
        Collections.sort(entry,(a,b)->b.getValue()-a.getValue());//descending
       
        for(int i=0;i<k;i++){
          arr[i]=entry.get(i).getKey();
        }
        return arr;
    }
}
