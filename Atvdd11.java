import java.util.Scanner;

public class Atvdd11 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o salário bruto do funcionário: R$ ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
            int anosTrabalhados = scanner.nextInt();

            double bonus = 0.0;
            double imposto = 0.0;
            double salarioLiquido = 0.0;

            if (anosTrabalhados > 10) {
                bonus = salarioBruto * 0.10;
            } else if (anosTrabalhados >= 5) {
                bonus = salarioBruto * 0.05;
            } else {
                bonus = 0.0;
            }

            if (salarioBruto > 5000) {
                imposto = salarioBruto * 0.27;
            } else if (salarioBruto >= 3000) {
                imposto = salarioBruto * 0.18;
            } else {
                imposto = salarioBruto * 0.10;
            }
            salarioLiquido = (salarioBruto - imposto) + bonus;
            System.out.println("Salario Bruto: " + salarioBruto);
            System.out.println("Imposto: " + imposto);
            System.out.println("Bonus: " + bonus);
            System.out.println("Salário Liquido: " + salarioLiquido);

        }
    }
