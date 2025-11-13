/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 17
 */
import java.util.Scanner;
public class exc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vd, t, r, vt;
        System.out.println("qual o valor do deposito");
        vd = input.nextDouble();
        System.out.println("qual a taxa");
        t= input.nextDouble();
        r = (vd*t)/100;
        vt = vd + r;
        System.out.println("O rendimento e " + r + " e o valor total e"+vt);
    }
}
