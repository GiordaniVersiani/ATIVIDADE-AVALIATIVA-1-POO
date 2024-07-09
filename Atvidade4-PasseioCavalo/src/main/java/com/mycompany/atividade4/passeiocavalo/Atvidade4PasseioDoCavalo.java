package com.mycompany.atividade4.passeiocavalo;
        

public class Atvidade4PasseioDoCavalo {
    public static void main(String[] args) {
     
        Tabuleiro tabuleiro = new Tabuleiro();
        
        int LinhaInicio =0;
        int ColunaInicio =0;
        
        tabuleiro.moverCavalo(LinhaInicio, ColunaInicio);
        tabuleiro.imprimirTabuleiro();
        tabuleiro.imprimirQuantidadeMov();
    }
}