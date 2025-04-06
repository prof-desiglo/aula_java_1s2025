public class Main {
	public static void main(String args[]) {
		try{
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			if(e.getMessage().equals("/ by zero")){
				System.out.println("Divisão por zero evitada");
			}
			else {
				throw e;
			}
		}
	}
}