/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 8
 */
import java.util.Scanner;
public class exc8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.println("qual o valor a");
        a = input.nextDouble();
        System.out.println("qual o valor b");
        b = input.nextDouble();
        System.out.println("qual o valor c");
        c = input.nextDouble();
        System.out.println("qual o valor d");
        d = input.nextDouble();
        System.out.println("qual o valor e");
        e = input.nextDouble();
        System.out.println("qual o valor f");
        f = input.nextDouble();
        y = ((a*f) - (c*d))/ ((a*e) -(b*d));
        x = ((c*e - b*f))/((a*e) - (b*d));
        System.out.println(" o Valor de x e : " + x);
        System.out.println(" o Valor de y e : " + y);
    }
}
