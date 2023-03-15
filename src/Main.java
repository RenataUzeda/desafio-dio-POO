import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java para iniciante");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("JavaScript para iniciante");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Mentoria Java para iniciante");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Conhecendo a linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev developer1 = new Dev();
        developer1.setNome("Renata");
        developer1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + developer1.getNome() + developer1.getConteudosInscritos());
        developer1.progredir();
        developer1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + developer1.getNome() + developer1.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + developer1.getNome() + developer1.getConteudosConcluidos());
        System.out.println("XP: " + developer1.calcularTotalXp());

        System.out.println("---------------");

        Dev developer2 = new Dev();
        developer2.setNome("Artur");
        developer2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + developer2.getNome() + developer2.getConteudosInscritos());
        developer2.progredir();
        developer2.progredir();
        developer2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + developer2.getNome() + developer2.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + developer2.getNome() + developer2.getConteudosConcluidos());
        System.out.println("XP: " + developer2.calcularTotalXp());
    }
}