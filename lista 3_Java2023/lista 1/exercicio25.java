/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[100],p=0,numero,m,d;
        while(p!=100){
            System.out.println("qual o numero");
            numero = input.nextInt();
            m = numero%7;
            d = numero%10;
            if((numero>0)&& (m!=0) && (d == 7)){
                n[p] = numero;
                p = p +1;
            }

        }

   for(p=0;p<100;p++){
       System.out.println(+n[p]);
   }
    }

}
