package compressor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("/home/hilton/Documentos/Intellij Idea - Projects/EDB2/CompressorDeTexto/Textos/teste.txt");
        HashMap dictionary = new HashMap(10);


        byte bytes[] = Files.readAllBytes(caminho);

        String str = new String(bytes);

        char characters[] = str.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (dictionary.containsKey(characters[i])) {
                Integer valor;
                valor = (Integer) dictionary.get(characters[i]);
                dictionary.put(characters[i], valor + 1);
            } else {
                dictionary.put(characters[i], 1);
            }
        }
    }
}
