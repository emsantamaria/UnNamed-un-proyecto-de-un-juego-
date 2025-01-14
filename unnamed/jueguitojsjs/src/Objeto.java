import java.util.Objects;

public class Objeto {
    private String codigo;
    private String nombre;
    private int fuerza;
    private int salud;
    private int inteligencia;
    private int agilidad;
    private int carisma;
    private int inteligenciaNecesaria;

    public Objeto(String codigo, String nombre, int fuerza, int salud, int inteligencia, int agilidad, int carisma, int inteligenciaNecesaria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.salud = salud;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.carisma = carisma;
        this.inteligenciaNecesaria = inteligenciaNecesaria;
    }

    public int getInteligenciaNecesaria() {
        return this.inteligenciaNecesaria;
    }

    public void setInteligenciaNecesaria(int inteligenciaNecesaria) {
        this.inteligenciaNecesaria = inteligenciaNecesaria;
    }

    public Objeto inteligenciaNecesaria(int inteligenciaNecesaria) {
        setInteligenciaNecesaria(inteligenciaNecesaria);
        return this;
    }
    public Objeto() {
    }
    public Objeto(String nombre){
        this.nombre=nombre;
    }
    public Objeto(String codigo, String nombre, int fuerza, int salud, int inteligencia, int agilidad, int carisma) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.salud = salud;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.carisma = carisma;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Objeto codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Objeto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Objeto fuerza(int fuerza) {
        setFuerza(fuerza);
        return this;
    }

    public Objeto salud(int salud) {
        setSalud(salud);
        return this;
    }

    public Objeto inteligencia(int inteligencia) {
        setInteligencia(inteligencia);
        return this;
    }

    public Objeto agilidad(int agilidad) {
        setAgilidad(agilidad);
        return this;
    }

    public Objeto carisma(int carisma) {
        setCarisma(carisma);
        return this;
    }

    public String verDetalles() {
        return "{" +
            ", nombre='" + getNombre() + "'" +
            ", fuerza='" + getFuerza() + "'" +
            ", salud='" + getSalud() + "'" +
            ", inteligencia='" + getInteligencia() + "'" +
            ", agilidad='" + getAgilidad() + "'" +
            ", carisma='" + getCarisma() + "'" +
            ", inteligencia necesaria='" + getInteligenciaNecesaria() + "'" +
            "}";
    }
    @Override
    public String toString(){
        return ""+nombre+"";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Objeto)) {
            return false;
        }
        Objeto objeto = (Objeto) o;
        return Objects.equals(nombre, objeto.nombre) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, fuerza, salud, inteligencia, agilidad, carisma);
    }

}
