/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 2
 */
import java.util.Scanner;
public class exc2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double c1, c2, h;
        System.out.println("informe o valor do 1 cateto");
        c1 = input.nextFloat();
        System.out.println("informe o valor do 2 cateto");
        c2 = input.nextFloat();
        h = (c1*c1)+(c2*c2);
         h = Math.sqrt(h);
         System.out.println("o valor da hipotenusa"+h);
    }
}
