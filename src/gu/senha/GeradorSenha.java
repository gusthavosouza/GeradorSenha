/*
 * 
 */
@autor Gustavo de Souza
package gu.senha;

import java.util.Random;

public class GeradorSenha {

	private static final char[] ALL = new char[62];
	private static final Random RAN = new Random();

	static {
		for (int i = 48, j = 0; i < 123; i++) {
			if (Character.isLetterOrDigit(i)) {
				ALL[j] = (char) i;
				j++;
			}
		}
	}

	public static String getGeradorSenha(final int tamanho) {
		final char[] resultado = new char[tamanho];
		for (int i = 0; i < tamanho; i++) {
			resultado[i] = ALL[RAN.nextInt(ALL.length)];
		}
		return new String(resultado);
	}

	public static String getGeradorSenha() {

		return getGeradorSenha();
	}

	public GeradorSenha() {

	}

}
