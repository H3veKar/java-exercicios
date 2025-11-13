/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 3
 */
import java.util.Scanner;
public class exc3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double vp,d;
        System.out.println("informe o valor do produto");
        vp = input.nextDouble();
        d =  vp -((vp*9)/100);

        System.out.println("o produto com desconto foi"+d);
    }
}
