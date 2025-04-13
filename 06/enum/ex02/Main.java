public class Main {
	public static void main(String args[]){
		System.out.println(Planeta.TERRA);
		System.out.println(Planeta.TERRA.getGravidade());
		System.out.println(Planeta.TERRA.getMassa(70));
		System.out.println(Planeta.MARTE.getPeso(70, Planeta.TERRA));
	}
}