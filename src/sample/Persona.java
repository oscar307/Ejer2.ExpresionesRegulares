
package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hp on 01/11/2017.
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    private static Persona[ ] listaPersonas= {
            new Persona("Oscar", "Diaz", 25),
            new Persona("Jose", "Perz", 23),
            new Persona("Patricia", "Vargas", 39),
            new Persona("Estefani", "Obando", 24),
            new Persona("Jorge", "Soto", 24),
            new Persona("Pedro", "Lopez", 27),
    };

    public Persona(String nombre , String apellido , int edad) {
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad=edad;

    }

    public static void Encontrar(String nombre){
        for (int i = 0; i < listaPersonas.length; i++) {
            Pattern p = Pattern.compile("(?i)" + nombre);
            Matcher matc = p.matcher(listaPersonas[i].nombre);

            if(matc.find()){
                System.out.println(listaPersonas[i].nombre +" " + listaPersonas[i].apellido);
            }

        }

    }
}