package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Prioridad {

    private String nombre;
    private int tiempoLlegada;
    private int tiempoRafaga;
    private int prioridad;
    private int tiempoEspera;
    private int tiempoRetorno;

    // Constructor
    public Prioridad(String nombre, int tiempoLlegada, int tiempoRafaga, int prioridad) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRafaga = tiempoRafaga;
        this.prioridad = prioridad;
        this.tiempoEspera = 0;
        this.tiempoRetorno = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public int getTiempoRafaga() {
        return tiempoRafaga;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getTiempoRetorno() {
        return tiempoRetorno;
    }

    public void setTiempoRetorno(int tiempoRetorno) {
        this.tiempoRetorno = tiempoRetorno;
    }

    // Método principal: calcula el orden según prioridad
    public static List<Prioridad> calcularPrioridad(List<Prioridad> listaProcesos) {
        // Ordenar por prioridad (menor número = mayor prioridad)
        listaProcesos.sort(Comparator.comparingInt(Prioridad::getPrioridad));

        int tiempoActual = 0;
        List<Prioridad> resultado = new ArrayList<>();

        for (Prioridad p : listaProcesos) {
            if (tiempoActual < p.getTiempoLlegada()) {
                tiempoActual = p.getTiempoLlegada();
            }

            p.setTiempoEspera(tiempoActual - p.getTiempoLlegada());
            tiempoActual += p.getTiempoRafaga();
            p.setTiempoRetorno(tiempoActual - p.getTiempoLlegada());

            resultado.add(p);
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Proceso: " + nombre
                + " | Llegada: " + tiempoLlegada
                + " | Ráfaga: " + tiempoRafaga
                + " | Prioridad: " + prioridad
                + " | Espera: " + tiempoEspera
                + " | Retorno: " + tiempoRetorno;
    }
}
