package negocio;

public class Diretor extends Funcionario {
	private float vlrAdicional;

	
	@Override
	public void exibir() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format(
				"%s: %s\n" +
						"Adicional: %.2f\n",
						"M".equals(this.getSexo()) ? "Diretor" : "Diretora",
								super.toString(),
								this.getVlrAdicional()
				);


	}
	public float getVlrAdicional() {
		return vlrAdicional;
	}

	public void setVlrAdicional(float vlrAdicional) {
		this.vlrAdicional = vlrAdicional;
	}
}

