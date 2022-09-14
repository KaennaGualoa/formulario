package teste;

import org.junit.Test;

import metodos.MetodoPage;

public class Teste {
	MetodoPage metodo = new MetodoPage();

	@Test
	public void test() {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
	}
}
