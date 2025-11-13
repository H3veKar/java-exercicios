/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10],b[] = new int[10],c[]= new int[20],i, g=10;
        for(i=0;i<10;i++){
            System.out.println("informe o numero do vetor 1");
            a[i]= input.nextInt();
            c[i] = a[i];
        }
        for(i=0;i<10;i++){
            System.out.println("informe o numero do vetor 2");
            b[i]= input.nextInt();
            c[g+i] = b[i];
        }
        for(i=0;i<20;i++){
            System.out.println(" a uniao entre a e b e "+c[i]);
        }

    }
}
