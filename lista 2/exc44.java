/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 44
 */
import java.util.Scanner;
public class exc44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("qual o numero");
        n = input.nextInt();
        if (n>=1 && n<=12){
            if(n==1)
                System.out.print("janeiro");
            else if (n==2)
                System.out.print("Feveeiro");
            else if (n==3)
                System.out.print("marco");
            else if (n==4)
                System.out.print("abril");
            else if (n==5)
                System.out.print("maio");
            else if (n==6)
                System.out.print("junho");
            else if (n==7)
                System.out.print("julho");
            else if (n==8)
                System.out.print("agosto");
            else if (n==9)
                System.out.print("setembo");
            else if (n==10)
                System.out.print("outubro");
            else if (n==11)
                System.out.print("novembro");
            else  System.out.print("dezembro");
        }
        else  System.out.print("nao existe mes com esse numero");

    }
}
