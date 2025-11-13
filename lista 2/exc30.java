/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 30
 */
import java.util.Scanner;
public class exc30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("qual o valor a ");
        a= input.nextDouble();
        System.out.println("qual  o valor b ");
        b= input.nextDouble();
        System.out.println("qual o valor c ");
        c= input.nextDouble();
        if((a+b)>c && (b+c)>a && (a+c)>b) {


             if (a == b && b == c)
                System.out.println("triangulo equilatero");

            else if (a == b  || a == c  || b == c )
                System.out.println("triangulo isoceles");

            else System.out.println("triangulo escaleno ");
        }
        else System.out.println("nao e triangulo ");



    }
}
