import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o salario");
        double salario = scanner.nextDouble();
        System.out.println("Digite a classe");
        scanner.nextLine();
        String classe = scanner.nextLine();
        double aumento = 0;
        switch (classe){
            case "A":
                aumento = 0.15;
                break;

            case "B":
                aumento = 0.2;
                break;

            case "C":
                aumento = 0.3;
                break;

            default:
                System.out.println("Invalido");
                break;
        }
        System.out.println("Aumento: " + aumento*100 + " %");
        System.out.println("Salario: R$ " + df.format(salario*(1+aumento)));

    }
}
