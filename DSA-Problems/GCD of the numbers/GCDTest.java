aclass Solution {
    public static int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class GCDTest {
    public static void main(String[] args) {
        System.out.println("GCD Testing:");
        System.out.println("GCD(12, 8) = " + Solution.gcd(12, 8));
        System.out.println("GCD(18, 24) = " + Solution.gcd(18, 24));
        System.out.println("GCD(17, 19) = " + Solution.gcd(17, 19));
        System.out.println("GCD(100, 50) = " + Solution.gcd(100, 50));
        System.out.println("GCD(48, 18) = " + Solution.gcd(48, 18));
    }
}

