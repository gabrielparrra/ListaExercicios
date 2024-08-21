public class Concessionaria {

    public double calcularTotal(double valor, double juros){
        double vFinal = valor+(valor*juros/100);
        

        return vFinal;
    }

    public double acharJuros(int parc){
        double juros = 0;
        if(parc>=2 && parc<=6){
            juros = 3;
        }
        else{
            juros = 5;
        }

        return juros;
    }
    
}