import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma posição para encontrá-lo na sequência de Fibonacci: "); // termo para encontrar na sequência
        int n = sc.nextInt();

        System.out.println("Resultado: " + encontrarFibonacci(n));

        sc.close();
    }

    public static int encontrarFibonacci(int termoUsuario){

        if(termoUsuario < 2){ // pos 0 = 0 && pos 1 = 1
            return termoUsuario;
        }
        else{
            return encontrarFibonacci(termoUsuario - 1) + encontrarFibonacci(termoUsuario - 2);
        }

    }


}
