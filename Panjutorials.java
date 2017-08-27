
public class Panjutorials {

	public static void main(String[] args) {
		//Variablendeklaration
		int wert1 = 30;
		String string1 ="25";
		int wert2 = Integer.parseInt(string1);
		String string2 = String.valueOf(wert1);
		
		int var1 = 3;
		int var2 = 2;
		double var3= (double) var1 / (double) var2;
		double var4 = 3;
		double var5 = 2;
		double var6=var4/var5;
		
		//Ausgabe
		System.out.println("Der Wert unserer Variable ist " + wert1 + ".");
		System.out.println("Der Wert aus dem String ist " + wert2 + ".");
		System.out.println("Der Wert aus der Variable ist auch als String " + string2 + ".");
		System.out.println("Integer var1 geteilt durch Integer var2 als double ist " + var3);
		System.out.println("Double var1 geteilt durch double var2 als Doble ist " + var6);
	}

}
