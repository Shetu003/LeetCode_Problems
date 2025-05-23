class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                count5++;
            }
            else if(bills[i] == 10){
                if(count5 > 0){
                    count5--;
                    count10++;
                }
                else{
                    return false;
                }
            }
            else{
                if(count5 > 0 && count10 > 0){
                    count5--;
                    count10--;
                }
                else if(count5 > 2){
                    count5 = count5 - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}