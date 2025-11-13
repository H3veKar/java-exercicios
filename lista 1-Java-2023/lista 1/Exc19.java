/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 19
 */
import java.util.Scanner;
public class Exc19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, a, m;
        System.out.println("qual o peso");
        p= input.nextDouble();
        System.out.println("qual a altura ");
        a= input.nextDouble();
        m = p/(a*a);
        System.out.println("o indice coporal e "+m);

    }
}
