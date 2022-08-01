package collections.intensivo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Aluno {

    int matricula;
    String nome;
    String sobrenome;
    String cpf;
    Date nascimento;

    public Aluno(int matricula, String nome, String sobrenome, String cpf, Date nascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(nome, aluno.nome) && Objects.equals(sobrenome, aluno.sobrenome) && Objects.equals(cpf, aluno.cpf) && Objects.equals(nascimento, aluno.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, sobrenome, cpf, nascimento);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            String dataFormatada =  sdf.format(sdf.parse(sdf.format(nascimento))) ;

            return "Aluno{\n" +
                    "matricula=" + matricula +
                    ", nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", nascimento=" + dataFormatada + "\n" +
                    '}'
            ;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }





    }
}
