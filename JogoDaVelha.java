package jogo.da.velha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        System.out.println("***JOGO DA VELHA***");
        System.out.println("Jogador 1 = X e Jogador 2 = O ");
        
        Scanner teclado = new Scanner(System.in);
        String[][] jogoVelha = new String[3][3];
        boolean ganhou = false;
        int jogadas = 0;
        String sinal;
        int linha=0, coluna=0;
        
        
        while(!ganhou){
            System.out.println("Proxima Jogada:");
            if(jogadas%2==0){
                System.out.println("Jorgador 1");
                sinal = "X";
            }else{
                System.out.println("Jogador 2");
                sinal = "O";
            } 
            
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha (1, 2 ou 3):");
                linha=teclado.nextInt();
                if(linha>=1||linha<=3){
                    linhaValida=true;
                }else{
                    System.out.println("Linha Invalida, tente novamente.");
                }
            }
            
            boolean colunaValida = false;
            while(!colunaValida){
                System.out.println("Entre com a coluna (1, 2 ou 3):");
                coluna=teclado.nextInt();
                if(coluna>=1||coluna<=3){
                    colunaValida=true;
                }else{
                    System.out.println("Coluna Invalida, tente novamente");
                }
            }
            
            linha--;
            coluna--;
            if("X".equals(jogoVelha[linha][coluna])||"O".equals(jogoVelha[linha][coluna])){
                System.out.println("Posição ja Ocupada. Tente novamente.");
            }else{
                jogoVelha[linha][coluna]=sinal;
                jogadas++;
            }
            
            //imprimindo o tabuleiro
            System.out.println(" ");
            for(int i=0;i<jogoVelha.length;i++){
                for(int j=0;j<jogoVelha.length;j++ ){
                    System.out.print(jogoVelha[i][j]+" | ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            
            if(("X".equals(jogoVelha[0][0])&&"X".equals(jogoVelha[0][1])&&"X".equals(jogoVelha[0][2]))||
                    ("X".equals(jogoVelha[1][0])&&"X".equals(jogoVelha[1][1])&&"X".equals(jogoVelha[1][2]))||
                    ("X".equals(jogoVelha[2][0])&&"X".equals(jogoVelha[2][1])&&"X".equals(jogoVelha[2][2]))||
                    ("X".equals(jogoVelha[0][0])&&"X".equals(jogoVelha[1][0])&&"X".equals(jogoVelha[2][0]))||
                    ("X".equals(jogoVelha[0][1])&&"X".equals(jogoVelha[1][1])&&"X".equals(jogoVelha[2][1]))||
                    ("X".equals(jogoVelha[0][2])&&"X".equals(jogoVelha[1][2])&&"X".equals(jogoVelha[2][2]))||      
                    ("X".equals(jogoVelha[2][0])&&"X".equals(jogoVelha[1][1])&&"X".equals(jogoVelha[0][2]))||
                    ("X".equals(jogoVelha[0][0])&&"X".equals(jogoVelha[1][1])&&"X".equals(jogoVelha[2][2]))||
                    ("X".equals(jogoVelha[0][2])&&"X".equals(jogoVelha[1][1])&&"X".equals(jogoVelha[2][0]))
                    ){
                ganhou=true;
                System.out.println("Parabéns! Jogador 1 ganhou!!!");
            }else if(("O".equals(jogoVelha[0][0])&&"O".equals(jogoVelha[0][1])&&"O".equals(jogoVelha[0][2]))||
                    ("O".equals(jogoVelha[1][0])&&"O".equals(jogoVelha[1][1])&&"O".equals(jogoVelha[1][2]))||
                    ("O".equals(jogoVelha[2][0])&&"O".equals(jogoVelha[2][1])&&"O".equals(jogoVelha[2][2]))||
                    ("O".equals(jogoVelha[0][0])&&"O".equals(jogoVelha[1][0])&&"O".equals(jogoVelha[2][0]))||
                    ("O".equals(jogoVelha[0][1])&&"O".equals(jogoVelha[1][1])&&"O".equals(jogoVelha[2][1]))||
                    ("O".equals(jogoVelha[0][2])&&"O".equals(jogoVelha[1][2])&&"O".equals(jogoVelha[2][2]))||      
                    ("O".equals(jogoVelha[2][0])&&"O".equals(jogoVelha[1][1])&&"O".equals(jogoVelha[0][2]))||
                    ("O".equals(jogoVelha[0][0])&&"O".equals(jogoVelha[1][1])&&"O".equals(jogoVelha[2][2]))||
                    ("O".equals(jogoVelha[0][2])&&"O".equals(jogoVelha[1][1])&&"O".equals(jogoVelha[2][0]))
                    ){
                ganhou=true;
                System.out.println("Parabéns! Jogador 2 ganhou!!!");
            }else if(jogadas>9){
                System.out.println("Final do jogo! Não tem mais jogadas :)");
            }
        }
    }
}
