import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
       
        notaAluno notas = new notaAluno();

        System.out.println("Nota 1: ");
        notas.nota1 = ler.nextDouble();
        
        System.out.println("Nota 2: ");
        notas.nota2 = ler.nextDouble();

        System.out.println("Nota 3: ");
        notas.nota3 = ler.nextDouble();

        System.out.println("Faltas: ");
        notas.faltas = ler.nextInt();
    
        Boletim bo = new Boletim();
        Resultado res = bo.calcularMedia(notas);

        

        System.out.println("Média: " +res.media);
        System.out.println("Situação: " +res.situacao);
    }
        
    
}
