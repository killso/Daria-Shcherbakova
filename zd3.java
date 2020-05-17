public class zd3 {
    public static void main(String[] args) {
        System.out.println(isKaprekar(5));
    }

    public static int solutions(int a, int b, int c) {
        int d = 0;
        d = b * b - 4 * a * c;
        if (d > 0) return 2;
        if (d == 0) return 1;
        if (d < 0) return 0;
        return 0;
    }

    public static int findZip(String str) {
        str = str.replaceFirst("zip", "abc");
        if (str.contains("zip")) return str.indexOf("zip");
        else return -1;
    }

    public static boolean checkPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if ((a % i) == 0) sum += i;

        }
        if (sum == a) return true;
        else return false;
    }

    public static String flipEndChars(String str) {
        if (str.length() < 2) return "Incompatible";
        if (str.charAt(0) == str.charAt(str.length() - 1)) return "Two's a pair";
        return (str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0));
    }
public static boolean isValidHexCode(String str){
        if (str.length()>7) return false;
        if (str.matches("#[a-fA-F0-9]+")) return true;
        else return false;
}
    public static String longestZero(String str) {
        String[] k = str.split("1");
        String max = "";
        for (int i = 0; i < k.length; i++) {
            if (k[i].length() > max.length()) max = k[i];

        }
        return max;
    }
    public static boolean same(int[] a, int [] b){
        int q1 = 0;
        int q2 =0;
        for (int i = 0; i < a.length; i++) {
            int temp = -1;
            for (int j = 0; j < a.length; i++) {
                if (a[i] == a[j]) temp++;
            }
            q1 = q1 + temp;
        }
        for (int i = 0; i < b.length; i++) {
            int temp = -1;
            for (int j = 0; j < b.length; i++) {
                if (b[i] == b[j]) temp++;
            }
            q2 = q2 + temp;
            }
        return a.length-q1 == b.length  -q2;
    }

    public static boolean isKaprekar(int a){
        if (a == 1) return true;
        int s = a*a;
        int c = 0;
        while (s!=0) {
            c++;
            s = s / 10;
        }
        s = a*a;
        for (int i = 1; i<c; i++){
          int e = (int) Math.pow(10,i);
          if (e == a) continue;
          int sum = s/e +s % e;
          if (sum == a) return true;
        }
            return false;
    }

    public static int nextPrime(int a) {
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) a++;
        }
        return a;

    }
public static boolean rightTriangle(int a, int b, int c){
        if (c*c == a*a + b*b) return true;
    if (a*a == c*c + b*b) return true;
    if (b*b == a*a + c*c) return true;
        return false;
}

}
