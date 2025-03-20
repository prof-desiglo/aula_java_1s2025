package br.com.fsa;

abstract public class Veiculo {
    private int anoFrabricacao;
    protected int velocidade;
    private String nomeModelo;
    protected int a;
    public int b;
    int c; // Modificador package/default

    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public Veiculo(int velocidade){
        this.setVelocidade(velocidade);
    }
}
