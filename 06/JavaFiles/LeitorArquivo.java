import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeitorArquivo {

    public static void main(String[] args) throws IOException {
		int linhas = 0;
        Scanner scanner = new Scanner(new File("Arquivo_Exemplo.txt"));

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
			System.out.println(next);
            linhas = linhas + 1;
        }
        scanner.close();
		System.out.println("Arquivo processado, " + linhas + " linhas lidas!" );
    }
}
