import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        Resultado res = new Resultado();
        Concessionaria con = new Concessionaria();

       

        System.out.println("Insira o valor do veículo: ");
        veiculo.valor = ler.nextDouble();

        System.out.println("Insira as parcelas: ");
        veiculo.parc = ler.nextInt();

        System.out.println("Seu veículo no valor de R$ "+veiculo.valor+" ficou em "+veiculo.parc+"x de R$ "+con.calcularTotal(veiculo)/veiculo.parc);
    }
}
