package leetcode_150;

public class Power {

    public static void main(String[] args) {
        int x = 2, n = 10;
        double res = power(x, n);
        if (n % 2 == 1)
            res = x * res;

        System.out.println(res);
    }

    static int power(int x, int n){
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;

        int res = power(x,n/2);
        if(n%2!=0){
            return res*res*x;
        }
        return res * res;

    }

}


