
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Exemplo de descrição do curso Java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Exemplo de descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Exemplo de descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);

        bootcamp.getConteudos().add(mentoria);

        Dev d1 = new Dev();
        d1.setNome("Ana");
        d1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + d1.getConteudosInscritos());

        System.out.println("--");
        System.out.println("Conteúdos Inscritos Ana:" + d1.getConteudosInscritos());

        Dev d2 = new Dev();
        d2.setNome("Pedro");
        d2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + d2.getConteudosInscritos());

        System.out.println("Conteúdos Inscritos Pedro:" + d2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + d2.getConteudosConcluidos());

    }
}