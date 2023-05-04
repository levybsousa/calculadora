import java.util.Scanner;

public class Calculadora {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Menu calculadora");
        boolean sistema = true;
        while (sistema) {
            int opcao = teclado.nextInt();
            switch (opcao) {

                case 1:
                    sistema = false;
                    break;
                case 2:
                    somarDoisNumeros();
                    break;
                case 3:
                    subtrairDoisNumeros();
                    break;
                case 4:
                    dividirDoisNumeros();
                    break;
                case 5:
                    multiplicarDoisNumeros();
                    break;
                default:
                    System.out.println("Digite um valor válido");

            }

        }

    }

    public static void somarDoisNumeros() {
        System.out.println("Digite um valor:");
        double numero1 = teclado.nextDouble();

        System.out.println("Digite outro valor");
        double numero2 = teclado.nextDouble();

        System.out.println(numero1 + numero2);
    }

    public static void subtrairDoisNumeros() {
        System.out.println("Digite um valor:");
        double numero1 = teclado.nextDouble();

        System.out.println("Digite outro valor");
        double numero2 = teclado.nextDouble();

        System.out.println(numero1 - numero2);
    }

    public static void multiplicarDoisNumeros() {
        System.out.println("Digite um valor:");
        double numero1 = teclado.nextDouble();

        System.out.println("Digite outro valor");
        double numero2 = teclado.nextDouble();

        System.out.println(numero1 * numero2);
    }

    public static void dividirDoisNumeros() {
        System.out.println("Digite um valor:");
        double numero1 = teclado.nextDouble();

        System.out.println("Digite outro valor");
        double numero2 = teclado.nextDouble();

        System.out.println(numero1 / numero2);
    }
}
