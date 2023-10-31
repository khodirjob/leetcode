package easy;

public class Solution509 {
    public static void main(String[] args) {
        System.out.println("adsasd");
        System.out.println("fib(5) = " + fib(6));
    }

    public static int fib(int n) {
        int f0=0, f1=1, f2=1;
        if(n == 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        while(n-2 != 0){
            f0 = f1;
            f1 = f2;
            f2 = f1 + f2;
            n--;
        }
        return f2;
    }
}
