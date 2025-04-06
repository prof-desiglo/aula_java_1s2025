public class Main {
	void metodo1(){
		if(true) throw new Exception("Descrição do Erro"); //Método não declara a Exceção
		System.out.println("Olá");
	}
	public static void main(String args[]) {
		Main m = new Main();
		m.metodo1();
	}
}