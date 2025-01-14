import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventario {
    private List<Objeto>inventario;
    private int cargaMaxima;
    private int cargaActual;

    public Inventario() {
        this.inventario = new ArrayList<>();
        this.cargaMaxima = 50;
        this.cargaActual = 0;
    }

    public List<Objeto> getInventario() {
        return this.inventario;
    }

    public void setInventario(List<Objeto> inventario) {
        this.inventario = inventario;
    }

    public int getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return this.cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Inventario inventario(List<Objeto> inventario) {
        setInventario(inventario);
        return this;
    }

    public Inventario cargaMaxima(int cargaMaxima) {
        setCargaMaxima(cargaMaxima);
        return this;
    }

    public Inventario cargaActual(int cargaActual) {
        setCargaActual(cargaActual);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Inventario)) {
            return false;
        }
        Inventario inventario = (Inventario) o;
        return Objects.equals(inventario, inventario.inventario) && cargaMaxima == inventario.cargaMaxima && cargaActual == inventario.cargaActual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventario, cargaMaxima, cargaActual);
    }

    @Override
    public String toString() {
        return "{" +
            " inventario='" + getInventario() + "'" +
            ", cargaMaxima='" + getCargaMaxima() + "'" +
            ", cargaActual='" + getCargaActual() + "'" +
            "}";
    }
    /**
     * Metodo que permite aniadir un objeto a tu inventario
     * @param objeto
     * @return boolean true/false
     */
    public boolean añadirAlInventario(Objeto objeto){
        if(objeto==null||inventario==null||inventario.contains(null)){
            return false;
        }
        inventario.add(objeto);
        cargaActual++;
        return true;
    }
    /**
     * Metodo que permite al usuario ver un objeto encontrandolo por su nombre
     * @param nombre
     * @return Objeto
     */
    public Objeto buscar(String nombre){
        Objeto objeto=new Objeto(nombre);
        if(nombre==null){
            return new Objeto();
        }
        if(!inventario.contains(objeto)){
            return new Objeto();
        }
        int posicion=inventario.indexOf(objeto);
        return inventario.get(posicion);
    }
}
