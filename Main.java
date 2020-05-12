package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println(abcmath(1, 2, 3));
    }
public static int remainder(int a, int b){
        int o = a % b;
        return o;
}
public static int triArea(int a, int b){
        return a*b/2;
}
public static int animals(int a, int b, int c){
        return (a*2+b*4+c*4);
}
public static boolean profitableGamble(double a, double b, double c) {
    if (a * b > c) return true;
    else return false;
}
public static String operation (int n, int a, int b){
        String c = "added";
    String h = "none";
        if (a+b==n) return c;
        String d = "subtracted";
        if (a-b==n) return d;
        String e = "умножение";
        if (a*b==n) return e;
        String g = "деление";
        if (a/b==n) return g;
        else return h;
}
public static int ctoa (char a){
        return (int)a;
}
public static int addUpTo (int a){
        int sum = 0;
        for (int i = 0; i <= a; i++){
            sum+= i;
        }
return sum;
}
public static int nextEdge (int a, int b){
        return (a+b-1);
}
public static int sumOfCubes (int[] mas){
        int s = 0;
        for (int i = 0; i <= mas.length; i++){
          s = i*i*i+s;
        }
        return s;
}
public static boolean abcmath(int a, int b, int c){
        int m = a*b;
        if (m%c == 0) return true;
        else return false;

}
}