import br.com.fsa.*;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro(100);
        Veiculo v = (Veiculo)c;
        System.out.println(v.getVelocidade());
        ICoisa coisa = (ICoisa)c;
        coisa.fazerAlgo();
        //

        ObjetoA a = new ObjetoA();
        ObjetoB b = new ObjetoB();
        ObjetoA ab = (ObjetoA) b;
        System.out.println(a.metodoX()); //0
        System.out.println(b.metodoX());  //1
        System.out.println(ab.metodoX()); //1

        System.out.println(b.metodoX(5));
    }
}
