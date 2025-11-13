/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 2
 */
import java.util.Scanner;
public class exc2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, r;
        System.out.println("qual o primeiro numeoro");
        n1 = input.nextInt();
        System.out.println("qual o  segundo numero") ;
        n2 = input.nextInt();
        r = n1 + n2;
        if (r>10)
            System.out.println("o resultado e"+r) ;


    }
}

