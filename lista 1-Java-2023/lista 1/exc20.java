/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 20
 */
import java.util.Scanner;
public class exc20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double na, vd, ot, dd, os, va, vt;
        System.out.println("qual o numeo de apartamentos");
        na= input.nextDouble();
        System.out.println("qual o valor da diaria ");
        vd= input.nextDouble();

        dd =  vd-((vd*25)/100);
        ot = dd*2*na;
        System.out.println("se a oucupacao for total o hotel ira arrecadar"+ot);

        os = na*0.7;
        va = os*dd*2;
        System.out.println("se a oucupacao for 70% o hotel ira arrecadar"+va);

        vt = na*2*vd;
        System.out.println("se não ouvesse desconto o hotel ira arrecadar"+vt);





    }
}
