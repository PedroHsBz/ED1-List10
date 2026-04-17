import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a capacidade do vetor: ");
        int capacidade = sc.nextInt();

        int[] lista = new int[capacidade];

        int n = 0;
        int op;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("            Menu             ");
            System.out.println("-----------------------------");
            System.out.println("1. Inserir Elemento (Ordem Decrescente)");
            System.out.println("2. Exibir Lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o número para inserir: ");
                    int novoValor = sc.nextInt();
                    n = inserirOrdenadoDecrescente(lista, novoValor, n);
                    break;
                case 2:
                    display(lista, n);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

        sc.close();
    }

    public static int inserirOrdenadoDecrescente(int[] lista, int novoValor, int n) {
        if (n >= lista.length) {
            System.out.println("Array cheio. Não é possível inserir o novo valor.");
            return n;
        }
        int i = 0;
        while (i < n && novoValor < lista[i]) {
            i++;
        }
        for (int j = n; j > i; j--) {
            lista[j] = lista[j - 1];
        }
        lista[i] = novoValor;
        return n + 1;
    }

    public static void display(int[] lista, int n) {
        if (n == 0) {
            System.out.println("A lista está vazia.");
            return;
        }

        System.out.print("Lista atual: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("]");
    }
}