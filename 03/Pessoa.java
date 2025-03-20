public class Pessoa extends Animal implements Iracional, Ilegal {
    //public String nome;
    private String nome;
    public int anoNascimento;
    public Roupa camiseta;
    public Roupa parteDeBaixo;

    public int getIdade(){
        return 2025 - anoNascimento;
    }

    public void hello(String mensagem1, String mensagem2){
        System.out.println(mensagem1 + " " + this.nome);
        System.out.println(mensagem2 + " " + this.getIdade());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEspecie(){ // Implementa o metodo do Pai
        return "Humano";
    }

    public void pensar() { // Implementa metodo da interface racional

    }

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa() {

    }
    public static void main(String args[]){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = p1;

        Pessoa p4 = new Pessoa("João");

        //p1.nome = "Felipe";
        p1.setNome("Felipe");
        p2.nome = "Bob";

        System.out.println(p1.getNome());
        System.out.println(p2.nome);
        System.out.println(p3.nome);

        p2.anoNascimento = 2000;

        int resultado = p2.getIdade();
        System.out.println(resultado);

        p2.hello("Meu nome:", "minha idade");

        p2.fazerBarulho();

        //Animal a = new Animal();
        Animal a = (Animal)p2;
        a.fazerBarulho();
        System.out.println(a.getEspecie());

        int x = Util.soma(1, 2);
    }
}