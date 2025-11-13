/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 7
 */
import java.util.Scanner;
public class Exc7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double d, v, t, ms;
        System.out.println("qual a distancia entre 2 cidades");
        d = input.nextDouble();
        System.out.println("qual a velocidade");
        v = input.nextDouble();
        t = d/v;
        ms = v/3.6;
        System.out.println("o tempo para chegar sera"+t +" e o metros por segundo e"+ms);

    }
}
