import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);

        System.out.printf("Infome o código do seu curso:\n1. Sistemas da Informação\n2. Análise e Desenv. Sistemas\n3. Ciência da Computação\n4. Engenharia da Computação\n5. Engenharia de Software\n>>");
        int codC = ler.nextInt();

        System.out.printf("Informe o código da bolsa:\n1. Escola pública\n2. Bolsista\n3. Ex-aluno\n4. Tutor\n0. Sem bolsa\n>>");
        int codB = ler.nextInt();

        double valorCurso = mensalidadeCurso(codC);
        double desconto = descontoBolsa(codB);
        double valorBolsa = descontoBolsa(codB);
        String nomeBolsa = nomeBolsa(codB);
        String nomeCurso = nomeCurso(codC);
        double vFinal = calcularMensalidade(valorCurso, desconto);

        System.out.println("Você tem "+valorBolsa+"% de desconto pelo programa de "+nomeBolsa+" no curso de "+nomeCurso+". A parcela será de R$ "+vFinal);


    }

    public static double calcularMensalidade(double valorCurso, double desconto){
        double vFinal = valorCurso-(valorCurso*desconto/100);

        return vFinal;
    }


    public static String nomeCurso(int codC){
       String nomeCurso = "";
        if(codC==1){
            nomeCurso = "Sistemas da Informação";
        }
        else if(codC==2){
            nomeCurso = "Análise e Desenvolvimento de Sistemas";
        }
        else if(codC==3){
            nomeCurso = "Ciência da Computação";
        }
        else if(codC==4){
            nomeCurso = "Engenharia da Computação";
        }
        else if(codC==5){
            nomeCurso = "Engenharia de Software";
        }
        return nomeCurso;
    }

    public static double mensalidadeCurso(int codC){
        double valorCurso=0;
        if(codC==1){
            valorCurso = 550;
        }
        else if(codC==2){
            valorCurso = 750;
        }
        else if(codC==3){
            valorCurso = 1150;
        }
        else if(codC==4){
            valorCurso = 1300;
        }
        else if(codC==5){
            valorCurso = 950;
        }
        return valorCurso;
    }

    public static String nomeBolsa(int codB){
        String nomeBolsa = "";
        if(codB==1){
            nomeBolsa = "Escola pública";
        }
        else if(codB==2){
            nomeBolsa = "Bolsista";
        }
        else if(codB==3){
            nomeBolsa = "Ex-aluno";
        }
        else if(codB==4){
            nomeBolsa = "Tutor";
        }
        else if(codB==0){
            nomeBolsa = "Sem bolsa";
        }
        return nomeBolsa;
    }

    public static double descontoBolsa(int codB){
        double desconto=0;
        if(codB==1){
            desconto = 50;
        }
        else if(codB==2){
            desconto = 20;
        }
        else if(codB==3){
            desconto = 60;
        }
        else if(codB==4){
            desconto = 100;
        }
        else if(codB==0){
            desconto = 0;
        }
        return desconto;
    }
}
