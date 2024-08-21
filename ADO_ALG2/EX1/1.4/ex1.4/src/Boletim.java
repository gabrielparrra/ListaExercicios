public class Boletim {
    public Resultado calcularMedia(notaAluno notas){
        
        double media = (notas.nota1+notas.nota2+notas.nota3)/3;
        String sit = verificarSituacao(media, notas.faltas);
        
        Resultado res = new Resultado(); 
        
        res.media = media;
        res.situacao = sit;

        return res;
    }

    private String verificarSituacao(double media, int faltas){
        String sit = " ";

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
