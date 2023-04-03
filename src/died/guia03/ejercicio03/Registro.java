package died.guia03.ejercicio03;
import died.guia03.ejercicio02.Temperatura;

public class Registro {

    private String ciudad;
    private Temperatura[] historico;
    private int indiceActual;
    private int capacidadMaxima;

    public Registro() {
        this.ciudad = "-";
        this.capacidadMaxima = 100;
        this.historico = new Temperatura[capacidadMaxima];
        this.indiceActual = 0;
    }

    public Registro(String ciudad) {
        this.ciudad = ciudad;
        this.capacidadMaxima = 100;
        this.historico = new Temperatura[capacidadMaxima];
        this.indiceActual = 0;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void imprimir() {
        System.out.println("TEMPERATURAS REGISTRADAS EN : " + ciudad);
        for (int i = 0; i < indiceActual; i++) {
            System.out.println((i+1) + " " +  historico[i].toString());
        }
    }

    public void agregar(Temperatura t) {
        if (indiceActual < capacidadMaxima) {
            historico[indiceActual] = t;
            indiceActual++;
        }
    }

    public Temperatura maximo() {
        if (indiceActual == 0) {
            return null;
        }
        return maximoRecursivo(0);
    }

    private Temperatura maximoRecursivo(int i) {
        if (i == indiceActual - 1) {
            return historico[i];
        }
        Temperatura temp = maximoRecursivo(i+1);
        if (historico[i].comparar(temp) > 0) {
            return historico[i];
        } else {
            return temp;
        }
    }

    public double mediaAsCelcius() {
        if (indiceActual == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < indiceActual; i++) {
            suma += historico[i].asCelcius();
        }
        return suma / indiceActual;
    }

    public double mediaAsFahrenheit() {
        if (indiceActual == 0) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < indiceActual; i++) {
            suma += historico[i].asFahrenheit();
        }
        return suma / indiceActual;
    }
}
    