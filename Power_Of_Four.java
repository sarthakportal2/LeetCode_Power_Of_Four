public class Solution {
    public bool IsPowerOfFour(int n) {
        while (n>=4){
            if (n%4!=0)return false;
            n=n/4;
        }return n==1;
    }
}
