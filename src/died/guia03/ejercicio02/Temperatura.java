package died.guia03.ejercicio02;

public class Temperatura {

    private double grados;
    private Escala escala;
    
    public enum Escala {
        CELCIUS, FAHRENHEIT
    }

    
    public Temperatura() {
        this.grados = 0;
        this.escala = Escala.CELCIUS;
    }
    
    public Temperatura(double grados, Escala escala) {
        this.grados = grados;
        this.escala = escala;
    }
    
    public String toString() {
        String simbolo = (escala == Escala.CELCIUS) ? "C°" : "F°";
        return grados + " " + simbolo;
    }
    public Escala getEscala() {
    	return this.escala;
    };
    public double getGrados() {
    	return this.grados;
    };
    
    public double asCelcius() {
        if (escala == Escala.CELCIUS) {
            return grados;
        } else {
            return (grados - 32) * 5 / 9;
        }
    }
    
    public double asFahrenheit() {
        if (escala == Escala.FAHRENHEIT) {
            return grados;
        } else {
            return (grados * 9 / 5) + 32;
        }
    }
    
    public void aumentar(Temperatura temperatura) {
        if (temperatura.grados <= 0) {
            throw new IllegalArgumentException("La temperatura debe ser mayor a 0");
        }
        double suma = this.asCelcius() + temperatura.asCelcius();
        this.grados = convertirACelsius(suma);
    }
    
    public void disminuir(Temperatura temperatura) {
        if (temperatura.grados <= 0) {
            throw new IllegalArgumentException("La temperatura debe ser mayor a 0");
        }
        double resta = this.asCelcius() - temperatura.asCelcius();
        this.grados = convertirACelsius(resta);
    }
    
    private double convertirACelsius(double grados) {
        if (escala == Escala.FAHRENHEIT) {
            return (grados - 32) * 5 / 9;
        } else {
            return grados;
        }
    }

    public int comparar(Temperatura otra) {
        double diferencia = this.getGrados() - otra.getGrados();
        if (Math.abs(diferencia) < 0.0001) {
            return 0;
        } else if (diferencia > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    
}
