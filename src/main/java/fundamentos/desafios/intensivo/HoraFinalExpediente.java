package fundamentos.desafios.intensivo;

import java.util.Scanner;

public class HoraFinalExpediente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempoDeExpedienteTotal = converterHoraMinuto("08:48");

        System.out.println("Digite o horário de início do expediente: ");
        int inicioExpedienteMinutos = converterHoraMinuto(input.nextLine());

        System.out.println("Digite o horário de início de almoço: ");
        int inicioAlmocoMinutos = converterHoraMinuto(input.nextLine());

        System.out.println("Digite o horário de fim de almoço: ");
        int fimAlmocoMinutos = converterHoraMinuto(input.nextLine());

        input.close();

        int tempoRestante = calculaTempoRestante(
                tempoDeExpedienteTotal, inicioExpedienteMinutos, inicioAlmocoMinutos, fimAlmocoMinutos
        );

        System.out.println("O tempo de expediente restante é de: " + tempoRestante + " minutos");
    }

    private static int converterHoraMinuto(String hora) {
        String[] horaMinuto = hora.split(":");
        int conversionHour = Integer.parseInt(horaMinuto[0]) * 60;
        int conversionMinutes = (int) (Integer.parseInt(horaMinuto[1]) * 0.60);

        return conversionHour + conversionMinutes;
    }

    private static int calculaTempoRestante(int tempoTotal, int inicioExpediente, int inicioAlmoco, int fimAlmoco) {
        int periodoAlmoco = fimAlmoco - inicioAlmoco;

        if(periodoAlmoco > 60) {
            periodoAlmoco = periodoAlmoco - 60;
            return (periodoAlmoco + tempoTotal) - (inicioAlmoco - inicioExpediente) ;
        }

        return tempoTotal - (inicioAlmoco - inicioExpediente);
    }




}
