/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 18
 */
import java.util.Scanner;
public class exc18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, ad, d;
        System.out.println("qual a altura do degrau");
        x= input.nextDouble();
        System.out.println("qual a altura desejada");
        ad= input.nextDouble();
        d = ad/x;
        System.out.println("A quantidade de degaus e "+d);
    }
}
