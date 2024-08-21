import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        String nomeCurso = ""; 
        String nomeBolsa = "";
        double valorCurso=0;
        double valorBolsa=0;
        System.out.printf("Infome o código do seu curso:\n1. Sistemas da Informação\n2. Análise e Desenv. Sistemas\n3. Ciência da Computação\n4. Engenharia da Computação\n5. Engenharia de Software\n>>");
        int codCurso = ler.nextInt();
            if(codCurso==1){
                nomeCurso = "Sistemas da Informação";
                valorCurso = 550;
            }
            else if(codCurso==2){
                nomeCurso = "Análise e Desenvolvimento de Sistemas";
                valorCurso = 750;
            }
            else if(codCurso==3){
                nomeCurso = "Ciência da Computação";
                valorCurso = 1150;
            }
            else if(codCurso==4){
                nomeCurso = "Engenharia da Computação";
                valorCurso = 1300;
            }
            else if(codCurso==5){
                nomeCurso = "Engenharia de Software";
                valorCurso = 950;
            }
            
        System.out.printf("Informe o código da bolsa:\n1. Escola pública\n2. Bolsista\n3. Ex-aluno\n4. Tutor\n0. Sem bolsa\n>>");
        int codBolsa = ler.nextInt();
        if(codBolsa==1){
            nomeBolsa = "Escola pública";
            valorBolsa = 50;
        }
        else if(codBolsa==2){
            nomeBolsa = "Bolsista";
            valorBolsa = 20;
        }
        else if(codBolsa==3){
            nomeBolsa = "Ex-aluno";
            valorBolsa = 60;
        }
        else if(codBolsa==4){
            nomeBolsa = "Tutor";
            valorBolsa = 100;
        }
        else if(codBolsa==0){
            nomeBolsa = "Sem bolsa";
            valorBolsa = 0;
        }

        double vFinal=valorCurso-(valorCurso*valorBolsa/100);

        System.out.println("Você tem "+valorBolsa+"% de desconto pelo programa de "+nomeBolsa+" no curso de "+nomeCurso+". A parcela será de R$ "+vFinal);
    }
}
