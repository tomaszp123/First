package src;

/*
	Created by Tomasz Pajewski on 2020-01-28.
	Java some variables examples
*/
public class VarTest {
	byte b = 127; // -128 to 127
	short s = 32747; // -32768 to 32767
	int i = -21474; // -2147483648 to 214748364
	long l = 24312344; // -9223372036854776808 to 9223372036854776807
	float f = 3.44444f; // -3,4*10^38 to 3,4*10^38
	double d = 3.52452435; // -1.8*10^108 to 1.8*10^108
	char c = 'a'; // litery
	String string = "To jest jakiś text";

	public static void main(String[] args) {
		int wynik;
		int l1 = 56;
		int l2 = 16;
		byte b1 = 127;
		wynik = l1 + l2;
		System.out.println("Wynik = " + wynik);
		wynik = l1 - l2;
		System.out.println("Wynik = " + wynik);
		wynik = l1 * l2;
		System.out.println("Wynik = " + wynik);
		wynik = l1 / l2;
		System.out.println("Wynik = " + wynik);
		wynik = l1 % l2;
		System.out.println("Wynik = " + wynik);
		wynik = 0;
		wynik++;
		wynik++;
		wynik++;
		System.out.println("Wynik = " + wynik);
		wynik--;
		System.out.println("Wynik = " + wynik);
		System.out.println("Przed inc " + b1);
		b1++;
		System.out.println("Po inc " + b1);
	}
}