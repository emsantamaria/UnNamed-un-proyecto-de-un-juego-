import java.util.Objects;

public class Clases {
    private String clase;
    private int fuerza;
    private int salud;
    private int inteligencia;
    private int agilidad;
    private int carisma;


    public Clases() {
    }
    public Clases(String clase){
        this.clase=clase;
    }
    public Clases(String clase, int fuerza, int salud, int inteligencia, int agilidad, int carisma) {
        this.clase = clase;
        this.fuerza = fuerza;
        this.salud = salud;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.carisma = carisma;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
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

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getCarisma() {
        return this.carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public Clases clase(String clase) {
        setClase(clase);
        return this;
    }

    public Clases fuerza(int fuerza) {
        setFuerza(fuerza);
        return this;
    }

    public Clases salud(int salud) {
        setSalud(salud);
        return this;
    }

    public Clases inteligencia(int inteligencia) {
        setInteligencia(inteligencia);
        return this;
    }

    public Clases agilidad(int agilidad) {
        setAgilidad(agilidad);
        return this;
    }

    public Clases carisma(int carisma) {
        setCarisma(carisma);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Clases)) {
            return false;
        }
        Clases clases = (Clases) o;
        return Objects.equals(clase, clases.clase);
    }

    @Override
    public String toString() {
        return "{" +
            " clase='" + getClase() + "'" +
            ", fuerza='" + getFuerza() + "'" +
            ", salud='" + getSalud() + "'" +
            ", inteligencia='" + getInteligencia() + "'" +
            ", agilidad='" + getAgilidad() + "'" +
            ", carisma='" + getCarisma() + "'" +
            "}";
    }
   
}