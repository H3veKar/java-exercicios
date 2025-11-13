/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 9
 */
import java.util.Scanner;
public class exc9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, F;
        System.out.println("qual a temperatura em celcius  ");
        c = input.nextDouble();
        F=(9*c+160)/5;
        System.out.println("A temperatura em F e  "+F);

    }
}
