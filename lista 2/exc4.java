/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 4
 */
import java.util.Scanner;
public class exc4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Double n;
        System.out.println("informe o numero");
        n = input.nextDouble();
        if (n>0)
            System.out.println("positivo");
        else if (n<0)
            System.out.println("negativo");
        else
            System.out.println("nulo");


    }
}
