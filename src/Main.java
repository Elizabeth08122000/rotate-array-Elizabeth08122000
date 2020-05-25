import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine();
        String[] sizeMas = size.split(" ");

        int N = Integer.valueOf(sizeMas[0]);


        int[][] mas = new int[N][N];

        if(N>=2){
            for (int i = 0; i < N; i++) {
                String scString = sc.nextLine();
                String[] scStrings = scString.split(" ");
                for (int j = 0; j < N; j++) {
                    mas[i][j] = Integer.valueOf(scStrings[j]);
                }
            }
            System.out.println();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(mas[j][i] + "\t");
                System.out.println();
            }
        }
        sc.close();
    }
}
