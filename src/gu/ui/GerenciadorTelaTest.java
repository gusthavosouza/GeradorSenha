package gu.ui;

import gu.senha.GeradorSenha;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GerenciadorTelaTest extends JFrame {

	public GerenciadorTelaTest (String titulo) {
		super(titulo);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			this.getContentPane().add(new GerenciadorTela());
			super.setSize(200, 200);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		GerenciadorTelaTest gerarTela = new GerenciadorTelaTest("Gerenciador de Senhas");
		gerarTela.setVisible(true);
		
	}

}
