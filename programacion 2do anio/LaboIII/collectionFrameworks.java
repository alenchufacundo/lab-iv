import java.util.*;

public class teoria18 {
    public static void main(String[] args) {
        
        /*SETT */
        
        Set<String> setNombre = new HashSet<>();
        
        System.out.println(setNombre);

        setNombre.add("Julian");
        setNombre.add("Pedro");
        setNombre.add("Marta");
        setNombre.add("Agostina");
        setNombre.add("Tomas");

        System.out.println("nombres desorndenados: " +setNombre);
        
        //ACA PODRIA HABERLO HECHO ASI PERO LO HACEMOS DE OTRA FORMA.
        //Set<String> setNombresOrdenados = new LinkedHashSet<>();

        //Lo hacemos asi para perder la referencia del setNombre(que estaba desordenado)
        //y lo creamos ya para que esta vez se ordene
        setNombre = new LinkedHashSet<>();

        setNombre.add("Agostina");
        setNombre.add("Julian");
        setNombre.add("Pedro");
        setNombre.add("Marta");
        setNombre.add("Agostina");
        setNombre.add("Tomas");
        //EL SET NO REPITE ELEMENTOS. XD

        System.out.println("nombres orndenados: " +setNombre);

        setNombre.remove("Pedro");
        System.out.println("nombres orndenados sin Pedro: " +setNombre);
        
        //Si queremos acceder a cada elemento del set lo hacemos con:
        System.out.println("Recorrer el set: ");

        for (String persona : setNombre) {
            System.out.println(persona);
        }
        /*---------------------------------------------------------------------------------------------- */

        // LIST
        System.out.println("------------------------------LIST------------------------------");;
        List<String> listaNombres = new ArrayList<>();
    
        listaNombres.add("Julian");
        listaNombres.add("Pedro");
        listaNombres.add("Marta");
        listaNombres.add("Agostina");
        listaNombres.add("Tomas");

        System.out.println("nombres desorndenados: " +listaNombres);
        
        //acceder a cada elemento
        System.out.println("Elemento 2: " + listaNombres.get(2));

        // for(int i = 0; i < listaNombres.size(); i++){
        //     System.out.println(i + "- " + listaNombres.get(i));
        // }

        for (String nombres : listaNombres) {
            System.out.println(nombres);            
        }

        /*---------------------------------------------------------------------------------------------- */

        // MAP

        Map<String, Integer> alumnosNotas = new HashMap<>();

        //Si se ponen dos put con la misma key pero diferente value, se actualiza y se toma en cuenta la
        //ultima puesta. 
        //+Solo una clave puede existir para cada valor, NO SE PUEDE REPETIR LA CLAVE.
        alumnosNotas.put("Andone", 10);
        alumnosNotas.put("Luciano", 5);
        alumnosNotas.put("Sofia", 5);
        alumnosNotas.put("Tomas", 3);
        alumnosNotas.put("Andone", 5);

        System.out.println(alumnosNotas);

        //obtener el valor de una clave
        System.out.println("Nota de Andone: " + alumnosNotas.get("Andone"));

        for(Map.Entry<String, Integer> alumnos : alumnosNotas.entrySet()){
            System.out.println(alumnos.getKey() + " - " + alumnos.getValue());
        }

        
    }
}
