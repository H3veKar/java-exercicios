/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 4
 */
import java.util.Scanner;
public class exc4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a, b, c, d, x1, x2;
        System.out.print("Informe o valor de a: ");
         a = input.nextDouble();

        System.out.print("Informe o valor de b: ");
         b = input.nextDouble();

        System.out.print("Informe o valor de c: ");
         c = input.nextDouble();

         d = Math.sqrt((b*b)-4*a*c);
         x1 = (-b - d )/ (2*a);
         x2 = (-b + d)/ (2*a);
        System.out.print("O valor das raizes sao: "+ x1+ " e "+x2);


    }
}
