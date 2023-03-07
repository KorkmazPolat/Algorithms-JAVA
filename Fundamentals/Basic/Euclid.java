
package Fundamentals.Basic;

public class Euclid {

    public static void main(String[] args) {

        System.out.println(gcd(10, 5));

    }

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);

    }

}
