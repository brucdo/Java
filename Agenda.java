package agenda;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        System.out.println("Agenda pessoal em formato de Matriz(com mes, dia e hora) - Consultar ou Alterar Compromisso");
        Scanner teclado = new Scanner(System.in);
        String[][][] agenda = new String[12][31][24];//linha 30dias, coluna 24h
        int mes=0, dia=0, hora=0, n, acao;
        boolean encerrar = false, mesValido = false, diaValido = false, horaValida = false;
        while (!encerrar) {
            mesValido=false;
            diaValido=false;
            horaValida=false;
            while (!mesValido) {
                System.out.println("Qual o mês (1 a 12) ?");
                mes = teclado.nextInt() - 1;
                if (mes >= 0 && mes < 12) {
                    mesValido = true;
                }else{
                    System.out.println("Mês Invalido. Tente Novamente.");
                }
            }
            while (!diaValido) {
                System.out.println("Qual dia (1 a 31) ?");
                dia = teclado.nextInt() - 1;
                if (dia >= 0 && dia < 31) {
                    diaValido = true;
                }else{
                    System.out.println("Dia Invalido. Tente Novamente.");
                }
            }
            while (!horaValida) {
                System.out.println("Qual hora (0 a 23) ?");
                hora = teclado.nextInt();
                if (hora >= 0 && hora < 24) {
                    horaValida = true;
                }else{
                    System.out.println("Hora Invalido. Tente Novamente.");
                }
            }
            System.out.println("Você deseja consultar (1) ou alterar (2)?");
            acao = teclado.nextInt();
            switch(acao) {
                case 1:
                    System.out.println("1 - Você optou por consultar:");
                    System.out.println("Compromisso: " + agenda[mes][dia][hora]);
                    break;
                case 2:
                    System.out.println("2 - Você optou por alterar. Insira o compromisso: ");
                    agenda[mes][dia][hora] = teclado.next();
                    break;
                default:
                    System.out.println("Opção invalida. ");
                    break;
            }
            System.out.println("Deseja encerrar? 1 - Sim");
            n = teclado.nextInt();
            if (n == 1) {
                encerrar = true;
            }
        }
    }
}
