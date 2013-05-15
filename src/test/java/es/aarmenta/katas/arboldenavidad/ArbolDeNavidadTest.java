/**
 * 
 */
package es.aarmenta.katas.arboldenavidad;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author angelarmentamartinez
 * 
 */
public class ArbolDeNavidadTest {

	@Test
	public void testAltura() {
		// Altura aleatoria entre 1 y 50
		int altura = (int) Math.floor(Math.random() * 50 + 1);
		String arbol = ArbolDeNavidad.pintarArbolDeNavidad(altura);
		int alturaResultado = (arbol.split("\n")).length;

		assertEquals(altura, alturaResultado);
	}

	@Test
	public void testEstrellasEnNivel() {
		// Altura aleatoria entre 1 y 50
		int altura = (int) Math.floor(Math.random() * 50 + 1);
		String arbol = ArbolDeNavidad.pintarArbolDeNavidad(altura);

		// Elegimos un nivel aleatorio para comprobar
		int nivel = (int) Math.floor(Math.random() * 50 + 1);
		int calculoEstrellasNivel = ArbolDeNavidad.estrellasEnNivel(nivel, altura);

		String nivelesArbol[] = arbol.split("\n"); // que \n delimite el final de linea va a ser comœn en Unix y Windows
		String nivelAComprobar = nivelesArbol[nivel - 1];
		int espaciosEnNivelResultado = caracterEnCadena('*', nivelAComprobar);

		assertEquals(calculoEstrellasNivel, espaciosEnNivelResultado);
	}

	public void testEspaciosEnNivel() {
		// Altura aleatoria entre 1 y 50
		int altura = (int) Math.floor(Math.random() * 50 + 1);
		String arbol = ArbolDeNavidad.pintarArbolDeNavidad(altura);

		// Elegimos un nivel aleatorio para comprobar
		int nivel = (int) Math.floor(Math.random() * 50 + 1);
		int calculoEspaciosNivel = ArbolDeNavidad.espaciosEnNivel(nivel, altura);

		String nivelesArbol[] = arbol.split("\n"); // que \n delimite el final de linea va a ser comœn en Unix y Windows
		String nivelAComprobar = nivelesArbol[nivel - 1];
		int espaciosEnNivelResultado = caracterEnCadena(' ', nivelAComprobar);

		assertEquals(calculoEspaciosNivel, espaciosEnNivelResultado);
	}

	private int caracterEnCadena(char caracter, String cadena) {
		int resultado = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				resultado++;
			}
		}
		return resultado;
	}
	
}
