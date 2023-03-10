package jogo.xadrez;

import Xadrez.PecaXadrez;


public class UI {
    
    public static void mostrarTabuleiro(PecaXadrez[][] pecas){
        for(int i=0; i<pecas.length; i++){
            System.out.print((8 - i) + " ");
            for(int j=0; j<pecas.length; j++){
                mostrarPeca(pecas[i][j]);
            }
            System.out.println();
            }
        System.out.println("  A B C D E F G H");
    }
    
    private static void mostrarPeca(PecaXadrez peca){
        if(peca == null){
            System.out.print("-");
        }
        else{
            System.out.print(peca);
        }
        System.out.print(" ");
    }
    
}
