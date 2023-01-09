package logic;

public class Main {

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int sqrt = (int)Math.sqrt(n);
            System.out.println("SQRT: " + sqrt);
            for (int i=2; i < n; i++) {
                System.out.println(i);
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main (String args[]) {
        Main m = new Main();
        System.out.println(m.isPrime(13));
    }
}

//9
