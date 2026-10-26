class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int [26];
        int arr1[]=new int [26];
      for(char ch:s.toCharArray()){
        arr[ch-'a']++;
      }
      for(char ch:t.toCharArray()){
        arr1[ch-'a']++;
     }
     if(s.length()!=t.length()){
        return false;
     }
     for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr1[i]){
            return false;
        }
     }return true;
    }
}