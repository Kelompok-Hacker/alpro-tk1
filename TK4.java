public class TK4 {
	public static void main(String[] args) {
		int a = 35;
		int b = 8;
		int c = 19;
		System.out.println(a + b * c);

		boolean True = true;
		boolean False = false;
		//Konjungsi
		System.out.print("True ^ True : ") ;
		System.out.println(True && True) ;
		System.out.print("True ^ False : ") ;
		System.out.println(True && False) ;
		System.out.print("False ^ True : ") ;
		System.out.println(False && True) ;
		System.out.print("False ^ False : ") ;
		System.out.println(False && False) ;
		System.out.println();
		//Disjungsi
		System.out.print("True V True : ") ;
		System.out.println(True || True) ;
		System.out.print("True V False : ") ;
		System.out.println(True || False) ;
		System.out.print("False V True : ") ;
		System.out.println(False || True) ;
		System.out.print("False V False : ") ;
		System.out.println(False || False) ;
		System.out.println();

		System.out.println("Hello " + "World") ;

		int x = 7;
		int y = 8;
		int z = 9;
		System.out.println("Nilai x = " + x);
		System.out.println("Nilai y = " + y);
		System.out.print("x + y = ");
		System.out.println(x + y);
		System.out.print("x - y = ");
		System.out.println(x - y);
		System.out.print("x * y = ");
		System.out.println(x * y);
		System.out.print("x / y = ");
		System.out.println(x / y);
		System.out.print("x mod y = ");
		System.out.println(x % y);
		System.out.print("x mod z = ");
		System.out.println(x % z);

		int d = 6, e = 4;
		d= -d; e = +e;
		System.out.println("Nilai d = " + d);
		System.out.println("Nilai e = " + e);
		System.out.print("-d + e = ");
		System.out.println(-d + e);
		System.out.print("e - d = ");
		System.out.println(e - d);
		e = ++e;
		System.out.println("Nilai e Increment = " + e);
		e = --e; e = --e; e = --e;
		System.out.println("Nilai e Decrement = " + e);	

		int f = 40;
		System.out.println(f);
		f += 4; // f = f + 3
		System.out.println(f);
		f -= 4; // f = f - 3
		System.out.println(x);
		f *= 4; // f = f * 3
		System.out.println(f);
		f /= 4; // f = f / 3
		System.out.println(f);
		f %= 4; // f = f % 3
		System.out.println(f);

		int g = 8, h = 7;
		System.out.println(g);
		System.out.println(h);
		System.out.println(g=h);
		System.out.println(g==h);
		System.out.println();
		System.out.println(8 < 9);
		System.out.println(8 > 9);
		System.out.println(9 <= 2);
		System.out.println(10 >= 7);
		System.out.println(10 != 7);
		System.out.println(10 == 7);
	
		int j = 8;
		System.out.println("~ True : " + !True);
		System.out.println("~ False : " + !False);
		System.out.println();
		System.out.println(j > 2 && j < 9);
		System.out.println(j > 2 || j < 5);
		System.out.println(!(j > 2 && j < 9));
		
		int nilai = 80;
		String result;
		result = (nilai > 70) ? "Lulus" : "Remedial";
		System.out.println(result);

	}
}