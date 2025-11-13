/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v[] = new int[10],v1[] = new int[10],v2[]= new int[10],i,p=0,im=0;
        for(i=0;i<10;i++){
            System.out.println("qual o valor");
            v[i] = input.nextInt();
            if(v[i]%2 == 0){
                v1[p] = v[i];
                p = p+1;

            }
            else {
                v2[im] = v[i];
                im = im+1;
            }

        }
        for(i=0;i<p;i++){
            System.out.println("valores par "+v1[i]);
        }
        for(i=0;i<im;i++){
            System.out.println("valores impares "+v2[i]);
        }
    }
}
