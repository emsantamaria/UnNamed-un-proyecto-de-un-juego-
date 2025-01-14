public class Enemigo {
    private String nombre;
    private int fuerza;
    private int salud;
    private int agilidad;
    private int experienciaDada;
    public Enemigo() {
    }

    public Enemigo(String nombre, int fuerza, int salud, int agilidad, int experienciaDada) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.salud = salud;
        this.agilidad = agilidad;
        this.experienciaDada=experienciaDada;
    }

    public int getExperienciaDada() {
        return this.experienciaDada;
    }

    public void setExperienciaDada(int experienciaDada) {
        this.experienciaDada = experienciaDada;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public Enemigo nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Enemigo fuerza(int fuerza) {
        setFuerza(fuerza);
        return this;
    }

    public Enemigo salud(int salud) {
        setSalud(salud);
        return this;
    }

    public Enemigo agilidad(int agilidad) {
        setAgilidad(agilidad);
        return this;
    }

    
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", fuerza='" + getFuerza() + "'" +
            ", salud='" + getSalud() + "'" +
            ", agilidad='" + getAgilidad() + "'" +
            "}";
    }

}
