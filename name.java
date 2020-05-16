public class name {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
    public static String repeat (String str, int n){
     StringBuffer sb = new StringBuffer("");
for (int i = 0; i < str.length(); i++){
    for (int j = 0; j < n; j++){
sb.append(str.charAt(i));
    }
}
return str;
    }
public static int getDecimalPlaces (String str){
        String[] mas = str.split(".");
       return mas[1].length();
}
    public static boolean isStrangePair (String prv, String vtr){
        if (prv.charAt(0) == vtr.charAt(vtr.length()-1) && (prv.charAt(prv.length()-1) == vtr.charAt(0))) return true;
        else return false;
    }
public static int differenceMaxMin(int[] massiv){
int max = massiv[0];
int min = massiv [0];
for (int i = 0; i <= massiv.length; i++){
    if (massiv[i] > max) max=massiv[i];
    if (massiv[i] < min) min=massiv[i];
}
return max-min;
    }
public static boolean isAvgWhole (int [] mas){
        double sr = 0;
        int sum = 0;
    for (int i = 0; i <= mas.length; i++){
        sum += mas[i];

    }
    sr = sum/mas.length;
    if (sr == 0) return true;
    else return false;
}
public static int[] cumulativeSum (int[] mas1){
        for (int i = 0; i<mas1.length; i++){
            mas1[i]=mas1[i]+mas1[i-1];

        }
        return mas1;

}
public static int Fibonacci (int a){
    int b = 0;
    int c = 1;
    int d = 0;
        for (int i = 0; i<a; i++){
        d = b + c;
        b = c;
        c = d;
    }
        return d;
}
public static boolean isValid(String str){
        if (str.length() >5) return false;
        int n = 0;
        for (int i = 0; i < str.length(); i++){
            if ((int) str.charAt(i) > 47 && (int) str.charAt(i) <58){
                n++;
            }
        if (n==str.length()) return true;
        else return false;
        }
}
public static boolean isPrefix(String pr, String str){
        int len = pr.length();
        String s = str.substring(0, len-1);
        if (s.equals(pr.substring(0, len-1))){
            return true;
        }
    else return false;
    }
    public static boolean isSuffix(String sf, String str){
        int len = sf.length();
        int strlen = str.length();
        String s = str.substring(strlen-len+1);
        if (s.equals(sf.substring(1, len))){
            return true;
        }
        else return false;
    }
public static int boxSeq(int a){
        int c = 0;
switch (a){
    case 0: return 0;
    case 1: return 3;
    case 2: return 2;
    case 3: return 5;
    case 4: return 4;
    case 5: return 7;
    case 6: return 6;

}
return 0;
    }
}
