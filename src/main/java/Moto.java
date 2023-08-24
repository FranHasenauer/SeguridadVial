public class Moto extends Vehiculo {
    private Integer velocidad;
    private int cantidadRetrovisores;

    //CONSTRUCTORES


    public Moto() {
    }

    public Moto(Integer velocidad, int cantidadRetrovisores) {
        this.velocidad = velocidad;
        this.cantidadRetrovisores = cantidadRetrovisores;
    }
    //GETTERS Y SETTERS


    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantidadRetrovisores() {
        return cantidadRetrovisores;
    }

    public void setCantidadRetrovisores(int cantidadRetrovisores) {
        this.cantidadRetrovisores = cantidadRetrovisores;
    }

    //METODOS


    @Override
    public boolean esSeguro() {
        if (velocidad < 160 && cantidadRetrovisores >= 2) {
            return true;
        } else return false;
    }

    public boolean velocidadSuperada() {
        if (velocidad > 160) {
            return true;
        } else return false;

    }

    public boolean tieneRetrovisoresSuficientes() {
        if (cantidadRetrovisores >= 2) {
            return true;
        } else return false;
    }
}
