package testes;

import negocio.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		
		String[] lista = {"computa��o", "engenharia de software", "letras"};
		
		Professor professor = new Professor();
		
		professor.setNome("tio manoel");
		professor.setLogin("tio.manoel");
		professor.setSenha("123456");
		professor.setSexo("M");
		professor.setUniversidade("Infnet");
		professor.setSalario(1000);
		professor.setCursos(lista);
		
		professor.exibir();
	}
}