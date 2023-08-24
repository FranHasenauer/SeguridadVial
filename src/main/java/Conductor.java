public class Conductor {
    public boolean tieneRegistro;
    Auto auto = new Auto(true,  45);

//CONSTRUCTORES

    public Conductor() {
    }

    public Conductor(boolean tieneRegistro) {
        this.tieneRegistro = tieneRegistro;
    }
    //GETTER Y SETTER

    public boolean isTieneRegistro() {
        return tieneRegistro;
    }

    public void setTieneRegistro(boolean tieneRegistro) {
        this.tieneRegistro = tieneRegistro;
    }

    //METODOS
    public boolean esConductorSeguro() {
        if (auto.esSeguro() && this.isTieneRegistro()) {
        }
        return false;
    }
}
