package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class Partida {

	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro(8,8);
		confInicial();
	}
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i<tabuleiro.getLinhas(); i++) {
			for (int j = 0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void confInicial() {
		tabuleiro.localPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
		tabuleiro.localPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
		tabuleiro.localPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(7,4));
	}
}
