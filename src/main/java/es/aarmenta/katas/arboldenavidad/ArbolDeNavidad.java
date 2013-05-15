package es.aarmenta.katas.arboldenavidad;

public class ArbolDeNavidad {
	
	public static String pintarArbolDeNavidad(int altura) {
		StringBuffer arbol = new StringBuffer();
		String saltoLinea = System.getProperty("line.separator");
		
		for (int i = 0; i < altura; i++) {
			arbol.append(pintaCaracterNVeces(' ', espaciosEnNivel(i+1, altura)));
			arbol.append(pintaCaracterNVeces('*', estrellasEnNivel(i+1, altura)));
			arbol.append(saltoLinea);
		}
		
		System.out.println(arbol.toString());
		
		return arbol.toString();
	}

	protected static int estrellasEnNivel(int nivel, int alturaArbol) {
		return ((alturaArbol - espaciosEnNivel(nivel, alturaArbol)) * 2) - 1;
	}
	
	protected static int espaciosEnNivel(int nivel, int alturaArbol) {
		return alturaArbol - nivel;
	}
	
	private static String pintaCaracterNVeces(char caracter, int veces) {
		StringBuffer resultado = new StringBuffer();
		for (int i = 0; i < veces; i++) {
			resultado.append(caracter);
		}
		
		return resultado.toString();
	}
}
