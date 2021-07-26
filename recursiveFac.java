public class factorial {
    public static int factorial(int n) {
        // A recursive function that computes the factorial of any given integer
        if (n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }
}
