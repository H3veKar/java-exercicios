/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matriz [][] = new double[5][5],somaDs = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o numero");
                matriz[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            somaDs+= matriz[i][4 - i];
        }

        System.out.println("Soma dos elementos da diagonal secundária: " + somaDs);
    }
}

