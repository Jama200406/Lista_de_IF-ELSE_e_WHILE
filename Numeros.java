import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("\nNúmeros pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i+= 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNúmeros ímpares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i+= 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}