package classe.desafio.classeData;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String dataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
