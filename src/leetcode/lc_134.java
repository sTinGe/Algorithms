package leetcode;

public class lc_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int tank = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
            tank += gas[i]-cost[i];
            if (tank < 0) {
                tank = 0;
                start = i+1;
            }
        }

        if (gasSum < costSum) {
            return -1;
        }
        return start;
    }

    public void run() {

    }
}
