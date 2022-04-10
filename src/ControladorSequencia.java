
public class ControladorSequencia {
	public static String iniciaContadorSequencia() {
		int sequencia = 1;
		return Integer.toString(sequencia);
	}
	
	public static String updateContadorSequencia(int sequenciaContadorAtual) {
		int sequenciaContadorAlterada = sequenciaContadorAtual + 1;
		return Integer.toString(sequenciaContadorAlterada);
	}
}
