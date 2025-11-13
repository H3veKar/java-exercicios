/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 12
 */
import java.util.Scanner;
public class exc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, prestacao,sb;
        System.out.println("qual o salario bruto");
        salario=  input.nextDouble();
        System.out.println("qual o valor da pestacao");
        prestacao=  input.nextDouble();
        sb = salario*0.3;
        if(prestacao>sb)
         System.out.println ("o emprestimo não pode ser concedido");
        else if(prestacao < sb)
            System.out.println ("o emprestimo  pode ser concedido");

    }

}

