import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor do veículo: ");
        double valor = ler.nextDouble();

        System.out.println("Insira as parcelas: ");
        int parc = ler.nextInt();

        double juros = acharJuros(parc);
        double vFinal = calcularTotal(valor, juros);

        
        System.out.println("Seu veículo no valor de R$ "+valor+" ficou em "+parc+"x de R$ "+vFinal/parc);
    }

    public static double calcularTotal(double valor, double juros){
        double vFinal = valor+(valor*juros/100);
        

        return vFinal;
    }

    public static double acharJuros(int parc){
        double juros = 0;
        if(parc>=2 && parc<=6){
            juros = 3;
        }
        else{
            juros = 5;
        }

        return juros;
    }
}
