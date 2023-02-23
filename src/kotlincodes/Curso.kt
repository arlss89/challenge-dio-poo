package kotlincodes

import br.com.dio.challenge.domain.Conteudo

class Curso: Conteudo() {
    var cargaHoraria = 0

    override fun toString(): String {
        return "Curso(titulo=$titulo, " +
                "descricao=$descricao, " +
                "cargaHoraria=$cargaHoraria)"
    }

    override fun calcularXp(): Double {
        return (XP_PADRAO + 20)
    }
}