/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[3][4],i,j,soma=0,quant=0, media=0;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.println("escreva um numero");
                a[i][j] = input.nextInt();
                if(a[i][j]%2==0)
                    quant = quant +1;
                else
                    soma = soma + a[i][j];
                media = media + a[i][j];
            }
        }
        media = media/(4*3);
        System.out.println("a quantidade de elementos pares "+quant);
        System.out.println("a soma de elementos impares "+soma);
        System.out.println(" a media e "+media);
    }
}
