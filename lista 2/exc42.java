/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 42
 */
import java.util.Scanner;
public class exc42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int np, ma;
        System.out.print("qul oss ultimos 4 digitos da placa");
        np = input.nextInt();
        System.out.print("qual o mes atual");
        ma = input.nextInt();
        np = np%10;
        if(np==ma)
            System.out.println("O IPVA  vence neste mes.");
        else
            System.out.println("O IPVA  nao vence neste mes.");

    }
}
