public class LON {
//Write a recursive function that takes an integer n as its argument and returns ln(n!)
    public static double logarithm(double n) {
        if (n == 1) {
            return 0;
        } else {
            return Math.log(n) + logarithm(n - 1);
        }
    }
    public static void main(String args[]){
        double n = Double.parseDouble(args[0]);
        double ans = logarithm(n);
        int answer = (int) ans;
        System.out.println("ln(" + n + "!)" + "=" + answer);
    }
}
