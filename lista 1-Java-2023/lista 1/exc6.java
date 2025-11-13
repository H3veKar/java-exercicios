/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 6
 */
import java.util.Scanner;
public class exc6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double qd, cd, v;
        System.out.println("qual a quantidade de dolares no cofre");
        qd = input.nextDouble();
        System.out.println("qual a cotacao do dolar");
        cd = input.nextDouble();
        v = qd*cd;
        System.out.println("o valor em reais sao"+v);
    }
}
