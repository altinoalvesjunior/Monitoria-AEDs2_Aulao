import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        // divisão numeros inteiros

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Resultado = " + divisao(dividendo, divisor));

        sc.close();
    }

    public static int divisao(int dividendoUsuario, int divisorUsuario){
        if(dividendoUsuario < divisorUsuario){
            return 0;
        }
        else{
            return 1 + divisao(dividendoUsuario - divisorUsuario, divisorUsuario);
        }
    }


}