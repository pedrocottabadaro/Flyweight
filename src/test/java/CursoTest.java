import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CursoTest {

    @Test
    public void deveRetornarIntercambistas() {
        Curso curso = new Curso();
        curso.criarCurso("Ana","Brasil","Juiz de Fora");
        curso.criarCurso("John","England","London");
        curso.criarCurso("Mikael","Scotland", "Edinburgh");

        List<String> saida = Arrays.asList(
                "Intercambista{nome='Ana',pais='Brasil',cidade='Juiz de Fora'}",
                "Intercambista{nome='John',pais='England',cidade='London'}",
                "Intercambista{nome='Mikael',pais='Scotland',cidade='Edinburgh'}");

        assertEquals(saida, curso.obterIntercambistas());
    }

    @Test
    public void deveRetornarTotalNacionalidades() {
        Curso curso = new Curso();
        curso.criarCurso("Ana","Brasil", "Juiz de Fora");
        curso.criarCurso("John","England", "London");
        curso.criarCurso("Mikael","Scotland", "Edinburgh");

        assertEquals(3, NacionalidadeFactory.getTotalNacionalidades());
    }
}
