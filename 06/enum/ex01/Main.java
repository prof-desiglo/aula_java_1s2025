public class Main {
	public static void main(String args[]){
		System.out.println(Planeta.TERRA);
		
		Planeta p = Planeta.TERRA;
		
		if(p == Planeta.TERRA) {
			System.out.println("É a terra");
		}
		
		switch(p){
			case Planeta.TERRA:
				System.out.println("É a terra switch case");
				//break;
			case Planeta.MARTE:
				System.out.println("É Marte switch case");
				//break;
			default:
				System.out.println("Default");
		}

		int a = 1 < 2 ? 3 : 4;
		System.out.println(a);
	}
}
