package classe.equals;

public class Usuario {

    String nome;
    String email;


    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomesIguais = outro.nome.equals(this.nome);
            boolean emailsIguais = outro.email.equals(this.email);

            return nomesIguais && emailsIguais;
        } else {
            return false;
        }


    }

}
