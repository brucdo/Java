package exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o exercicio desejado?");
        int exercicio = teclado.nextInt();
        DecimalFormat df = new DecimalFormat("###,###.###");
        int i=0, j=0;
        
        int[] vetA= new int[5];
        double[] vetB= new double[vetA.length];
        int[] vet = new int[5];
        
        //Lista Vetores: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
        //Lista Matrizes: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20
        switch(exercicio){
            case 1:
                //Exercicio 04
                System.out.println("Exercicio Vetor B é o quadrado de vetor A:");
                for(i=0;i<vetA.length;i++){
                    System.out.print("Entre com a posicao "+i+": ");
                    vetA[i]=teclado.nextInt();
                    vetB[i]= Math.sqrt(vetA[i]);
                }
                for(j=0;j<vetB.length;j++){
                    System.out.print(df.format(vetB[j])+" | ");
                }
                break;
            case 2:
                //Exercicio 11
                System.out.println("Quantidade de elementos que são pares");
                int qtdPares=0;
                for(i=0;i<vet.length;i++){
                    System.out.print("Entre com a posicao "+i+": ");
                    vet[i]=teclado.nextInt();
                    if(vet[i]%2==0){
                        qtdPares++;
                    }
                }
                for(j=0;j<vet.length;j++){
                    System.out.print(df.format(vet[j])+" | ");
                }
                System.out.println("\nA quant numeros pares nesse vetor é "+qtdPares);
                break;
            case 3:
                //Exercicio 14
                System.out.println("Escreva a média aritmetica simples dos elementos impares do vetor");
                int qtdImpares=0;
                int somaImpares=0;
                int media;
                for(i=0;i<vet.length;i++){
                    System.out.print("Entre com a posicao "+i+": ");
                    vet[i]=teclado.nextInt();
                    if(vet[i]%2==1){
                        somaImpares+=vet[i];
                        qtdImpares++;
                    }
                }
                for(j=0;j<vet.length;j++){
                    System.out.print(df.format(vet[j])+" | ");
                }
                media=somaImpares/qtdImpares;
                System.out.println("\nA soma dos numeros impares é "+media);
                break;
            case 4:
                //Ex 01 - lista matrizes
                System.out.println("Preencher matriz 4x4 e determinar o maior numero");
                int [][] numAleatorios = new int[4][4];
                Random numRandom = new Random();
                int maiorNumero=0;
                for(i=0;i<numAleatorios.length;i++){
                    for(j=0;j<numAleatorios[i].length;j++){
                        numAleatorios[i][j]=numRandom.nextInt(100);
                        if(numAleatorios[i][j]>maiorNumero){
                            maiorNumero=numAleatorios[i][j];
                        }
                    }
                }
                for(i=0;i<numAleatorios.length;i++){
                    for(j=0;j<numAleatorios[i].length;j++){
                        System.out.print(numAleatorios[i][j]+" | ");
                    }
                    System.out.println("");
                }
                System.out.println("Maior numero é "+maiorNumero);
                break;
            case 5:
                //Ex 4 - Agenda Pessoal
                System.out.println("Agenda pessoal em formato de Matriz - Consultar ou Alterar Compromisso");
                String[][] agenda = new String[31][24];//linha 30dias, coluna 24h
                int dia = 0,hora=0,n, acao;
                boolean encerrar = false, diaValido=false,horaValida=false;
                
                while(!encerrar){
                    diaValido=false;
                    horaValida=false;
                    while(!diaValido){
                        System.out.println("Qual dia (1 a 31)?");
                        dia=teclado.nextInt()-1;
                        if(dia>=0&&dia<31){
                            diaValido=true;
                        }else{
                            System.out.println("Dia Invalido. Tente Novamente.");
                        }
                    }
                    while(!horaValida){
                        System.out.println("Qual hora (0 a 23) ?");
                        hora=teclado.nextInt();
                        if(hora>=0&&hora<24){
                            horaValida=true;
                        }else{
                            System.out.println("Hora Invalido. Tente Novamente.");
                        }
                    }
                    System.out.println("Você deseja consultar (1) ou alterar (2)?");
                    acao=teclado.nextInt();
                    switch(acao){
                        case 1:
                            System.out.println("1 - Você optou por consultar:");
                            System.out.println("Compromisso: "+agenda[dia][hora]);
                            break;
                        case 2:
                            System.out.println("2 - Você optou por alterar. Insira o compromisso: ");
                            agenda[dia][hora]=teclado.next();
                            break;
                        default:
                            System.out.println("Opção invalida. ");
                            break;
                    }
                    System.out.println("Deseja encerrar? 1 - Sim");
                    n=teclado.nextInt();
                    if(n==1){
                        encerrar = true;
                    }   
                }
                break;        
            default:
                System.out.println("Opção Invalida");
                break;
        }   
    }
}
