package basico;

public class TipoBasico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="Renzo";
//		char c='Re';
		byte b=127;
		short sh=b;
		sh++;
		System.out.println(sh);
		b=(byte) sh;
		System.out.println(b);
		System.out.println(Short.MAX_VALUE);

	}

}
