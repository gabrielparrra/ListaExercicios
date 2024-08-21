import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor do veículo: ");
        double valor = ler.nextDouble();

        System.out.println("Insira as parcelas: ");
        int parc = ler.nextInt();

        Concessionaria con = new Concessionaria();

        double juros = con.acharJuros(parc);
        double vFinal = con.calcularTotal(valor, juros);

        System.out.println("Seu veículo no valor de R$ "+valor+" ficou em "+parc+"x de R$ "+vFinal/parc);
    }
}
