package kotlincodes

class Curso {
    var titulo: String? = null
    var descricao: String? = null
    var cargaHoraria = 0

    override fun toString(): String {
        return "Curso(titulo=$titulo, " +
                "descricao=$descricao, " +
                "cargaHoraria=$cargaHoraria)"
    }
}