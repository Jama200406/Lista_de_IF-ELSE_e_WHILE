import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        if (num < 0)
            System.out.println("Por favor, digite um número inteiro positivo.");

        int fatorial = 1;
        int i = 1;

        while (i <= num) {
            fatorial *=i;
            i+=1;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
        sc.close();
    }
}
