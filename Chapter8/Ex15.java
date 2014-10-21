package polymorphism;
/**
 * polyconstructor for polymorphism
 * Chapter 8 in Thinking in Java
 * Practice 15
 */

class Glyph {
	void draw() { Prt.prt("Glyph.draw()"); }
	Glyph() {
		Prt.prt("Glyph() before draw()");
		draw();
		Prt.prt("Glyph() after draw()"); 
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		Prt.prt("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		Prt.prt("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int length = 2;
	private int width = 4;
	RectangularGlyph(int l, int w) {
		length = l;
		width = w;
		Prt.prt("RectangularGlyph.RectangularGlyph(), length = " 
			+ length + ", width = " + width);
	}
	void draw() {
		Prt.prt("RectangularGlyph.draw(), length = " + length 
			+ ", width = " + width);
	}
}

public class Ex15 {
	public static void main(String[] args) {
		new RoundGlyph(5);
		Prt.prt("----Cutting Line----");
		new RectangularGlyph(3, 6);
	}
}
