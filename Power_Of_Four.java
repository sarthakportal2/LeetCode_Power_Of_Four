class Solution {
    public boolean isPowerOfFour(int n) {
        //Optimal solutionT(C(n))==(O(log(n))) and S(C(n))==O(1) as it requires non addition space
        while (n>=4){//iterating number till eqaul to 4
            if (n%4!=0)return false;//checking if number divisbilty by 4  true and printing false
            n=n/4;//dividing numebr by 4 
        }return n==1;}}//printing true and false
