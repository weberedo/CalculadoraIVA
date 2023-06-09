import java.util.Scanner;

public class CalculadoraIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor sem IVA: ");
        double valorSemIVA = scanner.nextDouble();

        double valorComIVA = valorSemIVA * 1.23;

        System.out.println("Valor com IVA (23%): " + valorComIVA);
    }
}
