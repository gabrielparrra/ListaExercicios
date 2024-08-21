import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Universidade uni = new Universidade();
        System.out.printf("Infome o código do seu curso:\n1. Sistemas da Informação\n2. Análise e Desenv. Sistemas\n3. Ciência da Computação\n4. Engenharia da Computação\n5. Engenharia de Software\n>>");
        int codC = ler.nextInt();

        System.out.printf("Informe o código da bolsa:\n1. Escola pública\n2. Bolsista\n3. Ex-aluno\n4. Tutor\n0. Sem bolsa\n>>");
        int codB = ler.nextInt();

        double valorCurso = uni.mensalidadeCurso(codC);
        double desconto = uni.descontoBolsa(codB);
        double valorBolsa = uni.descontoBolsa(codB);
        String nomeBolsa = uni.nomeBolsa(codB);
        String nomeCurso = uni.nomeCurso(codC);
        double vFinal = uni.calcularMensalidade(valorCurso, desconto);

        System.out.println("Você tem "+valorBolsa+"% de desconto pelo programa de "+nomeBolsa+" no curso de "+nomeCurso+". A parcela será de R$ "+vFinal);
    }
}
