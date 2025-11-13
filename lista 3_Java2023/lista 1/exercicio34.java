/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],i,j;
        for(i=0;i<10;i++){
            System.out.println("informe o valor");
            n[i]= input.nextInt();
            for(j=0;j<10;j++){
                if(j!=i){
                if(n[i]==n[j]){
                    System.out.println("esse numero ja foi digitado , informe outro");
                    n[i]= input.nextInt();
                }}
            }
        }
        for(i=0;i<10;i++){
            System.out.println("o valor final e"+n[i]);
        }

    }
}
