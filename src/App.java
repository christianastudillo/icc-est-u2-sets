import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparador;

public class App {
    public static void main(String[] args) throws Exception {
        // runHasSet();
        // runLinkedHasSet();
        // runTreeSet();
        // runTreeComparador();
        runEjercicio();
    }

    private static void runHasSet(){

        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elemento del HashSet (no se garantiza orden)" );
        for (String elemento : ejemploHashSet) {
            System.out.println( elemento );
        }
    }
    private static void runLinkedHasSet(){
        Sets linkedset = new Sets();
        Set<String> ejemplolinked = linkedset.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elemento del LinkedHashSet" );
        for (String elemento : ejemplolinked) {
            System.out.println( elemento );
        }
    }

    private static void runTreeSet(){
        Sets miTreeSet = new Sets();
        Set<String> ejemploHasSet = miTreeSet.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elemento del TreeSet" );
        for (String elemento : ejemploHasSet) {
            System.out.println( elemento );
        }
    } 
    private static void runTreeComparador(){
        Sets miTreeCom = new Sets();
        Set<String> ejemploCom = miTreeCom.contruirTreeSetConComparador();
        System.out.println("----- TreeSetComparador -----");
        System.out.println("Elemento del Comparador" );
        for (String elemento : ejemploCom) {
            System.out.println( elemento );
        }
    } 

    private static void runEjercicio(){
        Set<Contacto> agenda = new TreeSet<>(new utils.ContactoComparador());

        // Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        // Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");

        // System.out.println(c1);
        // System.out.println(c2);

        // System.out.println("Referencia en memoria:");
        // boolean comparacionReference = c1 == c2;
        // System.out.println("c1 == c2: " + comparacionReference);

        // System.out.println("Comparación con equals:");
        // boolean comparacionEquals = c1.equals(c2);
        // System.out.println("c1.equals(c2): " + comparacionEquals);

        // System.out.println("Comparación de hashCode:");
        // boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        // System.out.println("c1.hashCode() == c2.hashCode(): " + comparacionHashCode);

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        
        System.out.println("Contactos en la agenda ordenados:");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        
    }
}
