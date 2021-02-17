package programasPrincipais;

import java.util.Scanner;

import figuraGeometrica.Losango;
import figuraGeometrica.LosangoException;

public class GeradorDesenhoLosango {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de linhas: ");
		int quantidadeLinhas = sc.nextInt();
		
		try {
			Losango losango = new Losango(quantidadeLinhas);
			losango.exibeLosango();
		} catch (LosangoException e) {
			System.out.print(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
