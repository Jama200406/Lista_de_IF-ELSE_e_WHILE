import java.util.Scanner;

public class Calculo_inss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu salário bruto:");
        double salarioBruto = sc.nextDouble();

        double desconto = 0.0;

        double d1 = 1621.00;
        double d2 = 2902.84;
        double d3 = 4354.27;
        double d4 = 8475.55;

        if (salarioBruto <= d1) {
            desconto = salarioBruto * 0.075;
        } else if (salarioBruto <= d2) {
            desconto = (d1 * 0.075) + ((salarioBruto - d1) * 0.09);
        } else if (salarioBruto <= d3) {
            desconto = (d1 * 0.075) + ((d2 - d1) * 0.09) + ((salarioBruto - d2) * 0.12);
        } else if (salarioBruto <= d4) {
            desconto = (d1 * 0.075) + ((d2 - d1) * 0.09) + ((d3 - d2) * 0.12) + ((salarioBruto - d3) * 0.14);
        } else {
            desconto = 988.09;
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.format("Desconto INSS: R$ %.4f%n", desconto);
        System.out.format("Salário líquido: R$ %.4f%n", salarioLiquido);

        sc.close();
    }
}