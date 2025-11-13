/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 11
 */
import java.util.Scanner;
public class exc11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pc,pv, p;
        System.out.println("Informe o preco de custo ");
        pc = input.nextDouble();
        System.out.println("Informe o percentual ");
        p = input.nextDouble();
        pv = ((pc*p)/100)+pc;
        System.out.println("O preco de venda e "+pv);



    }
}
