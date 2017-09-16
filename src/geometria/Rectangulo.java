package geometria;

public class Rectangulo extends Figura {

	public boolean IntersectaConCuadrado(Rectangulo rec) {
		return (rec.getP1().getX() < super.getP1().getX() && rec.getP2().getX() < super
				.getP2().getX())
				&& (rec.getP1().getY() < super.getP1().getY() && rec.getP1()
						.getY() < super.getP1().getY());

	}

	public boolean IntersectaConCirculo(Circulo cir) {
		double limxDer = cir.getCentro().getX() + cir.getRadio();
		double limxIzq = cir.getCentro().getX() - cir.getRadio();
		double limySup = cir.getCentro().getY() + cir.getRadio();
		double limyInf = cir.getCentro().getY() - cir.getRadio();

		return (super.getP1().getX() < limxDer && super.getP1().getX() > limxIzq)
				&& (super.getP1().getY() < limySup && super.getP1().getY() > limyInf);

	}

	public Rectangulo(Punto p1, Punto p2, Punto centro) {
		super(p1, p2, centro);
	}

}
