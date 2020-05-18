public class Palindrom {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String m = args[i];
            if (isPalindrome(m)) {

                System.out.println(m + ""); //выводим полученный результат
            }
    }
    }
    public static String reverseString(String m){
        String str = ""; //пустая строка
        for (int i=m.length()-1; i >=0; i--){ //идем по заданной строке справа налево
            str+= m.charAt(i);
        }
        return str;
    }
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str)); //проверяем совпадение

    }

}
