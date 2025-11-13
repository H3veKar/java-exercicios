/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 20
 */
import java.util.Scanner;
public class exc20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, p=0, r=0;
        System.out.println("qual o numero 1 ");
        a= input.nextDouble();
        System.out.println("qual o numero 2 ");
        b= input.nextDouble();
        if(a>b) {
            p = b * b;
            r = Math.sqrt(a);
        }
        else if (b>a){
            p = a*a;
            r = Math.sqrt(b);}
        System.out.println("a raiz e "+r+"e a potencia e"+p);





    }
}
