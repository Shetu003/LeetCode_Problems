class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startStation = 0, totalGas = 0, curGas = 0;
        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            if (curGas < 0) {
                startStation = i + 1;
                curGas = 0;
            }
            totalGas += gas[i] - cost[i];
        }
        return totalGas < 0 ? -1 : startStation;
    }
}
// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int currTank = 0;
//         int totalTank = 0;
//         int startStation = 0;
//         for(int i=0; i<gas.length; i++){
//             currTank += gas[i] - cost[i];
//             totalTank += gas[i] - cost[i];

//             if(currTank < 0){
//                 startStation = i+1;
//                 currTank = 0;
//             }
//         }
//         return totalTank >= 0 ? startStation : -1;
//     }
// }