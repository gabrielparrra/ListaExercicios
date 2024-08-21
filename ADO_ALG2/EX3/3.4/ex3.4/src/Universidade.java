public class Universidade {
    
    public Resultado calcularMensalidade(Opcoes opc){
        Resultado res = new Resultado();
        
        res.nomeCurso = nomeCurso(opc.codC);
        res.valorCurso = mensalidadeCurso(opc.codC);
        
        res.nomeBolsa = nomeBolsa(opc.codB);
        res.desconto = descontoBolsa(opc.codB);

        res.vFinal = res.valorCurso-(res.valorCurso*res.desconto/100);

        return res;
        
    }

    private String nomeCurso(int codC){
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

    private double mensalidadeCurso(int codC){
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

    private String nomeBolsa(int codB){
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

    private double descontoBolsa(int codB){
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
