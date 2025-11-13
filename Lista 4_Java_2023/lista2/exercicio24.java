import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N[][] = new int[5][10], j, i, P[] = new int[10], soma = 0, maior = 0, indice = 0, menor = 0, preco = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("quaçl o preco do produto");
            P[i] = input.nextInt();
        }
        for (i = 0; i < 10; i++) {

            for (j = 0; j < 5; j++) {
                System.out.println("qual a quant no mercado x");
                N[i][j] = input.nextInt();
                System.out.println(N[i][j]);
            }

        }
        for (i = 0; i < 10; i++) {

            for (j = 0; j < 5; j++) {
                soma = soma + N[i][j];

            }

        }
        for (i = 0; i < 10; i++) {

            for (j = 0; j < 5; j++) {
                System.out.println(soma);
            }
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                if (maior > N[j][i]) {
                    maior = N[j][i];
                    indice = i;
                }
            }
            System.out.println("o valor do produto e" + indice);
        }
        for (i = 0; i < 5; i++) {


            for (j = 0; j < 10; j++) {
                if (N[i][j] < menor)
                    menor = N[i][j];
            }
        }
        System.out.println("o menor estoque e" + menor);
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                preco = N[j][i] * P[j];
            }
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 10; j++) {
                    System.out.println("preco");
                }

            }

        }
    }
}
}
