public class Processador<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public void processa(){
		// Má prática use interfaces ao invés de casting
		if(item instanceof  Banana){
			System.out.println("Banana");
			Banana b = (Banana) item; //casting
		}
		if(item instanceof Carro){
			System.out.println("Carro");
		}
	}
}
