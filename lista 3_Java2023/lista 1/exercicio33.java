/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[15],i;
        for(i=0;i<15;i++){
            System.out.println("informe o valor");
            a[i]= input.nextInt();
        }
        for(i=0;i<15;i++){
            if(a[i]!=0){
                System.out.println(a[i]);
            }
        }

    }
}
