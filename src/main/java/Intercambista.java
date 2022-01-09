public class Intercambista {

    private String nome;
    private Nacionalidade nacionalidade;

    public Intercambista(String nome, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String obterIntercambista() {
        return "Intercambista{" +
                "nome='" + this.nome + '\'' +
                ",pais='" + nacionalidade.getPais() + '\'' +
                ",cidade='" + nacionalidade.getCidade() + '\'' +
                '}';
    }
}
