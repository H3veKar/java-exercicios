/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[5],maior=-9999,menor=999999,media=0,i;
        for(i=0;i<5;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            media = media + n[i];
            if(n[i]>maior)
                maior = n[i];
            if(n[i]<menor)
                menor = n[i];
        }
        media = media/5;
        System.out.println("o maior numero e "+maior+ "e o menor e "+menor+ "e a media e"+media);
    }
}
