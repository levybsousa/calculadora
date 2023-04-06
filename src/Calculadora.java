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
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Numero resultado = new Numero();

        System.out.println("Digite um valor:");
        numero1.setValor(teclado.nextDouble());

        System.out.println("Digite outro valor");
        numero2.setValor(teclado.nextDouble());

        resultado.setValor(numero1.getValor() + numero2.getValor());
        System.out.println(resultado.getValor());
    }

    public static void subtrairDoisNumeros() {

    }

    public static void multiplicarDoisNumeros() {

    }

    public static void dividirDoisNumeros() {

    }
}