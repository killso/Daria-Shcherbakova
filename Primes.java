public class Primes {
    public static void main(String[] args) {
for (int j = 2; j <=100; j++){
    if (isPrime(j)) {
        System.out.println("Number " + j);
    }
}
            System.out.println(isPrime (13));
        }

    public static boolean isPrime(int n) {
        int k = 0;
         for (int i = 2; i <= n; i++){
            if (n%i == 0) k++;
        }
        if (k == 1) return true;
else return false;
        }
    }