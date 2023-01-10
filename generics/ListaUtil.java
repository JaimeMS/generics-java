package generics;

import java.util.List;

public class ListaUtil {

	//List<?> = lista de qualquer coisa
	public static Object getUtil1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	/* Recebe uma lista de um tipo <T> e retorna o últmio elemento 
	 * 
	 * PARA CRIA O MÉTODO GENÉRICO É NECESSÁRIO SOLICITAR O TIPO <T>
	 * O TIPO DE RETORNO T
	 */
	public static <T> T getUtil2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
	
}
