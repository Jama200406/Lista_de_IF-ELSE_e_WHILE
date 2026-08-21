import java.util.Scanner;
public class Calculo_imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu peso em Kg:");
        double peso = sc.nextDouble();

        System.out.println("Insira sua altura em metros:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.format("Seu IMC é: %.2f kg/m². Você está abaixo do peso.%n", imc);
        } else if (imc < 25.0) {
            System.out.format("Seu IMC é: %.2f kg/m². Você está com peso normal.", imc);
        } else if (imc < 30.0) {
            System.out.format("Seu IMC é: %.2f kg/m². Você está com excesso de peso.%n", imc);
        } else {
            System.out.format("Seu IMC é: %.2f kg/m². Você está com obesidade.%n", imc);
        }

        sc.close();
    }
}
