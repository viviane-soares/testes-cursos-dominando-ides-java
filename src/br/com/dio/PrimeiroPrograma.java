package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Livros livro = new Livros();	
		Gato gato = new Gato();
	
		System.out.println("gato");
		System.out.println("livros");
		
	}}

class Livros {
	public String nome;
	public Integer numPaginas;
	
}