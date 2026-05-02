class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(freq.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int res[]=new int[k];
        for(int i=0;i<k;i++){
           res[i]=list.get(i).getKey();
        }

       return res;
    }
}
