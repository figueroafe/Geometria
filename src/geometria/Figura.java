package geometria;

import geometria.Punto;

public abstract class Figura {

	private Punto p1;
	private Punto p2;
	private Punto centro;

	public Figura(Punto p1, Punto p2, Punto centro) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.centro = centro;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

}
