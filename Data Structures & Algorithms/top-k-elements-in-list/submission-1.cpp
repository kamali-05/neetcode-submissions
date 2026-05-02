class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> freq;
        vector<int>arr(k);
        for(int c:nums){
            freq[c]++;
        }
        vector<pair<int,int>>vec(freq.begin(),freq.end());
        sort(vec.begin(),vec.end(),[](auto &a,auto &b){
            return a.second>b.second;
        
        });
        for(int i=0;i<k;i++){
            arr[i]=vec[i].first;
        }
        

        return arr;
    }
};
