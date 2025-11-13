/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 8
 */
import java.util.Scanner;
public class exc8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double n, d;
        System.out.println(" o numero ");
        n = input.nextDouble();
        d = n%5;
        if(d==0)
            System.out.println(" o numero  e divisivel por 5");
        else
            System.out.println(" o numero não e divisivel por 5");
    }
}
