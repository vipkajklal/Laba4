import java.util.Scanner;

public class zadanie2_var2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество столбцов: ");
        int x = sc.nextInt();
        System.out.println("Количество строк: ");
        int y = sc.nextInt();
        int arr[][];
        arr = new int[x][y];
        try {
            for (int i = 1; i <= x; i++) {
                for (int k = 1; k <= y; k++) {
                    System.out.println("arr[" + i + "] [" + k + "]");
                    int data = sc.nextInt();
                    arr[i - 1][k - 1] = data;
                }
            }
            System.out.println("Какой столбец вы хотите вывести: ");
            int i = sc.nextInt();
            for (int k = 1; k <= y; k++) {
                System.out.println(arr[k - 1][i - 1]);
            }
        }catch (Exception e){
            System.out.println("Ошибка: "+e);
        }catch (Error e){
            System.out.println("Ошибка: "+e);
        }
    }
}
