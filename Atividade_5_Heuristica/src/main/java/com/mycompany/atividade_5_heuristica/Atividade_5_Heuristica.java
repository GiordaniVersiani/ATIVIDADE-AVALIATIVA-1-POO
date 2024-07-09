/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5_heuristica;

/**
 *
 * @author Giordani Versiani
 */
public class Atividade_5_Heuristica {

    public static void main(String[] args) {
        int passeiosCompletos = 0;
        
        for (int linhaInicio = 0; linhaInicio < 8; linhaInicio++) {
            for (int coluInicio = 0; coluInicio < 8; coluInicio++) {
                Tabuleiro tabuleiro = new Tabuleiro();
                
                System.out.println("\nIniciando passeio do cavalo na posição (" + linhaInicio + ", " + coluInicio + ")");
                boolean completo = tabuleiro.moverCavalo(linhaInicio, coluInicio);
                tabuleiro.imprimirTabuleiro();
                tabuleiro.imprimirQuantidadeMov();
                
                if (completo) {
                    passeiosCompletos++;
                }
            }
        }
        
        System.out.println("\nNúmero total de passeios completos: " + passeiosCompletos);
    }
}