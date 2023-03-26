package died.guia03.ejercicio01;

public class Recta {
    private Punto p1;
    private Punto p2;
    
    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Recta() {
        this(new Punto(0, 0), new Punto(1, 1));
    }
    
    public float pendiente() {
        float x1 = p1.getX();
        float y1 = p1.getY();
        float x2 = p2.getX();
        float y2 = p2.getY();
        
        if (x2 - x1 == 0) {
            return Float.POSITIVE_INFINITY;
        }
        
        return (y2 - y1) / (x2 - x1);
    }
    
    public boolean paralelas(Recta otraRecta) {
        return this.pendiente() == otraRecta.pendiente();
    }
    
    public boolean equals(Object otraRecta) {
        if (otraRecta instanceof Recta) {
            Recta otra = (Recta) otraRecta;
            
            float m1 = this.pendiente();
            float m2 = otra.pendiente();
            
            if (m1 == Float.POSITIVE_INFINITY && m2 == Float.POSITIVE_INFINITY) {
                return this.p1.getX() == otra.p1.getX();
            }
            
            Punto p3 = new Punto(0, 0);
            Recta r3 = new Recta(this.p1, otra.p1);
            return r3.pendiente() == m1 && r3.pendiente() == m2;
        }
        
        return false;
    }
}
