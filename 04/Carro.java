import br.com.fsa.*;
import br.com.fsa.Veiculo;

public class Carro extends Veiculo implements ICoisa, IInterface {
    public Pneu pneu[]; 

    public Carro(int velocidade){
        super(velocidade);
    }

    public void fazerAlgo(){
        System.out.println("Fazendo algo");
    }
}
