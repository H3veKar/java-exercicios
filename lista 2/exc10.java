/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 10
 */
import java.util.Scanner;
public class exc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("qual o valor de a");
        a=  input.nextDouble();
        System.out.println("qual o valor de b");
        b=  input.nextDouble();
        if (a>b)
             System.out.println("a e maior");
        else if (b>a)
            System.out.println("b e maior");
    }
}
