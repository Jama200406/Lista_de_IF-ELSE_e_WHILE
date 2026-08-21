import java.util.Scanner;

public class Calculo_imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu salário bruto:");
        double salarioBruto = sc.nextDouble();

        double imposto = 0.0;

        if (salarioBruto <= 2259.20) 
            imposto = 0.0; // Isento
        else if (salarioBruto <= 2826.65) 
            imposto = (salarioBruto * 0.075) - 169.44;
        else if (salarioBruto <= 3751.05) 
            imposto = (salarioBruto * 0.15) - 381.44;
        else if (salarioBruto <= 4664.68) 
            imposto = (salarioBruto * 0.225) - 662.77;
        else 
            imposto = (salarioBruto * 0.275) - 896.00;

        if (imposto < 0)
            imposto = 0.0;

        double salarioLiquido = salarioBruto - imposto;

        System.out.format("Desconto: R$ %.2f%n", imposto);
        System.out.format("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}