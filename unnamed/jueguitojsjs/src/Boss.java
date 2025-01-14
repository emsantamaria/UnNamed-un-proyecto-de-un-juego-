public class Boss {
    private String nombre;
    private int fuerza;
    private int salud;
    private int agilidad;
    private int experienciaADar;

    public Boss() {
    }

    public Boss(String nombre, int fuerza, int salud, int agilidad, int experienciaADar) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.salud = salud;
        this.agilidad = agilidad;
        this.experienciaADar=experienciaADar;
    }

    public int getExperienciaADar() {
        return this.experienciaADar;
    }

    public void setExperienciaADar(int experienciaADar) {
        this.experienciaADar = experienciaADar;
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

    public Boss nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Boss fuerza(int fuerza) {
        setFuerza(fuerza);
        return this;
    }

    public Boss salud(int salud) {
        setSalud(salud);
        return this;
    }

    public Boss agilidad(int agilidad) {
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
