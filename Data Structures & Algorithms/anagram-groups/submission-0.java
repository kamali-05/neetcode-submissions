class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
       for(String word:strs){
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        String key=Arrays.toString(freq);
        if(map.containsKey(key)){
          map.get(key).add(word);
        }
        else{
          map.put(key,new ArrayList<>());
          map.get(key).add(word);
        }
        //map.computIfAbsent(key,key->new ArrayList<>()).add(word).replace for if else
            }
       List<List<String>> res=new ArrayList<>(map.values());//it is similar to
       //for(List<String> list:map.valuse()){
       // res.add(list);
       //}
      return res;
    }
}
