/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4.passeiocavalo;

/**
 *
 * @author Giordani Versiani
 */
public class Tabuleiro{
 
    private final int[][] tabuleiro;
    private final int tabuleiroTam = 8;
    private final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2}; 
    private final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};     
    int quantidadeMov=0;
    
    public Tabuleiro(){     
        tabuleiro = new int [8][8];  
    }
    
    
    public void moverCavalo(int linhaAtual, int colunaAtual) {
         int proximaContagem = 1; 
         tabuleiro[linhaAtual][colunaAtual] = proximaContagem; 
    
         if (!moverCavaloAuxiliar(linhaAtual, colunaAtual, proximaContagem + 1)) {
             System.out.println("Não foi possível completar o passeio do cavalo.");
    }
    
}

    private boolean moverCavaloAuxiliar(int linhaAtual, int colunaAtual, int proximaContagem) {
         if (proximaContagem == tabuleiroTam * tabuleiroTam) {
         return true;
    }
    
         for (int i = 0; i < 8; i++) {
             int proximaLinha = linhaAtual + vertical[i];
             int proximaColuna = colunaAtual + horizontal[i];
        
         if (movimentoValido(proximaLinha, proximaColuna)) {
            tabuleiro [proximaLinha] [proximaColuna] = proximaContagem;
            quantidadeMov ++;
            
              if (moverCavaloAuxiliar (proximaLinha, proximaColuna, proximaContagem + 1)) {
                return true;
                
              } else {
                    tabuleiro [proximaLinha][proximaColuna] = 0;
                    quantidadeMov --;}
              
        }
         
    }
    
    return false; 
}

    private boolean movimentoValido(int linha, int coluna) {
        
        return linha >= 0 && linha < tabuleiroTam && coluna >= 0 && coluna < tabuleiroTam && tabuleiro[linha][coluna] == 0;
        
           }
    
    
    public void imprimirTabuleiro(){
    
        for (int i = 0; i < tabuleiroTam; i++) {
            for (int j = 0; j < tabuleiroTam; j++) {
                System.out.printf("%3d ", tabuleiro[i][j]);
            }
            System.out.println();
        }
     } 
    
    public void imprimirQuantidadeMov(){
        
        System.out.printf("\nQuantidade de movimentos: "+quantidadeMov);
    }
    
}
