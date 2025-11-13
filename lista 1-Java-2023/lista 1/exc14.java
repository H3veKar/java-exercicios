/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 14
 */
import java.util.Scanner;
public class exc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, nv;
        System.out.println(" informe o salario");
        s = input.nextDouble();
        nv = ((37*s)/100)+s;
        System.out.println("O novo salario e "+nv);


    }
}


