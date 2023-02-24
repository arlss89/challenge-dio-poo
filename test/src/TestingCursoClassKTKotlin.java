import br.com.dio.challenge.domain.Curso;
import kotlincodes.CursoKotlin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestingCursoClassKTKotlin {

    @Test
    @DisplayName("Instanciando uma classe de kotlin e testando a interação com as demais classes java: ")
    void instanciandoCursoClassEmKotlin() {
        CursoKotlin cursoKotlin = new CursoKotlin();
        cursoKotlin.setNome("curso java");
        cursoKotlin.setDescricao("descrição curso java");
        cursoKotlin.setCargaHoraria(8);

        final String cursoEsperado = "Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}";

        //Testando a igualdade com a Curso.kt
        assertEquals(cursoKotlin.toString(), cursoEsperado);
    }

    @Test
    @DisplayName("Testando a classe Curso em java")
    void instanciandoCursoClassEmJava()
    {
        Curso cursoJava = new Curso();
        cursoJava.setNome("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(8);

        final String cursoEsperado = "Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}";

        //Testando a igualdade com Curso.java
        assertEquals(cursoJava.toString(), cursoEsperado);
    }
}
