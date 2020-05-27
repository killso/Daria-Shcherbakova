import java.math.*;
import java.math.BigDecimal;
public class zd4 {
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", "A"));
    }
//1 задача
    public static String Bessy(int m, int k, String esse){
    String[] str = esse.split(" ");
    String res = "";
    int ok = k;
    for (int i = 0; i < str.length; i++) {
        if (ok - str[i].length() > 0) {
            res += str[i] + " ";
            ok -= (str[i].length() + 1); }
        else {
            res += '\n' + str[i] + " ";
            ok = k - (str[i].length() + 1);
        }
    }
    return res;
}
//2 задача
    public static String split(String str){
        int k = 0;
        String stroka = "";
        String res = "";
        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == '(') {
                k++;
                stroka += "(";
                continue;
            }
            if (str.charAt(i) == ')') {
                stroka += ")";
                k--;
            }
            if (k == 0) {
                res += stroka + ",";
                stroka = "";
            }
        }
        return "[ " + res + " ]";
    }
    //3 задача
    public static String toCamelCase(String phrase) {
        while (phrase.contains("_")) {
            phrase = phrase.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
        }
        return phrase;
    }

    public static String toSnakeCase(String phrase) {
        String res = phrase.substring(0, 1);
        for (int i = 1; i < phrase.length();  i += 1) {
            if (phrase.substring(i, i + 1) == phrase.substring(i, i + 1).toUpperCase()) {
                res += "_" + phrase.substring(i, i + 1).toLowerCase();
            }
            else {
                res += phrase.substring(i, i + 1);
            }
        }
        return res;
    }
//4 задача
    public static String overTime (double[] mas) {
        double vr = 0;
        double pvr = 0;
        if (mas[0] < 17 && mas[1] > 17) {
            vr = 17 - mas[1];
            pvr = mas[1] - 17;
        }
        if (mas[0] < 17 && mas[1] < 17) {
            vr = mas[1] - mas[0];
            if (mas[0] > 17) {
                pvr = mas[1] - mas[0];
            }
        }
        return "$" + (vr * mas[2] + pvr * mas[2] * mas[3]);
    }
//5 задача
 public static String BMI (double ves, double rst) {
     double imt = 0;
     imt = ves / (rst * rst);
     imt = imt * 10000; //приводим число к нормальному виду
     imt = new BigDecimal(imt).setScale(1, RoundingMode.HALF_UP).doubleValue(); //округляем
     if (imt < 18.5)
         return imt + " Underweight";
     if (imt >= 18.5 && imt <= 24.9)
         return imt + " Normal weight";
     if (imt >= 25)
         return imt + " Overweight";
     return "";
 }
 //6 задача
    public static int bugger(int a){
        int b = a;
        if ( a < 10 ) return 0;
        while (Integer.toString(b).length() > 1) {
            int pr = 1;
            for (int i = 0; i < Integer.toString(b).length(); i++) {
               pr *= Integer.valueOf(Integer.toString(b).substring(i, i + 1));
            }
            b = pr;
        }
        return b;
    }
//7 задача
    public static String toStarShorthand(String str){
        String res = str.substring(0, 1);
        int k = 1;
        String last = res;
        for (int i = 1; i < str.length(); i++) {
            String ph = str.substring(i, i + 1);
            if (ph.equals(last)) {
                k += 1;
                if (i == str.length() - 1) {
                    if (k > 1) {
                        res += "*" + k;
                    } else {
                        res += ph;
                    }
                }
                continue;
            }
            if (k > 1) {
                res += "*" + k;
            }
            res += ph;
            k = 1;
            last = ph;
        }
        return res;
    }
    //8 задача
    public static boolean doesRhyme(String str1, String str2){
        String abc = str1.toLowerCase().substring(str1.lastIndexOf(" ") + 1);
        String abc1 = str2.toLowerCase().substring(str2.lastIndexOf(" ") + 1);
        String ph0 = "aeiouy";
        String ph1 = "";
        String ph2 = "";
        for (int i = 0; i < abc.length(); i += 1) {
            if (ph0.contains(abc.substring(i, i + 1))) {
                ph1 += abc.substring(i, i + 1);
            }
        }
        for (int i = 0; i < abc1.length(); i += 1) {
            if (ph0.contains(abc1.substring(i, i + 1))) {
                ph2 += abc1.substring(i, i + 1);
            }
        }
        return ph1.equals(ph2);
    }
    //9 задача
    public static boolean trouble(int a, int b){
        String numbers = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            String repeat = numbers.substring(i, i + 1);
            String number1 = Long.toString(a);
            String number2 = Long.toString(b);
            boolean yn = number1.contains(repeat.repeat(3)) && number2.contains(repeat.repeat(2));
            if (yn) {
                return true;
            }
        }
        return false;
    }
//10 задача
    public static int countUniqueBooks(String phrase, String str) {
    int c = 0;
    boolean yn = false;
    String books = "";
    for (int i = 0; i < phrase.length(); i += 1) {
        if (phrase.substring(i, i + 1).equals(str)) {
            yn = !yn;
            if (!yn) {
                books = "";
            }
            continue;
        }
        if (yn) {
            if (!books.contains(phrase.substring(i, i + 1))) {
                c++;
                books += phrase.substring(i, i + 1);
            }
        }
    }
    return c;
}
}




