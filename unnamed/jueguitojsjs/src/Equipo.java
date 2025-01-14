
import java.util.HashMap;
import java.util.Map;

public class Equipo {
    private Map<String,Objeto>equipo;

    public Equipo() {
        this.equipo = new HashMap<>();
    }

    public Equipo(Map<String,Objeto> equipo) {
        this.equipo = new HashMap<>();
    }

    public Map<String,Objeto> getEquipo() {
        return this.equipo;
    }

    public void setEquipo(Map<String,Objeto> equipo) {
        this.equipo = equipo;
    }

    public Equipo equipo(Map<String,Objeto> equipo) {
        setEquipo(equipo);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " equipo='" + getEquipo() + "'" +
            "}";
    }
    /**
     * Metodo que permite al usuario equiparse un objeto
     * @param objeto
     * @param personaje
     * @return
     */
    public boolean aniadir(Objeto objeto,Personaje personaje){
        if(objeto==null){
            return false;
        }
        if(personaje.getInteligencia()>objeto.getInteligenciaNecesaria()){
            equipo.put(objeto.getCodigo(), objeto);
            return equipo.containsKey(objeto.getCodigo());
        }
        return false;
    }
    /**
     * Metodo para calcular el buffo del objeto equipado
     * @param objeto
     * @param personaje
     * @return
     */
    public boolean darBuffo(Objeto objeto,Personaje personaje){
        personaje.setAgilidad(personaje.getAgilidad()+objeto.getAgilidad());
        personaje.setCarisma(personaje.getCarisma()+objeto.getCarisma());
        personaje.setFuerza(personaje.getFuerza()+objeto.getFuerza());
        personaje.setSalud(personaje.getSalud()+objeto.getSalud());
        personaje.setInteligencia(personaje.getInteligencia()+objeto.getInteligencia());
        return true;
    }
    public boolean cambiarObjeto(Objeto objeto, Objeto objetoNuevo, Personaje personaje){
        if(objeto==null||objetoNuevo==null||personaje==null){
            return false;
        }
        if(equipo.containsKey(objeto.getCodigo())){
            if(personaje.getInteligencia()>objetoNuevo.getInteligenciaNecesaria()){
                equipo.replace(objeto.getCodigo(), objetoNuevo);
            personaje.setAgilidad(personaje.getAgilidad()-objeto.getAgilidad());
            personaje.setCarisma(personaje.getCarisma()-objeto.getCarisma());
            personaje.setFuerza(personaje.getFuerza()-objeto.getFuerza());
            personaje.setSalud(personaje.getSalud()-objeto.getSalud());
            personaje.setInteligencia(personaje.getInteligencia()-objeto.getInteligencia());
        personaje.setAgilidad(personaje.getAgilidad()+objetoNuevo.getAgilidad());
        personaje.setCarisma(personaje.getCarisma()+objetoNuevo.getCarisma());
        personaje.setFuerza(personaje.getFuerza()+objetoNuevo.getFuerza());
        personaje.setSalud(personaje.getSalud()+objetoNuevo.getSalud());
        personaje.setInteligencia(personaje.getInteligencia()+objetoNuevo.getInteligencia());
                return true;
            }
            return false;
        }
        return false;
    }
}
