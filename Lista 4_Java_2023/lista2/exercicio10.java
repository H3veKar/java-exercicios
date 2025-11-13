import java.util.Scanner;

/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
public class exercicio10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int somal=0,somac=0,somadp=0,somads=0,st=0,i,j;


        System.out.println("Digite os element");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 5; j++) {
                matriz[i][j] = input.nextInt();
            }
        }


        for (j = 0; j < 5; j++) {
            somal+= matriz[2][j];
        }





        for ( i = 0; i < 3; i++) {
            somadp += matriz[i][i];
            somac+= matriz[i][1];
            somads += matriz[i][4 - i];
            for (j = 0; j < 5; j++) {
                st += matriz[i][j];
            }
        }



        System.out.println("Soma dos elementos da linha 4: " + somal);
        System.out.println("Soma dos elementos da coluna 2: " + somac);
        System.out.println("Soma dos elementos da diagonal principal: " + somadp);
        System.out.println("Soma dos elementos da diagonal secundária: " + somads);
        System.out.println("Soma de todos os elementos : " + st);


    }
}
