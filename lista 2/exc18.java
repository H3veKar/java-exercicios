/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 18
 */
import java.util.Scanner;
public class exc18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        System.out.println("qual o numero");
        n = input.nextDouble();
        if (n > 20 && n < 90)
            System.out.println("O numero esta ente 20 de 90");
    }
}