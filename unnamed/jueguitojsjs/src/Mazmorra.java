import java.util.List;
import java.util.Objects;

public class Mazmorra {
    private List<Enemigo>enemigos;
    private String zona;
    private Boss boss;
    private String nombre;
    int numeroDeCuartos;
    public Mazmorra() {
    }

    public Mazmorra(List<Enemigo> enemigos, String zona, Boss boss, int numeroDeCuartos, String nombre) {
        this.enemigos = enemigos;
        this.zona = zona;
        this.boss = boss;
        this.nombre=nombre;
        this.numeroDeCuartos=numeroDeCuartos;
    }

    public Mazmorra(List<Enemigo> enemigos, String zona, Boss boss, String nombre, int numeroDeCuartos) {
        this.enemigos = enemigos;
        this.zona = zona;
        this.boss = boss;
        this.nombre = nombre;
        this.numeroDeCuartos = numeroDeCuartos;
    }

    public int getNumeroDeCuartos() {
        return this.numeroDeCuartos;
    }

    public void setNumeroDeCuartos(int numeroDeCuartos) {
        this.numeroDeCuartos = numeroDeCuartos;
    }

    public Mazmorra numeroDeCuartos(int numeroDeCuartos) {
        setNumeroDeCuartos(numeroDeCuartos);
        return this;
    }

    public Mazmorra(List<Enemigo> enemigos, String zona, Boss boss, String nombre) {
        this.enemigos = enemigos;
        this.zona = zona;
        this.boss = boss;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mazmorra nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mazmorra)) {
            return false;
        }
        Mazmorra mazmorra = (Mazmorra) o;
        return Objects.equals(enemigos, mazmorra.enemigos) && Objects.equals(zona, mazmorra.zona) && Objects.equals(boss, mazmorra.boss) && Objects.equals(nombre, mazmorra.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enemigos, zona, boss, nombre);
    }

    public List<Enemigo> getEnemigos() {
        return this.enemigos;
    }

    public void setEnemigos(List<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Boss getBoss() {
        return this.boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Mazmorra enemigos(List<Enemigo> enemigos) {
        setEnemigos(enemigos);
        return this;
    }

    public Mazmorra zona(String zona) {
        setZona(zona);
        return this;
    }

    public Mazmorra boss(Boss boss) {
        setBoss(boss);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " enemigos='" + getEnemigos() + "'" +
            ", zona='" + getZona() + "'" +
            ", boss='" + getBoss() + "'" +
            "}";
    }

}
