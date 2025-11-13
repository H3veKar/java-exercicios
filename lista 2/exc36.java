/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 36
 */
import java.util.Scanner;
public class exc36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,x,x1,x2;

        System.out.print("Digite o valor de A: ");
         a = input.nextDouble();

        System.out.print("Digite o valor de B: ");
         b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = input.nextDouble();

         d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
             x1 = (-b + Math.sqrt(d)) / (2 * a);
             x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("As raizes  sao:  " + x1 + "e " + x2);
        } else if (d == 0) {
             x = -b / (2 * a);

            System.out.println("A raiz  e: x = " + x);
        } else {
            System.out.println("não possui raizes reais.");
        }
    }

}
