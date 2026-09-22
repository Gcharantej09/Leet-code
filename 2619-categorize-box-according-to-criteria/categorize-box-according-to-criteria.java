class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long)length*width*height;
        if((length>=10000||width>=10000||height>=10000||volume>=Math.pow(10,9) )&& mass>=100){
            return "Both";
        }
        
        else if(mass>=100){
            return "Heavy";
        }
        else if(length>=10000||width>=10000||height>=10000 ||length*width*height>=Math.pow(10,9)){
            return "Bulky";
        }
        else{
            return "Neither";
        }

    }
}