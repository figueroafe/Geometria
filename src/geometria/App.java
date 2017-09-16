package geometria;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Punto p1 = new Punto(1, 3);
		Punto p2 = new Punto(3, 1);
		Punto p4 = new Punto(2, 5);
		Punto p6 = new Punto(4, 2);
		Punto p0 = new Punto(0, 0);

		Rectangulo rec1 = new Rectangulo(p1, p2, p0);
		Rectangulo rec2 = new Rectangulo(p4, p6, p0);

		System.out.println(rec2.IntersectaCuadrado(rec1));

	}

}
