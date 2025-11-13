/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][]  = new int[2][3],c = 0,i,j;


        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.println("Digite os elementos");
                matriz[i][j] = input.nextInt();
            }
        }

        for ( i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                if (matriz[i][j] < 5 || matriz[i][j] > 15) {
                   c = c+1;
                }
            }
        }

        System.out.println("Quantidade de elementos fora do intervalo " +c);
    }
}
