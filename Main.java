import java.util.Random;
import java.util.Scanner;
public class Main  {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("матрица или массив?");
    System.out.print("(матрица - mat, массив - mas): ");
    String ch = input.nextLine();
    if (ch == "mat") {
        int[] array = array(n); //сгенерировали массив
    } else if (ch == "mas") {
    } else return;
    System.out.print("Введите ширину/длину матрицы: ");
    System.out.print("Выводить матрицу/массив?");
    int n = input.nextInt();
    int[][] array = array(n); //сгенерировали массив
    Sort sort = new Sort();
    sort.Shell1(array, n, true);
    sort.QuickSort1(array, n, true);
    sort.Sort1(array, n, true);
}
        //генерация массива
        public static int[][] array(int n) {
            Scanner input = new Scanner(System.in);
            Random rnd = new Random();
            System.out.print("Генерация массива: \n");
            int[][] mas = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j<n; j++) {
                    mas[i][j] = rnd.nextInt(100);
                    System.out.print(mas[i][j] + "\t");
                }
                System.out.print("\n");
            }
            return mas;
        }
}

