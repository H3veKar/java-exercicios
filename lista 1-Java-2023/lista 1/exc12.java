/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 12
 */
import java.util.Scanner;
public class exc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cf, cc;

        System.out.println("Digite o custo de fábrica do carro: ");
        cf = input.nextDouble();
        cc = cf + (cf * 0.45) + (cf * 0.28);
        System.out.println ("O custo ao consumidor é de "+ cc);


    }

}

