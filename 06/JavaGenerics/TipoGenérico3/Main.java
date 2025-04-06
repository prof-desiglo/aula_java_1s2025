public class Main {
	public static void main(String args[]){
			Processador pCarro = new Processador<Carro>();
			Carro c1 = new Carro();
			pCarro.setItem(c1);
			pCarro.processa();
			
			//
			Processador pBanana = new Processador<Banana>();
			Banana b1 = new Banana();
			pBanana.setItem(b1);
			pBanana.processa();
			
	}
}