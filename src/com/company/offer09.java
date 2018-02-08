package com.company;

/**
 * Created by stinge on 01/08/2017.
 */
public class offer09 {
    public int JumpFloorII(int target) {
        if (target <=0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2*JumpFloorII(target-1);
        }

        // return pow(2, target-1);
    }
}
