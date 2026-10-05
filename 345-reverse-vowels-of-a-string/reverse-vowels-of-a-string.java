class Solution {
    public String reverseVowels(String s) {
      char char1[]=s.toCharArray();
      int i=0;int j=s.length()-1;
      while(i<j){
        if(char1[i]!='a'&&char1[i]!='e'&&char1[i]!='i'&&char1[i]!='o'&&char1[i]!='u'&&char1[i]!='A'&&char1[i]!='E'&&char1[i]!='I'&&char1[i]!='O'&&char1[i]!='U'){
            i++;
        }
      
      else if(char1[j]!='a'&&char1[j]!='e'&&char1[j]!='i'&&char1[j]!='o'&&char1[j]!='u'&&char1[j]!='A'&&char1[j]!='E'&&char1[j]!='I'&&char1[j]!='O'&&char1[j]!='U'){
            j--;
        }
        else{
            char temp=char1[i];
            char1[i]=char1[j];
            char1[j]=temp;
            i++;
            j--;
        }
      }
      return new String(char1);
    }
}