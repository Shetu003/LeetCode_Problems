class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentTank = 0;
        int totalTank = 0;
        int startStation = 0;
        for (int i = 0; i < gas.length; i++) {
            currentTank += gas[i] - cost[i];
            totalTank += gas[i] - cost[i];
            if (currentTank < 0) { 
                startStation = i + 1;
                currentTank = 0;
            }
        }
        return totalTank >= 0 ? startStation : -1;
    }
}