package classe.classeValorReferencia;

import classe.desafio.classeData.Data;

public class valorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // b recebe o valor de a (atribuição por valor)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // d2 recebe o valor de d1 (atribuição por referência => Objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2020;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarParaVAlorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());


    }

    static void voltarParaVAlorPadrao(Data data) {
        data.dia = 1;
        data.mes = 1;
        data.ano = 1970;
    }


}
