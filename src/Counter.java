import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws InvalidParamsException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int paramOne = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int paramTwo = terminal.nextInt();

        try {
            accountant(paramOne, paramTwo);
        } catch (Exception e) {
            System.out.println("Parâmetros inválidos!");
        }
    }

    static void accountant(int firstParam, int secondParam) throws InvalidParamsException {
        if (firstParam > secondParam) {
            throw new InvalidParamsException();
        }

        double result = secondParam - firstParam;

        for (int i = 1; i <= result; i++) {
            System.out.println(i);
        }
    }
}
