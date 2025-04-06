public class Main {
	void metodo1() throws Exception {
		if(true) throw new Exception("Descrição do Erro"); 
		System.out.println("Olá");
	}
	public static void main(String args[]) throws Exception {
		Main m = new Main();
		m.metodo1();
	}
}