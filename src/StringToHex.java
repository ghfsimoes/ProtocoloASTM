import java.util.Scanner;

public class StringToHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dados = null;
		boolean existeDados = false;
		
		if (sc.hasNextLine()) {
			existeDados = true;
			dados += sc.nextLine();
		}
		
		String retorno = convertStringToHex(dados);
		System.out.println("Existe dados? "+ existeDados);
		System.out.println("\nString convertida: \n" + dados + "\n Valor em Hexadecimal: \n" + retorno);

	}
	
	public static String convertStringToHex (String str) {
		StringBuilder sb = new StringBuilder();
		
		char[] vChar = str.toCharArray();
		
		for (char c : vChar) {
			String charToHex = Integer.toHexString(c);
			 sb.append(charToHex);
		}

		return sb.toString();

	}
}
