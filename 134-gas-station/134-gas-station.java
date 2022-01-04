class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if( n == 0 ) return -1;
        int extraFuel = 0, requiredFuel = 0, start = 0;
        for(int i = 0; i<n; i++){
            extraFuel += gas[i] - cost[i];
            if( extraFuel < 0 ){
                requiredFuel += extraFuel;
                start = i + 1;
                extraFuel = 0;
            }
        }
        if( extraFuel + requiredFuel >= 0 ) return start;
        return -1;
    }
}