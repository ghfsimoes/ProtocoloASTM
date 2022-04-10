import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Registros r = new Registros();
		
		//<STX> 1H|\^&|||ABX|||||||P|1394-97|20031202102713 <CR> <ETX> 06 <CR> <LF>
		System.out.println(r.geraRegistroH("ABX","\\^&", "P", "1394-97", "06"));
		System.out.println(r.geraRegistroH("ABX","\\^&", "P", "1394-97", "06"));
		System.out.println(r.geraRegistroH("ABX","\\^&", "P", "1394-97", "06", new Date()));
	}

}
