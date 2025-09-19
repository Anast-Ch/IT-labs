public class Primes {
    public static void main(String[] args) {
        System.out.print("Простые числа: ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            } 
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= java.lang.Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            } 
        }
        return true;
    }
}
