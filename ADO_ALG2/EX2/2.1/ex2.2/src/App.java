import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double vFinal;

        System.out.println("Insira o valor do veículo: ");
        double valor = ler.nextDouble();

        System.out.println("Insira as parcelas: ");
        int parc = ler.nextInt();

        if(parc==1){
            vFinal = valor;
        }
        else if(parc>=2 && parc<=6){
            vFinal = valor+(valor*0.03);
        }
        else{
            vFinal = valor+(valor*0.05);
        }

        System.out.println("Seu veículo no valor de R$ "+valor+" ficou em "+parc+"x de R$ "+vFinal/parc);


    }
}
