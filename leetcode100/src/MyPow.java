/**
 * 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）
 */
public class MyPow {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n < 0){
            n = -n;
            return 1/myPow(x,n);
        }
        if(n == 1){
            return x;
        }
        if(n % 2 == 1){
            return myPow(x, n-1)*x;
        }else{
            return myPow(x*x, n/2);
        }
    }
}
