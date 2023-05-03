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
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double resultado = teclado.nextDouble();

        System.out.println("Digite um valor:");
//        numero1.setValor(teclado.nextDouble());

        System.out.println("Digite outro valor");
//        numero2.setValor(teclado.nextDouble());

//        resultado.setValor(numero1.getValor() + numero2.getValor());
//        System.out.println(resultado.getValor());
    }

    public static void subtrairDoisNumeros() {
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double resultado = teclado.nextDouble();

        System.out.println("Digite um valor:");
//        numero1.setValor(teclado.nextDouble());

        System.out.println("Digite outro valor");
//        numero2.setValor(teclado.nextDouble());

//        resultado.setValor(numero1.getValor() - numero2.getValor());
//        System.out.println(resultado.getValor());
    }

    public static void multiplicarDoisNumeros() {
       double numero1 = teclado.nextDouble();
       double numero2 = teclado.nextDouble();
       double resultado = teclado.nextDouble();

        System.out.println("Digite um valor:");
//        numero1.setValor(teclado.nextDouble());

        System.out.println("Digite outro valor");
//        numero2.setValor(teclado.nextDouble());

//        resultado.setValor(numero1.getValor() * numero2.getValor());
//        System.out.println(resultado.getValor());
    }

    public static void dividirDoisNumeros() {
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double resultado = teclado.nextDouble();

        System.out.println("Digite um valor:");
//        numero1.setValor(teclado.nextDouble());

        System.out.println("Digite outro valor");
//        numero2.setValor(teclado.nextDouble());

//        resultado.setValor(numero1.getValor() / numero2.getValor());
//        System.out.println(resultado.getValor());
    }
    }
