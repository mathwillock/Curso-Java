package classe.desafio.classeData;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data(1,1,2000);
        data1.dia = 1;
        data1.mes = 1;
        data1.ano = 2000;

        var data2 = new Data();

        System.out.println(data1.dataFormatada());
        System.out.println(data2.dataFormatada());

    }

}
