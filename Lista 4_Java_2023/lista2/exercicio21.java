/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[7][10],i,j,soma=0;
        for(i=0;i<6;i++){
            for(j=0;j<10;j++){
                System.out.println("digite o valor");
                a[i][j] = input.nextInt();
                soma = soma + a[i][j];


            }
            a[7][j] = soma;
            System.out.println(" a soma da coluna "+(j+1 )+" e de "+soma);
            soma =0;
        }



    }
}
