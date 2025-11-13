/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 24
 */
import java.util.Scanner;
public class exc24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("qual sua idade ");
        i= input.nextInt();
        if (i<16)
            System.out.println("nao eleitor ");
        else if (i>=18 && i<=65)
            System.out.println("eleitor obrigatorio ");
        else if((i>=16 && i<18) || i>65)
            System.out.println("eleitor facultativo ");
        else System.out.println("idade invalida");
    }
}
