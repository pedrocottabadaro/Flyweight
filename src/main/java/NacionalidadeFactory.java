
import java.util.HashMap;
import java.util.Map;
public class NacionalidadeFactory {
    private static Map<String, Nacionalidade> nacionalidades = new HashMap<>();

    public static Nacionalidade getNacionalidade(String pais, String cidade) {
        Nacionalidade nacionalidade = nacionalidades.get(pais);
        if (nacionalidade == null) {
            nacionalidade = new Nacionalidade(pais, cidade);
            nacionalidades.put(pais, nacionalidade);
        }
        return nacionalidade;
    }

    public static int getTotalNacionalidades() {
        return nacionalidades.size();
    }
}
