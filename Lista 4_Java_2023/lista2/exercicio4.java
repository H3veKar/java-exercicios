/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[15][5], i,j,media=0,mediageral=0;
        String [] nome = new String[15];
        for(i=0;i<15;i++){
            media = 0;
            System.out.println("qual seu nome");
            nome[i]= input.next();
            for(j=0;j<5;j++){
                System.out.println("qual a nota");
                A[i][j]= input.nextInt();
                media = media+ A[i][j];
                mediageral = mediageral + A[i][j];
            }
            media = media/5;
            if(media>=60)
                System.out.println("a media do aluno "+nome[i]+ " e de "+media+ " e sua situacao e aprovado");
            else if(media>=40 )
                System.out.println("a media do aluno "+nome[i]+ " e de "+media+ " e sua situacao e exame");
            else
            System.out.println("a media do aluno "+nome[i]+ " e de "+media+ " e sua situacao e reprovado");
        }

        System.out.println("a media da turma e de "+(mediageral/15));
    }
}
