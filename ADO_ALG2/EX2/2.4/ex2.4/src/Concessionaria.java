public class Concessionaria {
    public double calcularTotal(Veiculo veiculo){
        Resultado res = new Resultado();

        res.juros = acharJuros(veiculo.parc);
        res.vFinal = veiculo.valor+(veiculo.valor*res.juros/100);

        return res.vFinal;

    }

    private double acharJuros(int parc){
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
