/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz [][]  = new int[8][6], cont=0,soma=0,media=0;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("informe o numero");
                matriz[i][j] = input.nextInt();
                if((matriz[i][j]%2)==0){
                    soma = soma + matriz[i][j];
                    cont = cont +1;
                }

            }
            media = soma/cont;
            System.out.println("a media da linha "+(i+1)+ " e de "+media);
            soma =0;
            cont=0;

        }

    }
}