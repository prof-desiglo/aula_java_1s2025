import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
  public static void main(String[] args) {
    try {
      FileWriter escritor = new FileWriter("filename.txt");
      escritor.write("Cria um Arquivo com uma linha");
      escritor.close();
      System.out.println("Arquivo Processado");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

