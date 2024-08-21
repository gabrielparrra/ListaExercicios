import java.util.Scanner;

public class App {
   public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira as três notas do aluno: ");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        System.out.println("Insira as faltas: ");
        int faltas = ler.nextInt();

        Boletim bo = new Boletim();

        double media = bo.calcularMedia(n1, n2, n3);
        String sit = bo.verificarSituacao(media, faltas);
        
        System.out.printf("Sua média é: %.2f.\nSua situação é: %s", media, sit);

    }
}
