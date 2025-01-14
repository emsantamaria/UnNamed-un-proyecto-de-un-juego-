public class Personaje {
    private String nombre;
    private String clase;
    private int fuerza;
    private int salud;
    private int inteligencia;
    private int agilidad;
    private int carisma;
    public int experienciaNecesaria;
    public int experiencia;
    public Personaje() {
    }
    public Personaje(String clase){
        this.clase=clase;
    }
    public Personaje(String nombre, int fuerza, int salud, int inteligencia, int agilidad, int carisma, String clase, int experiencia, int experienciaNecesaria) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.salud = salud;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.carisma = carisma;
        this.clase=clase;
        this.experiencia=experiencia;
        this.experienciaNecesaria=experienciaNecesaria;
    }

    public int getExperienciaNecesaria() {
        return this.experienciaNecesaria;
    }

    public void setExperienciaNecesaria(int experienciaNecesaria) {
        this.experienciaNecesaria = experienciaNecesaria;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
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

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", fuerza='" + getFuerza() + "'" +
            ", salud='" + getSalud() + "'" +
            ", inteligencia='" + getInteligencia() + "'" +
            ", agilidad='" + getAgilidad() + "'" +
            ", carisma='" + getCarisma() + "'" +
            ", clase='"+getClase()+"'"+
            "}";
    }
    /**
     * Metodo que permite al jugador defenderse
     * @param fuerzaEnemigo
     * @return
     */
    public int defenderte( int fuerzaEnemigo){
        int fuerzaDefender=this.fuerza/2;
        int daño=fuerzaDefender-fuerzaEnemigo;
        if(daño<0){
            setSalud(salud+daño);            
            return daño;
        }
        return 0;
    }
    /**
     * 
     * Metodo que calcula los cambios en las estadisticas al subir de nivel
     * @param atributo
     * @param atributo2
     * @return
     */
    public boolean subirNivel(String atributo, String atributo2){
        switch (atributo) {
            case "fuerza":
            this.fuerza++;   
                break;
            case "agilidad":
            this.agilidad++;
                break;
            case "carisma":
            this.carisma++;
                break;
            case "salud":
            this.salud++;
                break;
            default:
            this.inteligencia++;
                break;
        }
        switch (atributo2) {
            case "fuerza":
            this.fuerza++;   
                break;
            case "agilidad":
            this.agilidad++;
                break;
            case "carisma":
            this.carisma++;
                break;
            case "salud":
            this.salud++;
                break;
            default:
            this.inteligencia++;
                break;
        }
        this.fuerza++;
        this.agilidad++;
        this.carisma++;
        this.salud++;
        this.inteligencia++;
        return true;
    }
    /**
     * Metodo que calcula cual va a ser la experiencia necesaria proxima
     * @return
     */
    public boolean calcularExperiencia(){
        this.experiencia=experiencia-experienciaNecesaria;
        int temporal=experienciaNecesaria/2;
        this.experienciaNecesaria=experienciaNecesaria*2-temporal;
        return true;
    }
    /**
     * Metodo que permite al jugador ponerse un nombre
     * @param nombreFinal
     * @return
     */
    public boolean ponerNombre(String nombreFinal){
        if(nombreFinal.equals(null)||nombreFinal.equals("")){
            return false;
        }
        this.nombre=nombreFinal;
        return true;
    }
    /**
     * Metodo que permite al jugador esquivar un ataque
     * @param ataqueEnemigo
     * @return
     */
    public int esquivar(int ataqueEnemigo){
        int dado=(int)(Math.random()*100)+1;
        int bonus=(agilidad/15)*5;
        if(dado<=bonus+10){
            return 0;
        }
        setSalud(salud-ataqueEnemigo);
        return ataqueEnemigo;
    }
    /**
     * Metodo que permite al jugador hacer un parry
     * @param ataqueEnemigo
     * @return
     */
    public int parry(int ataqueEnemigo){
        int dado=(int)(Math.random()*100)+1;
        int bonnus=(agilidad/10)*10;
        int daño=ataqueEnemigo/5;
        if(dado<=bonnus+10){
            this.salud=salud-daño;
            return daño;
        }
        setSalud(salud-ataqueEnemigo);
        return ataqueEnemigo;
    }
    
    }
