import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Resultado é: " + fatorial(n));

        sc.close();
    }

    public static int fatorial(int numUsuario){
        //caso trivial
        if(numUsuario == 0 || numUsuario == 1){ //caso de parada
            return 1;
        }
        else{
            //recursão ocorre aqui
            return numUsuario * fatorial(numUsuario - 1);
                // 5 * fatorial(4)
                // 4 * fatorial(3)
                // 3 * fatorial(2)
                // 2 * fatorial(1)
        }
    }

}
