class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }
        set<int>s(nums.begin(),nums.end());
        vector<int>arr;
        for(auto it=s.begin();it!=s.end();it++){
           arr.push_back(*it);
        }
         int maxcount=1;
         int count=1;
       for(int i=0;i<arr.size()-1;i++){
       if(arr[i]==arr[i+1]-1){
          count++;
          maxcount=max(count,maxcount);  
       }
       else{
        count=1;
       }
       }

       return maxcount;
         }
};

