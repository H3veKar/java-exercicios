/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 5
 */
import java.util.Scanner;
public class exc5 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        double p, i,n,v;
        System.out.println("Infome a taxa");
        i = input.nextDouble();
        System.out.println("informe a aplicacao mensal");
        p = input.nextDouble();
        System.out.println("Informe o numero de meses");
        n = input.nextDouble();
        v = (p*(Math.pow((1+i), n))-1)/i;
        System.out.println("o resultado e "+v);
    }

}
