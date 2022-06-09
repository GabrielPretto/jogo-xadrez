package xadrez;

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
	
	private void setarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.localPeca(peca, new PosicaoXadrez(coluna, linha).dePosicao());
	}
	
	private void confInicial() {
		setarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
        setarNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
        setarNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
        setarNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
        setarNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
        setarNovaPeca('d', 1, new Rei(tabuleiro, Cor.BRANCO));

        setarNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
        setarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
        setarNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
        setarNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
        setarNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
        setarNovaPeca('d', 8, new Rei(tabuleiro, Cor.PRETO));
	}
}
