package Xadrez;

import Tabuleiro.Peca;
import Tabuleiro.Tabuleiro;


public class PecaXadrez extends Peca{
    
    private Cor cor;

    public PecaXadrez(Cor cor, Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
    
        
}
