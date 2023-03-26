package died.guia03.ejercicio01;

public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float nuevoValor) {
        x = nuevoValor;
    }

    public void setY(float nuevoValor) {
        y = nuevoValor;
    }

    public boolean equals(Object otroPunto) {
        if (otroPunto instanceof Punto) {
            Punto otro = (Punto) otroPunto;
            return x == otro.getX() && y == otro.getY();
        }
        return false;
    }
}
