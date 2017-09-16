package geometria;

public class Circulo extends Figura {
	private double radio;

	public Circulo(Punto p1, Punto p2, Punto centro, double radio) {
		super(p1, p2, centro);
		this.radio = radio;
	}

	public boolean continen(Punto punto) {
		return super.getCentro().distanciaHasta(punto) <= this.radio;
	}

	public boolean intersectaCon(Circulo that) {
		return super.getCentro().distanciaHasta(that.getCentro()) <= (this.radio + that.radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
