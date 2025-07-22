class Solution {
    public String intToRoman(int num) {
        String roman = "";
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanLetter = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        while(num > 0){
            while(num >= values[i]){
                roman += romanLetter[i];
                num -= values[i];
            }
            i++;
        }
        return roman;
    }
}