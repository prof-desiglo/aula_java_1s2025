public class Processador<T extends Veiculo> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public void processaAndar(){
		item.andar();
	}
}
