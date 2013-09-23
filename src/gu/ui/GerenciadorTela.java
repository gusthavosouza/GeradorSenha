@autor Gustavo de Souza
package gu.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
import gu.senha.*;

public class GerenciadorTela extends JPanel {

	private JTextField tfSenha;
	private JButton bGerar;

	private JPanel panel;
	private JPanel painel;
	private JLabel lSenha;

	public Object o = new GeradorSenha();

	private JLabel lmSenha;
	private JTextField tfmSenha;

	public String criarSenha(int i) {
		GeradorSenha gera = new GeradorSenha();

		return gera.getGeradorSenha(i);
	}

	public GerenciadorTela() {
		this.setLayout(new BorderLayout());
		panel = montaBotao();

		painel = montaSenha();

		this.add(panel, BorderLayout.SOUTH);
		this.add(painel, BorderLayout.CENTER);

	}

	JPanel montaBotao() {

		JPanel panel = new JPanel();

		bGerar = new JButton("Gerar Senha");

		bGerar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(tfSenha.getText());

				o = criarSenha(i);
				tfmSenha.setText((String) o);

			}
		});

		panel.add(bGerar);

		return panel;
	}

	JPanel montaSenha() {
		JPanel mSenha = new JPanel();
		GridLayout layo = new GridLayout(4, 2);
		mSenha.setLayout(layo);
		lSenha = new JLabel("Digite o tamanho da senha ");
		lmSenha = new JLabel("Senha:");
		tfmSenha = new JTextField();

		tfSenha = new JTextField();

		mSenha.add(lSenha);
		mSenha.add(tfSenha);
		mSenha.add(lmSenha);
		mSenha.add(tfmSenha);
		return mSenha;
	}

}
