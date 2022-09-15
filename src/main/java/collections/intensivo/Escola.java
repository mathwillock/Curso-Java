package collections.intensivo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Escola {

//    Cadastrar alunos sem matrícula repetida;
//    Listar todos os alunos;
//    Listar os alunos com o sobrenome informado;
//    Listar o nome do aluno mais idoso;
//    Listar a média de idade os alunos;
//    Atualizar os dados de um aluno, pesquisando por matrícula;
//    Remover os dados de um aluno, pesquisando por matrícula;

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Aluno> alunosA = new ArrayList<>();
        Turma turmaA = new Turma("A", alunosA);

        var alunoA =
                new Aluno(
                        1, "João", "José",  "123.456.789-00", sdf.parse("28/02/2013")
                );
        var alunoB =
                new Aluno(
                        2, "Maria", "das Dores", "987.654.321-00", sdf.parse("29/02/2013")
                );
        var alunoC =
                new Aluno(3, "Ana", "Severina", "987.654.321-00", sdf.parse("13/02/2013")
                );
        var alunoD =
                new Aluno(4, "José", "Couves", "987.654.321-00", sdf.parse("07/11/2013")
                );

        var aluno1 =
                new Aluno(1, "João", "da Silva", "123.456.789-77", sdf.parse("28/02/2013")
                );

        System.out.println("---------Adicionando alunos na turma A-----------");
        System.out.println(adicionarAluno(alunoA, turmaA));
        System.out.println(adicionarAluno(alunoB, turmaA));
        System.out.println(adicionarAluno(alunoC, turmaA));
        System.out.println(adicionarAluno(alunoD, turmaA));

        System.out.println("\n---------Adicionando aluno com matrícula repetida---------");
        System.out.println(adicionarAluno(aluno1, turmaA));

        System.out.println("\n---------Alunos da turma A: ------------\n");
        for (Aluno a : turmaA.alunos) {
            System.out.println(a.toString() + "\n");

        }

        System.out.println("-----------Sobrenome dos alunos: ----------");
        for (Aluno a : turmaA.alunos) {
                System.out.println(a.sobrenome);
        }

        System.out.println("\n-----------Aluno antes de atualizar: ----------");
        System.out.println(turmaA.alunos.get(0).toString());

        System.out.println(atualizarAluno(turmaA, aluno1));

        System.out.println("\n------------Aluno depois de atualizar: -----------");
        System.out.println(turmaA.alunos.get(0));

        System.out.println("\n------------Removendo aluno da matricula 3: ------------");
        System.out.println(removerAluno(turmaA, 3));

        System.out.println("\n-----------Removendo aluno da matricula 3: --------------");
        System.out.println(removerAluno(turmaA, 3));

        System.out.println("\n" + nomeMaisIdoso(turmaA) + " é o aluno mais velho da turma" + turmaA.nome);

        System.out.printf("\n" + mediaIdade(turmaA));

    }

    static String atualizarAluno(Turma turma, Aluno aluno) {
        for (Aluno a : turma.alunos) {
            if (a.matricula == aluno.matricula ) {
                a.nome = aluno.nome;
                a.cpf = aluno.cpf;
                return "Aluno " + a.nome + " atualizado com sucesso!";
            }
        }

        return "Aluno " + aluno.nome + " atualizado com sucesso!";
    }

    static String removerAluno(Turma turma, int matriculaAluno) {
        for (Aluno a : turma.alunos) {
            if (a.matricula == matriculaAluno ) {
                turma.alunos.remove(a);
                return "Aluno " + a.nome + " removido com sucesso!";
            }
        }

        return "Aluno da matricula " + matriculaAluno + " não existe!";
    }

    static String nomeMaisIdoso(Turma turma) {
        String nomeMaisIdoso = "";
        var aluno = turma.alunos;

        for(int i = 1; i < turma.alunos.size(); i++){
            var idade = aluno.get(0).nascimento;
            nomeMaisIdoso = aluno.get(0).nome;

            if (idade.after(aluno.get(1).nascimento)) {
                nomeMaisIdoso = aluno.get(1).nome;
            }
        }

        return nomeMaisIdoso;
    }

    static String mediaIdade(Turma turma) {
        double somaIdade = 0;
        double mediaIdade = 0;
        var aluno = turma.alunos;

        for (Aluno value : aluno) {

            somaIdade += value.nascimento.getTime();
        }
        mediaIdade = somaIdade / aluno.size();

        return "A média de idade dos alunos é: " + Math.ceil(mediaIdade);
    }

    static String adicionarAluno(Aluno aluno, Turma turma) {

        if (turma.alunos.size() == 0) {
            turma.alunos.add(aluno);
            return "Aluno adicionado com sucesso!";

        } else {
            for (Aluno a : turma.alunos) {
                if (a.matricula == aluno.matricula) {
                    return "Aluno já existe!";
                }
            }

            turma.alunos.add(aluno);
            return "Aluno adicionado com sucesso!";
        }

    }

}
