import br.com.dio.challenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNome("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setNome("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //Polimorfismo - tudo que tem dentro de conteúdo,
        // tem dentro de curso, mas nem td q tem dentro de curso, tem dentro de conteudo
        Conteudo conteudo1 = new Curso();
        conteudo1.setNome("conteudo 1");
        conteudo1.setDescricao("polimorfismo a partir da classe curso");
        conteudo1.calcularXp();
        System.out.println("polimorfismo 1 (Conteudo = Curso: " + conteudo1);

        Conteudo conteudo2 = new Mentoria();
        conteudo2.setNome("conteudo 1");
        conteudo2.setDescricao("polimorfismo a partir da classe curso");
        conteudo2.calcularXp();
        System.out.println("polimorfismo 2 (Conteudo = Mentoria: " + conteudo2);


        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setNome("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        System.out.println("====================================Divisor====================================");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp - Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}