public class Switch {
	public static void main(String args[]){
		int x = 5;
		switch(x){
			case 1:
				System.out.println("primeiro");
			break;
			case 5:
				System.out.println("Segundo");
			case 2:
				System.out.println("Terceiro");
			break;
			default:
				System.out.println("Quinto");
		}
	}
}