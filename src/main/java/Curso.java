import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Intercambista> intercambistas= new ArrayList<>();

    public void criarCurso(String nome,String pais, String cidade) {
        Nacionalidade nacionalidade = NacionalidadeFactory.getNacionalidade(pais, cidade);
        Intercambista intercambista = new Intercambista(nome, nacionalidade);
        intercambistas.add(intercambista);
    }

    public List<String> obterIntercambistas() {
        List<String> total = new ArrayList<String>();
        for (Intercambista intercambista : this.intercambistas) {
            total.add(intercambista.obterIntercambista());
        }
        return total;
    }
}
