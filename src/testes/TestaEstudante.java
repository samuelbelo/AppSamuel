package testes;

import negocio.Estudante;

public class TestaEstudante {
	
	public static void main(String[] args) {
		
		String[] lista = {"portugu�s", "matem�tica", "estudos sociais", "ci�ncias"};
		
		Estudante estudante = new Estudante();
		
		estudante.setNome("joao da silva");
		estudante.setIdade(20);
		estudante.setMensalidade(1000);
		estudante.setLogin("joao.silva");
		estudante.setSenha("123456");
		estudante.setSexo("F");
		estudante.setMunicipio("Maric�");
		estudante.setDisciplinas(lista);
		
		estudante.exibir();
	}
}