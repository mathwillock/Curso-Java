package poo.composicao.relacaoManyToMany;

public class CursoTeste {


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        aluno3.adicionarCurso(curso1);

        curso2.adicionarAluno(aluno1);
        aluno3.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso2);

        aluno3.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno1.adicionarCurso(curso3);


//

        System.out.println("\n");
        obterAlunos(curso1);

        System.out.println("\n");
        obterAlunos(curso2);

        System.out.println("\n");
        obterAlunos(curso3);

        System.out.println("\n");
        obterCursos(aluno1);

        System.out.println("\n");
        obterCursos(aluno2);

        System.out.println("\n");
        obterCursos(aluno3);


    }

    public static void obterAlunos(Curso curso){
        System.out.printf("Curso: %s.\n---Alunos matriculados:--- \n", curso.nome.toUpperCase());
        for (Aluno aluno: curso.alunos) {
            System.out.printf("%s.\n", aluno.nome);
        }
    }

    public static void obterCursos(Aluno aluno) {
        System.out.printf("Me chamo %s. Estou matriculado nos seguintes cursos: \n", aluno.nome);
        for (Curso curso: aluno.cursos) {
            System.out.printf(curso.nome + ".\n");
        }
    }






}
