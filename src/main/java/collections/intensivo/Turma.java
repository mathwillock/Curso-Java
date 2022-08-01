package collections.intensivo;

import java.util.ArrayList;
import java.util.Objects;

public class Turma {

    String nome;
    ArrayList<Aluno> alunos;

    public Turma(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return nome.equals(turma.nome) && alunos.equals(turma.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alunos);
    }


}
