package generics;
/* 
 * CRIAÇÃO DE UMA CLASSE DE TIPO INDEFINIDO
 */
public class Caixa<T> {

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}

}
