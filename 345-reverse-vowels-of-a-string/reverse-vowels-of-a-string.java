class Solution {
    public String reverseVowels(String s) {
       HashSet<Character>set=new HashSet<>();
       set.add('a');
       set.add('e');
       set.add('i');
       set.add('o');
       set.add('u');
       set.add('A');
       set.add('E');
       set.add('I');
       set.add('O');
       set.add('U');
       char arr[]=new char[s.length()];
       for(int i=0;i<s.length();i++){
        arr[i]=s.charAt(i);
       }
       int i=0;int j=s.length()-1;
       while(i<=j){
        if(!set.contains(arr[i])){
            i++;
            }else if(!set.contains(arr[j])){
            j--;
            }else{
            char temp=arr[i];
            arr[i]=arr[j];
           arr[j]=temp;
        j--;i++;}
       }
       return new String(arr);
    }
}