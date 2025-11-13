/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10],b[] = new int[10],c[]= new int[10],i,p=0,j;
        for(i=0;i<10;i++){
            System.out.println("qual o numero do vetor a");
            a[i]= input.nextInt();
            System.out.println("qual o numero do vetor b");
            b[i]= input.nextInt();

        }
        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(a[i] == b[p]){
                    c[p] = a[i];
                    p = p+1;
                }

            }
        }
        for(i=0;i<p;i++){
            System.out.println(" a intesscesao de a e b e "+c[i]);
        }
    }
}
