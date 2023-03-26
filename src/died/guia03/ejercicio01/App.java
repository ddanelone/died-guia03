package died.guia03.ejercicio01;

public class App {
    public static void main(String[] args) {
        // 1. Crear el punto P1(1,1)
        Punto P1 = new Punto(1, 1);

        // 2. Crear el punto P2(2,2).
        Punto P2 = new Punto(2, 2);

        // 3. Crear la recta R1 con los puntos P1 y P2.
        Recta R1 = new Recta(P1, P2);

        // 4. Mostrar por pantalla la pendiente de la recta R1.
        System.out.println("La pendiente de la recta R1 es: " + R1.pendiente());

        // 5. Crear el punto P3(3,3).
        Punto P3 = new Punto(3, 3);

        // 6. Crear la recta R2 con los puntos P2 y P3.
        Recta R2 = new Recta(P2, P1);

        // 7. Mostrar por pantalla (true o false) si R1 y R2 representan la misma recta.
        System.out.println("¿R1 y R2 representan la misma recta? " + R1.equals(R2));
    }
}
