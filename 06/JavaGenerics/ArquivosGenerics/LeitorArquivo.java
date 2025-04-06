import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorArquivo {

    public static void main(String[] args) throws IOException {
        List<String> valores = new ArrayList<>();
        Scanner scanner = new Scanner(new File("Arquivo_Exemplo.txt"));

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
			//System.out.println(next);
            valores.add(next);
        }
        scanner.close();
		
		for(String v : valores){
			System.out.println(v);
		}
    }
}
