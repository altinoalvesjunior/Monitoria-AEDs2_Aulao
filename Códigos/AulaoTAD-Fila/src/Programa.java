import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila();

        int opcao;

        do {
            System.out.print("\n ---- MENU ----");
            System.out.print("\n 1 - Inserir");
            System.out.print("\n 2 - Remover");
            System.out.print("\n 3 - Visualizar");
            System.out.print("\n 4 - Sair");

            System.out.print("\n\nEscolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite um número para adicionar na fila: ");
                    int numero = sc.nextInt();
                    fila.enfileirar(numero);
                break;

                case 2:
                    System.out.println();
                    fila.desenfileirar();
                break;

                case 3:
                    System.out.println();
                    fila.imprimir();
                break;

                case 4:
                    System.out.print("\nSaindo do programa!");
                break;

                default:
                    System.out.print("\nOpção Inválida! Escolha novamente");
                break;
            }

        } while(opcao != 4);

        sc.close();
    }

}
