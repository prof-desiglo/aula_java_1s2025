public class Main {
	void metodo1() throws Exception {
		if(true) throw new Exception("Descrição do Erro"); 
		System.out.println("Olá");
	}
	public static void main(String args[]){
		Main m = new Main();
		try {
			m.metodo1();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}