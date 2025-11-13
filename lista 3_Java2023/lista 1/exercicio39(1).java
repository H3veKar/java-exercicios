/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,i,j;
        System.out.println("qual o tamanho do triangulo");
        numero= input.nextInt();
        int n[] = new int[100];
        n[0] =1;
        for(i=0;i<=numero;i++){
            int a=0,b=0;
            for(j=0;j<=i;j++){
                b=a + n[j];
                a = n[j];
                n[j] =b;
                System.out.print(n[j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
