import java.util.Scanner;

public class Main {
	void metodo1(int o) throws Exception, ErroLeitura {
		if(o == 1) throw new Exception("Descrição do Erro"); 
	    if(o == 2) throw new ErroCustomizado(); 
		if(o == 3) throw new ErroLeitura(); 
		System.out.println("Olá");
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String linha = scanner.nextLine();
		int opcao = 0;
		try {
            opcao = Integer.valueOf(linha);
            System.out.println("Selecionado: " + opcao);

        } catch (NumberFormatException e) {
            System.out.println("Input inteiro inválido");
			System.exit(-1); // Mesma coisa de terminar um programa C com return -1
        }
		
		
		Main m = new Main();
		try {
			m.metodo1(opcao);
		} catch(ErroCustomizado e) {
			System.out.println("ErroCustomizado");
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();
		} catch(Exception e) {
		    System.out.println("Exception");
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();
		} catch(ErroLeitura e) {
			System.out.println("ErroLeitura");
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}