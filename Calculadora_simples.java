import java.util.Scanner;
public class Calculadora_simples {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int first_number = sc.nextInt();

        System.out.println("Digite outro valor inteiro:");
        int second_number = sc.nextInt();

        System.out.println("A soma desses valores é: " + (first_number + second_number));
        System.out.println("A subtração desses valores é: " + (first_number - second_number));
        System.out.println("O produto desses valores é: " + (first_number * second_number));

        if (second_number != 0)
            System.out.println("A divisão desses valores é: " + (first_number / second_number));
        else 
            System.out.println("Na matemática, uma divisão por 0 é considerada indefinida ou impossível.");

        sc.close();
    }
}