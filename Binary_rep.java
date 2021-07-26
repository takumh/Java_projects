public class Binary_rep {
    //Binary representation. Write program that takes positive integer (in decimal) command-line
    // argument and prints binary representation. Recall, in that used the method of subtracting
    // out powers of Now, use the following simpler method: repeatedly divide into and read the
    // remainders backward. First, write loop to carry out this computation and print the bits in
    // the wrong order. Then, use recursion to print the bits the correct order
    public static void bin_rep(int n) {
        StringBuilder bin = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            bin.append(rem);
            n = n / 2;
        }
        System.out.println(bin.reverse());
    }
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        bin_rep(n);
    }
}
