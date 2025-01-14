import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prueba {
    static Inventario inventario=new Inventario();
    static Equipo equipo=new Equipo();
    /**
     * Objetos
     */
    static Objeto casco1=new Objeto("casco", "Casco del Heraldo", 0, 2, 0, 4, 0, 4);
    static Objeto casco2=new Objeto("casco", "Corona Runica", 0, 8, 2, 0, 4, 12);
    /**
     * Enemigos
     */
    static Enemigo enemigo1=new Enemigo("zombie", 6, 10, 11, 2);
    static Enemigo enemigo2=new Enemigo("esqueleto", 8, 8, 20, 3);
    static Enemigo enemigo3=new Enemigo("hollow", 16, 10, 18, 5);
    static Enemigo enemigo4=new Enemigo("brujo", 20, 5, 26, 6);
    static Enemigo enemigo5=new Enemigo("vampiro",18,16,12,5);
    static Enemigo enemigo6=new Enemigo("hombre-bestia",25,21,20,11);
    static Enemigo enemigo7=new Enemigo("gigante", 377,44,10,8);
    static Enemigo enemigo8=new Enemigo("clerigo caido", 88, 12, 129, 8);
    static Enemigo enemigo9=new Enemigo("angel putrefacto", 23, 65, 23, 12);
    /**
     * Bosses
     */
    static Boss boss1=new Boss("Reig", 30, 60, 22,15);
    static Boss boss2=new Boss("Freyier el Corrupto", 39, 55, 21,44);
    static Boss boss3=new Boss("Yielos El Señor de la Locura", 46, 100,32,100);
    /**
     * Clases
     */
    static Clases orco=new Clases("orco", 32, 40, 0, 0, 0);
    static Clases picaro=new Clases("picaro", 20, 32, 7, 19, 5);
    static Clases bardo=new Clases("bardo", 15, 29, 23, 10, 35);
    static Clases espadachin=new Clases("espadachin", 27, 17, 8, 27, 3);
   
    static List<Clases>clases=new ArrayList<Clases>(Arrays.asList(orco,picaro,bardo,espadachin));
    static Personaje personaje=new Personaje(null, 0, 0, 0, 0, 0, null, 0, 4);
    static List<Enemigo> enemigos1=new ArrayList(Arrays.asList(enemigo1,enemigo2));    
    /**
     * Mazmorras
     */
    static Mazmorra mazmorra1=new Mazmorra(enemigos1, "Bosque muerto", boss1, 2, "Mausoleo de los caidos");
    static Mazmorra mazmorra2=new Mazmorra(null, null, boss2, 0, null);
    static Mazmorra mazmorra3=new Mazmorra();
    static boolean jugando=true;
    public static void main(String[] args) {
       while (jugando==true) {
        System.out.println("Hola aventurero, espero que estes listo para empezar tu aventura...");
        System.out.println("Presione ENTER para continuar");
        Scanner sc=new Scanner(System.in);
        String blanc=sc.nextLine();
        System.out.println("Dime cual es tu nombre...");
        String nombreJugador=sc.nextLine();
        personaje.ponerNombre(nombreJugador);
        System.out.println("Oh... entonces asi te llamas.."+nombreJugador);
        System.out.println("Presione ENTER para continuar");
        String blanc1=sc.nextLine();
        System.out.println("¿Que clase de guerrero eres? Oh noble aventurero...");
        System.out.println(orco);
        System.out.println(picaro);
        System.out.println(bardo);
        System.out.println(espadachin);
        System.out.println("(Esbribe a continuacion el nombre de la clase)");
        String nombreClase=sc.nextLine();
        Clases soloNombre=new Clases(nombreClase);
        if (!clases.contains(soloNombre)) {
            System.out.println("No has introducido el nombre de la clase correctamente");
        }
        int posicion=clases.indexOf(soloNombre);
        personaje.setAgilidad(clases.get(posicion).getAgilidad());
        personaje.setCarisma(clases.get(posicion).getCarisma());
        personaje.setFuerza(clases.get(posicion).getFuerza());
        personaje.setInteligencia(clases.get(posicion).getInteligencia());
        personaje.setSalud(clases.get(posicion).getSalud());
        personaje.setClase(nombreClase);
        System.out.println("Ohhh entonces este eres tu");
        System.out.println(personaje);
        System.out.println("Presione ENTER para continuar");
        String blanc2=sc.nextLine();
        System.out.println("Si todo esta listo empecemos de inmediato");
        System.out.println("Empecemos con lo basico");
        System.out.println("Presione ENTER para continuar");
        String blanc3=sc.nextLine();
        System.out.println("Al entrar a una mazmorra encontraras diferentes enemigos en la misma o varias salas");
        System.out.println("Cada mazmorra tiene un Boss Final, debes derrotarlo para pasar a la siguiente");
        System.out.println("Presione ENTER para continuar");
        String blanc4=sc.nextLine();
        System.out.println("Ahora entraremos al Bosque Muerto al mausoleo de los caidos");
        int sumar=0;
        Personaje personajeCopia=new Personaje(null, sumar, sumar, sumar, posicion, sumar, null,0,0);
        personajeCopia.setAgilidad(personaje.getAgilidad());
        personajeCopia.setCarisma(personaje.getCarisma());
        personajeCopia.setInteligencia(personaje.getExperiencia());
        personajeCopia.setFuerza(personaje.getFuerza());
        personajeCopia.setSalud(personaje.getSalud());
        for (int i = 0; i < mazmorra1.getNumeroDeCuartos()-1; i++) {
            for (int j = 0; j < enemigos1.size(); j++) {
                sumar += enemigos1.get(j).getSalud();
            }
            System.out.println("Han aparecido 2 enemigos");
            System.out.println(enemigos1);
            System.out.println("La agilidad define quien atacara 1ro");
            System.out.println("Durante el cambate tienes varias opciones");
            System.out.println("Puedes atacar utilizando tu estadistica de fuerza, y asi le quitas vida a tus enemigos igual atu ataque");
            System.out.println("Podras tratar de follarte o hacerte amigo de tu enemigo utilizando tu estadistica de carisma");
            System.out.println("Solo podras hacer una de las anteriores opciones por turno");
            System.out.println("Pulse ENETER para continuar");
            blanc=sc.nextLine();
            System.out.println("Puedes defenderte del proximo ataque enemigo utilizando la mitad de tu ataque como defensa");
            System.out.println("Puedes tratar esquivar el proximo ataque, tienes un 10% de probabilidades de lograrlo, cada 15 de agilidad esta probabilidad aumenta en un 5%");
            System.out.println("Puedes tratar de hacer un parry, solo tomas un 20% del daño, tienes un 10% de probabilidades de lograrlo, cada 10 de agilidad aumenta un 10%");
            System.out.println("Pulse ENTER para continuar");
            blanc=sc.nextLine();
            posicion=0;
            while (sumar>0) {
                if(personaje.getSalud()>0){
                    System.out.println("Ahora veremos quien ataca 1ro");
                        if(enemigos1.get(posicion).getAgilidad()<personaje.getAgilidad()){
                            System.out.println("Atacas 1ro");
                            System.out.println("¿Que deseas hacer?");
                            System.out.println("Pulse 1 para atacar y pulse 2 para hacer una estupidez");
                            int opcionAtk1=sc.nextInt();
                            switch (opcionAtk1) {
                                case 1:
                                    enemigos1.get(posicion).setSalud(enemigos1.get(posicion).getSalud()-personaje.getFuerza());
                                    if(enemigos1.get(posicion).getSalud()<=0){
                                        enemigos1.get(posicion).setSalud(0);
                                        System.out.println("Has derrotado al enemigo");
                                        personaje.setExperiencia(personaje.getExperiencia()+enemigos1.get(posicion).getExperienciaDada());
                                        if(personaje.getExperiencia()>=personaje.getExperienciaNecesaria()){
                                            personaje.calcularExperiencia();
                                            System.out.println("Haz subido de nivel, diga el 1er atributo que desea subir");
                                            String atributo1= sc.nextLine();
                                            atributo1=sc.nextLine();
                                            System.out.println("Excelente ahora diga el 2do");
                                            String atributo2=sc.nextLine();
                                            personaje.subirNivel(atributo1, atributo2);
                                            personajeCopia.subirNivel(atributo1, atributo2);
                                        }
                                    }
                                    break;
                                default:
                                    if(personaje.getCarisma()>20){
                                        System.out.println("Felicidades ahora "+enemigos1.get(posicion).getNombre()+" es tu amigo con derecho");
                                        personaje.setExperiencia(personaje.getExperiencia()+enemigos1.get(posicion).getExperienciaDada());
                                        enemigos1.get(posicion).setSalud(0);
                                        if(personaje.getExperiencia()>=personaje.getExperienciaNecesaria()){
                                            personaje.calcularExperiencia();
                                            System.out.println("Haz subido de nivel, diga el 1er atributo que desea subir");
                                            String atributo1= sc.nextLine();
                                            System.out.println("Excelente ahora diga el 2do");
                                            String atributo2=sc.nextLine();
                                            personaje.subirNivel(atributo1, atributo2);
                                            personajeCopia.subirNivel(atributo1, atributo2);
                                        }
                                    }
                                    else{System.out.println("No haz logrado convencerlo");}
                                    break;
                                }
                                    if(enemigos1.get(posicion).getSalud()>0){
                                     System.out.println("Preparate para ser atacado");
                                            System.out.println("Presione '1' para defenderte, '2' para esquivar y '3' pata hacer parry");
                                            int respuesta=sc.nextInt();
                                            switch (respuesta) {
                                                case 1:
                                                   int daño= personaje.defenderte(enemigos1.get(posicion).getFuerza());
                                                    System.out.println("Haz recibido "+daño+" de daño");
                                                    System.out.println("Tu vida actual es de "+personaje.getSalud());
                                                    break; 
                                                case 2:
                                                    daño=personaje.esquivar(enemigos1.get(posicion).getFuerza());
                                                    if(daño==enemigos1.get(posicion).getFuerza()){
                                                        System.out.println("Felicidades haz esquivado con exito");
                                                    }
                                                    else{
                                                        System.out.println("No has logrado esquivar");
                                                        System.out.println("Tu salud actual es de "+personaje.getSalud());
                                                    }
                                                    break;
                                                default:
                                                   int dañoParry= personaje.parry(enemigos1.get(posicion).getFuerza());
                                                    if(dañoParry==enemigos1.get(posicion).getFuerza()){
                                                        System.out.println("No has logrado hacer parry");
                                                        System.out.println("Recibiste "+dañoParry+" de daño");
                                                        System.out.println("Tu vida actual es de "+personaje.getSalud());
                                                    }
                                                    else{
                                                        System.out.println("Has logrado hacer parry");
                                                        System.out.println("Recibiste "+dañoParry+" de daño");
                                                        System.out.println("Tu vida actual es de "+personaje.getSalud());
                                                    }
                                    }}
                            if(personaje.getSalud()<=0){
                                sumar=0;
                                System.out.println("Fin del juego");
                            }
                        }
                        else{
                            System.out.println("Preparate para ser atacado");
                            System.out.println("Presione '1' para defenderte, '2' para esquivar y '3' pata hacer parry");
                            int respuesta=sc.nextInt();
                            switch (respuesta) {
                                case 1:
                                   int daño= personaje.defenderte(enemigos1.get(posicion).getFuerza());
                                    System.out.println("Haz recibido "+daño+" de daño");
                                    System.out.println("Tu vida actual es de "+personaje.getSalud());
                                    break; 
                                case 2:
                                    personaje.esquivar(enemigos1.get(posicion).getFuerza());
                                    if(personaje.getSalud()==personajeCopia.getSalud()){
                                        System.out.println("Felicidades haz esquivado con exito");
                                    }
                                    else{
                                        System.out.println("No has logrado esquivar");
                                        System.out.println("Tu salud actual es de "+personaje.getSalud());
                                    }
                                    break;
                                default:
                                   int dañoParry= personaje.parry(enemigos1.get(posicion).getFuerza());
                                    if(dañoParry==enemigos1.get(posicion).getFuerza()){
                                        System.out.println("No has logrado hacer parry");
                                        System.out.println("Recibiste "+dañoParry+" de daño");
                                        System.out.println("Tu vida actual es de "+personaje.getSalud());
                                    }
                                    else{
                                        System.out.println("Has logrado hacer parry");
                                        System.out.println("Recibiste "+dañoParry+" de daño");
                                        System.out.println("Tu vida actual es de "+personaje.getSalud());
                                    }
                                    break;
                                }
                                if (personaje.getSalud()>0) {
                                    System.out.println("¿Que deseas hacer?");
                                    System.out.println("Pulse 1 para atacar y pulse 2 para hacer una estupidez");
                                    int opcionAtk1=sc.nextInt();
                                    switch (opcionAtk1) {
                                        case 1:
                                            enemigos1.get(posicion).setSalud(enemigos1.get(posicion).getSalud()-personaje.getFuerza());
                                            if(enemigos1.get(posicion).getSalud()<=0){
                                                enemigos1.get(posicion).setSalud(0);
                                                System.out.println("Has derrotado al enemigo");
                                                personaje.setExperiencia(personaje.getExperiencia()+enemigos1.get(posicion).getExperienciaDada());
                                                if(personaje.getExperiencia()>=personaje.getExperienciaNecesaria()){
                                                    personaje.calcularExperiencia();
                                                    System.out.println("Haz subido de nivel, diga el 1er atributo que desea subir");
                                                    String atributo1= sc.nextLine();
                                                    atributo1=sc.nextLine();
                                                    System.out.println("Excelente ahora diga el 2do");
                                                    String atributo2=sc.nextLine();
                                                    personaje.subirNivel(atributo1, atributo2);
                                                    personajeCopia.subirNivel(atributo1, atributo2);
                                                }
                                            }
                                            break;
                                        default:
                                            if(personaje.getCarisma()>20){
                                                System.out.println("Felicidades ahora "+enemigos1.get(posicion).getNombre()+" es tu amigo con derecho");
                                                personaje.setExperiencia(personaje.getExperiencia()+enemigos1.get(posicion).getExperienciaDada());
                                                enemigos1.get(i).setSalud(0);
                                                enemigos1.get(posicion).setSalud(0);
                                                if(personaje.getExperiencia()>=personaje.getExperienciaNecesaria()){
                                                    personaje.calcularExperiencia();
                                                    System.out.println("Haz subido de nivel, diga el 1er atributo que desea subir");
                                                    String atributo1= sc.nextLine();
                                                    atributo1=sc.nextLine();
                                                    System.out.println("Excelente ahora diga el 2do");
                                                    String atributo2=sc.nextLine();
                                                    personaje.subirNivel(atributo1, atributo2);
                                                    personajeCopia.subirNivel(atributo1, atributo2);
                                                }
                                            }
                                            else{
                                                System.out.println("No has logrado convencerlo :(");
                                            }
                                            break;
                                    }
                                }
                                else{
                                    System.out.println("Juego Terminado");
                                }
                                }  
                }
                sumar=0;
                for (int j = 0; j < enemigos1.size(); j++) {
                    sumar += enemigos1.get(j).getSalud();
                }
                if(enemigos1.get(posicion).getSalud()<=0){
                    posicion++;
                }
                
            }
        }
        enemigos1.get(0).setSalud(enemigo1.getSalud());
        enemigos1.get(1).setSalud(enemigo2.getSalud());
            personaje.setSalud(personajeCopia.getSalud());
            
        Boss bossZona1=mazmorra1.getBoss();
        int saludJefe1=bossZona1.getSalud();
        System.out.println("Felicidades has logrado eliminar a todos los enemigos");
        System.out.println("Pulse ENTER para continuar");
        blanc=sc.nextLine();
        System.out.println("Espera.... esa precencia");
        System.out.println("Es... "+bossZona1.getNombre());
        System.out.println("Ya sabes como funciona esto, confio en ti");
        while(saludJefe1>=0){
            if(personaje.getSalud()<0){
                System.out.println("Fin del juego");
               saludJefe1=0;
               System.out.println("Desea reintentar? 1 para si, 2 para no");
               int seleccion=sc.nextInt();
               if(seleccion==1){
                    personaje.setSalud(personajeCopia.getSalud());
                    saludJefe1=mazmorra1.getBoss().getSalud();
                }
                else{
                    System.out.println("Pos te jodes");
                }
                   }
            else{
            if(personaje.getAgilidad()>bossZona1.getAgilidad()){
                System.out.println("Atacas 1ro");
                System.out.println("¿Que deseas hacer?");
                System.out.println("Pulse 1 para atacar y pulse 2 para hacer una estupidez");
                int opcionAtk1=sc.nextInt();
                switch (opcionAtk1) {
                    case 1:
                            saludJefe1=saludJefe1-personaje.getFuerza();
                            System.out.println("Le quedan "+saludJefe1+" de vida");
                            if(saludJefe1<=0){
                                mazmorra1.getBoss().setSalud(0);
                                personaje.setExperiencia(personaje.getExperiencia()+bossZona1.getExperienciaADar());
                            }
                        
                        break;
                    
                    default:
                        if(personaje.getCarisma()>35){
                            System.out.println("Felicidades ahora "+bossZona1.getNombre()+" es tu amigo con derecho");
                            personaje.setExperiencia(personaje.getExperiencia()+bossZona1.getExperienciaADar());
                            saludJefe1=0;
                        }else{
                            System.out.println("Lo siento su carisma no es suficiente");
                        }
                            break; }
                    if(saludJefe1>0){
                         System.out.println("Preparate para ser atacado");
                    System.out.println("Presione '1' para defenderte, '2' para esquivar y '3' pata hacer parry");
                    int respuesta=sc.nextInt();
                    switch (respuesta) {
                        case 1:
                           int daño= personaje.defenderte(bossZona1.getFuerza());
                            System.out.println("Haz recibido "+daño+" de daño");
                            System.out.println("Tu vida actual es de "+personaje.getSalud());
                            break; 
                        case 2:
                            personaje.esquivar(bossZona1.getFuerza());
                            if(personaje.getSalud()==personajeCopia.getSalud()){
                                System.out.println("Felicidades haz esquivado con exito");
                            }
                            else{
                                System.out.println("No has logrado esquivar");
                                System.out.println("Tu salud actual es de "+personaje.getSalud());
                            }
                            break;
                        default:
                           int dañoParry= personaje.parry(bossZona1.getFuerza());
                            if(dañoParry==bossZona1.getFuerza()){
                                System.out.println("No has logrado hacer parry");
                                System.out.println("Recibiste "+dañoParry+" de daño");
                                System.out.println("Tu vida actual es de "+personaje.getSalud());
                            }
                            else{
                                System.out.println("Has logrado hacer parry");
                                System.out.println("Recibiste "+dañoParry+" de daño");
                                System.out.println("Tu vida actual es de "+personaje.getSalud());
                            }
                            break;
                        }
                    }  
                }
            else{
                    if(personaje.getSalud()>0){
                    System.out.println("Preparate para ser atacado");
                    System.out.println("Presione '1' para defenderte, '2' para esquivar y '3' pata hacer parry");
                    int respuesta=sc.nextInt();
                    switch (respuesta) {
                        case 1:
                           int daño= personaje.defenderte(bossZona1.getFuerza());
                            System.out.println("Haz recibido "+daño+" de daño");
                            System.out.println("Tu vida actual es de "+personaje.getSalud());
                            break; 
                        case 2:
                            personaje.esquivar(bossZona1.getFuerza());
                            if(personaje.getSalud()==personajeCopia.getSalud()){
                                System.out.println("Felicidades haz esquivado con exito");
                            }
                            else{
                                System.out.println("No has logrado esquivar");
                                System.out.println("Tu salud actual es de "+personaje.getSalud());
                            }
                            break;
                        default:
                           int dañoParry= personaje.parry(bossZona1.getFuerza());
                            if(dañoParry==bossZona1.getFuerza()){
                                System.out.println("No has logrado hacer parry");
                                System.out.println("Recibiste "+dañoParry+" de daño");
                                System.out.println("Tu vida actual es de "+personaje.getSalud());
                            }
                            else{
                                System.out.println("Has logrado hacer parry");
                                System.out.println("Recibiste "+dañoParry+" de daño");
                                System.out.println("Tu vida actual es de "+personaje.getSalud());
                            }
                            break;
                        }
                        if(personaje.getSalud()<0){
                            System.out.println("Fin del juego");
                            saludJefe1=0;
                            System.out.println("Desea reintentar? 1 para si, 2 para no");
                    int seleccion=sc.nextInt();
                if(seleccion==1){
                    personaje.setSalud(personajeCopia.getSalud());
                    saludJefe1=mazmorra1.getBoss().getSalud();
                }
                else{
                    System.out.println("Pos te jodes");
                }
                        }
                        else{
                        System.out.println("¿Que deseas hacer?");
                System.out.println("Pulse 1 para atacar y pulse 2 para hacer una estupidez");
                int opcionAtk1=sc.nextInt();
                switch (opcionAtk1) {
                    case 1:
                        saludJefe1=saludJefe1-personaje.getFuerza();
                        if(saludJefe1<=0){
                            mazmorra1.getBoss().setSalud(0);
                            personaje.setExperiencia(personaje.getExperiencia()+bossZona1.getExperienciaADar());
                        }
                        break;
                    default:
                        if(personaje.getCarisma()>37){
                            System.out.println("Felicidades ahora "+bossZona1.getNombre()+" es tu amigo con derecho");
                            personaje.setExperiencia(personaje.getExperiencia()+bossZona1.getExperienciaADar());
                            saludJefe1=0;
                            mazmorra1.getBoss().setSalud(0);
                }else{
                    System.out.println("No has logrado convencerlo");
                }break;
            }} }} 
            if(personaje.getExperiencia()>=personaje.getExperienciaNecesaria()){
                personaje.calcularExperiencia();
                System.out.println("Diga el primer atributo a mejorar");
                String atributo1=sc.nextLine();
                atributo1=sc.nextLine();
                System.out.println("Excelente ahora diga el segundo");
                String atributo2=sc.nextLine();
                personaje.subirNivel(atributo1, atributo2);
                personajeCopia.subirNivel(atributo1, atributo2);
            }
        } 
            }
            personaje.setSalud(personajeCopia.getSalud());
            jugando=false;
            if(mazmorra1.getBoss().getSalud()<=0){
                System.out.println("¡Lo hiciste!"+mazmorra1.getBoss().getNombre()+" ¡Ha sido derrotado!");
                System.out.println("Oh.. parece que el Boss ha soltado un objeto,¿Desea recogerlo? Marque 1 para si y 2 para no");
                int respuesta=sc.nextInt();
                if(respuesta==1){
                    inventario.añadirAlInventario(casco1);
                    System.out.println(casco1+" Ha sido añadido a su inventario");
                }
                else{
                    System.out.println("Pos a continuar con la aventura(Se viene explicacion de como usar objetos y todo eso)");
                }
                System.out.println("Durante tu aventura tendras siempre etapas de calma, antes de entrar a una mazmorra o despues de completarla");
                System.out.println("Durante estos tiempos podras acceder a un menu el cual te permitira ver tus estadisticas, equipo e inventario");
                System.out.println("Pulse ENTER para continuar");
                blanc=sc.nextLine();
                blanc=sc.nextLine();
                System.out.println("Vamos a ir a la demostracion");
                System.out.println("¿Que desea hacer?, marque 1 para acceder al menu o marque 2 para continuar con la aventura");
                respuesta=sc.nextInt();
                if(respuesta ==1){
                    boolean salir=false;
                    while(salir==false){
                    System.out.println("Ahora mismo se encuentra en el MENU");
                    System.out.println("Marque 1 para ver sus caracteristicas");
                    System.out.println("Marque 2 para ver su inventario");
                    System.out.println("Marque 3 para equiparse un objeto");
                    System.out.println("Marque 4 para cambiar un objeto equipado por otro");
                    System.out.println("Marque 5 para ver las especificaciones de un objeto");
                    System.out.println("Marque 6 para salir del MENU");
                    respuesta=sc.nextInt();
                    switch (respuesta) {
                        case 1:
                            System.out.println(personaje);
                            break;
                        case 2:
                            System.out.println(inventario);
                            break;
                        case 3:
                            System.out.println("Diga el nombre del objeto que desee equiparse");
                            blanc=sc.nextLine();
                            blanc=sc.nextLine();
                            equipo.aniadir(inventario.buscar(blanc), personaje);
                            if (equipo.aniadir(inventario.buscar(blanc), personaje)) {
                                System.out.println("Se ha equipado el objeto con exito");
                                equipo.darBuffo(inventario.buscar(blanc), personaje);
                            }else{
                                System.out.println("No se ha podido equipar, puede ser por alguna de las siguientes razones:");
                                System.out.println("Ya contiene un objeto de tipo "+inventario.buscar(blanc).getCodigo());
                                System.out.println("No contenga un objeto con ese nombre en su inventario");
                                System.out.println("No posea inteligencia suficiente");
                            }
                            break;
                        case 4:
                            System.out.println("Diga el nombre del objeto que desee cambiar");
                            blanc=sc.nextLine();
                            blanc=sc.nextLine();
                            System.out.println("Diga el nombre del objeto que se desea equipar");
                            blanc1=sc.nextLine();
                            blanc1=sc.nextLine();
                            equipo.cambiarObjeto(inventario.buscar(blanc), inventario.buscar(blanc1), personaje);
                            if(equipo.cambiarObjeto(inventario.buscar(blanc), inventario.buscar(blanc1), personaje)){
                                System.out.println("Se ha equipado el objeto con exito");
                            }else{
                                System.out.println("No se ha podido hacer el cambio, puede ser por alguna de las siguientes razones:");
                                System.out.println("Los objetos no son del mismo tipo ");
                                System.out.println("No contenga un objeto con ese nombre en su inventario");
                                System.out.println("Los objetos son el mismo");
                                System.out.println("No posee inteligencia suficiente");
                            }
                            break;
                        case 5:
                            System.out.println("Diga el nombre del objeto al cual desea ver sus especificaciones");
                                blanc=sc.nextLine();
                                blanc=sc.nextLine();
                            System.out.println(inventario.buscar(blanc).verDetalles());
                            break;
                        default:
                            salir=true;
                            break;
                    }
                    }
                }
                System.out.println("Felicidades has completado la beta");
            }
      }
        }
    }
    
    
    
