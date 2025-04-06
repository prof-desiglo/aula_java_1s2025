import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivoSegundo {
  public static void main(String[] args) {
    try {
      FileWriter escritor = new FileWriter("filename2.txt", true);
      escritor.write("Escreve no arquivo ? \n");
      escritor.close();
      System.out.println("Arquivo Processado");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

