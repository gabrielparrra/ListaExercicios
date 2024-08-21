import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Opcoes opc = new Opcoes();
        
        System.out.printf("Infome o código do seu curso:\n1. Sistemas da Informação\n2. Análise e Desenv. Sistemas\n3. Ciência da Computação\n4. Engenharia da Computação\n5. Engenharia de Software\n>>");
        opc.codC = ler.nextInt();

        System.out.printf("Informe o código da bolsa:\n1. Escola pública\n2. Bolsista\n3. Ex-aluno\n4. Tutor\n0. Sem bolsa\n>>");
        opc.codB = ler.nextInt();

        
        Universidade uni = new Universidade();     
        Resultado res  = uni.calcularMensalidade(opc);
        
        System.out.println("Você tem "+res.desconto+"% de desconto pelo programa de "+res.nomeBolsa+" no curso de "+res.nomeCurso+". A parcela será de R$ "+res.vFinal);

    }
}
