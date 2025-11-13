/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][]  = new int[5][5],l []  = new int[5],c[] = new int[5];



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o numeor");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                l[i] += matriz[i][j];
            }
        }

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                c[j] += matriz[i][j];
            }
        }


        for (int i = 0; i < 5; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println();



        for (int j = 0; j < 5; j++) {
            System.out.print(c[j] + " ");
        }
        System.out.println();
    }
}







