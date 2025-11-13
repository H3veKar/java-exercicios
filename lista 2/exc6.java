/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 6
 */
import java.util.Scanner;
public class exc6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double n, r;
        System.out.println("qual o numero");
        n = input.nextDouble();
        if (n>=0)
            r = Math.sqrt(n);
        else r = n*n;
        System.out.println("o resultado e"+r);
    }
}
