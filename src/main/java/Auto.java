public class Auto extends Vehiculo {
    private boolean ruedaAuxilio;
    private static Integer velocidad = 100;
    private Integer plusVelocidad;
    private Integer velocidadFinal;
//CONSTRUCTORES


    public Auto() {
    }

    public Auto(boolean ruedaAuxilio, Integer plusVelocidad) {
        this.ruedaAuxilio = ruedaAuxilio;
        this.plusVelocidad = plusVelocidad;
        this.velocidadFinal = (this.getVelocidad() + plusVelocidad);
    }
//GETTERS AND SETTERS

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public void setRuedaAuxilio(boolean ruedaAuxilio) {
        this.ruedaAuxilio = ruedaAuxilio;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getPlusVelocidad() {
        return plusVelocidad;
    }

    public void setPlusVelocidad(Integer plusVelocidad) {
        this.plusVelocidad = plusVelocidad;
    }

    public Integer getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(Integer velocidadFinal) {
        this.velocidadFinal = (this.getVelocidad() + this.plusVelocidad);
    }

    //METODOS

    @Override
    public boolean esSeguro() {
        if (ruedaAuxilio && velocidadFinal <= 140) {
            return super.esSeguro();
        } else return false;

    }
    public boolean velocidadSuperada(){
        if (velocidadFinal > 140) {
            return true;
        } else return false;

    }

}