import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registros {

	private int seq = 0;
	private DateFormat df = new SimpleDateFormat("yyyyMMdHHmmss");

	public String geraRegistroH(String modelo, String delimitadores, String idProcessamento, String versaoASTM, String checkSum) {
		return this.geraRegistroH(modelo, delimitadores, idProcessamento, versaoASTM, checkSum, new Date());
	}

	public String geraRegistroH(String modelo, String delimitadores, String idProcessamento, String versaoASTM, String checkSum, Date data) {
		//<STX> 1H|\^&|||ABX|||||||P|1394-97|20031202102713 <CR> <ETX> 06 <CR> <LF>
		seq++;

		String registroH = ""
				+ CaracteresControle.STX
				+ seq
				+ "H"
				+ "|"
				+ delimitadores
				+"|||"
				+ modelo
				+ "|||||||"
				+ idProcessamento
				+ "|"
				+ versaoASTM
				+ "|"
				+ df.format(new Date())
				+ CaracteresControle.CR
				+ CaracteresControle.ETX
				+ checkSum
				+ CaracteresControle.CR
				+ CaracteresControle.LF;

		return registroH;
	}

	public void geraRegistroP() {

	}

	public void geraRegistroO() {

	}

	public void geraRegistroL() {

	}
}
