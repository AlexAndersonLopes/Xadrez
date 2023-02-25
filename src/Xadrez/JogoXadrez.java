package Xadrez;

import Tabuleiro.Posicao;
import Tabuleiro.Tabuleiro;
import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;


public class JogoXadrez {
    
    private Tabuleiro tabuleiro;

    public JogoXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        playGame();
    }
    
    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i<tabuleiro.getLinhas(); i++){
            for(int j=0; j<tabuleiro.getColunas(); j++){
                matriz[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return matriz;
    }
    
    
    private void playGame(){
        tabuleiro.posicaoPeca(new Torre(Cor.BRANCO, tabuleiro), new Posicao(0, 0));
        tabuleiro.posicaoPeca(new Rei(Cor.PRETO, tabuleiro), new Posicao(0, 4));
        tabuleiro.posicaoPeca(new Rei(Cor.BRANCO, tabuleiro), new Posicao(7, 4));
        
    }
    
}
