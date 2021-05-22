package v1.leetcode;

import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public boolean isHappy(int n) {
        boolean res = false;
        Set<Integer> set = new HashSet<>();
        if(n==1)
            return true;

        while(!(n==1 || set.contains(n))){
            set.add(n);
            n = getNewN(n);
            if(n==1){
                res = true;
                break;
            }
        }
        return res;
    }

    private int getNewN(int n){
        int res=0;

        while (n > 0){
            res += Math.pow(n%10,2);
            n = n/10;
        }
        return res;
    }
}