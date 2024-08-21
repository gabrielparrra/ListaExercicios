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

        double media = calcularMedia(n1, n2, n3);
        String sit = verificarSituacao(media, faltas);
        
        System.out.printf("Sua média é: %.2f.\nSua situação é: %s", media, sit);

    }

    public static double calcularMedia(double n1, double n2, double n3){
        double media = (n1+n2+n3)/3;
        return media;
    }

    public static String verificarSituacao(double media, int faltas){
        
        String sit = "";
        
        if (faltas>4){
            sit = "DP por faltas";
        }
        else if(media>=8){
            sit = "Aprovado com sucesso";
        }
        else if(media>=6 && media<8){
            sit = "Aprovado";
        }
        else if(media>=3 && media<6){
            sit = "Recuperação";
        }
        else if(media<3){
            sit = "Reprovado";
        }
        else{
            sit = "Desistente";
        }

        return sit;
    }
}
