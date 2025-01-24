import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        runHashSet(); 
        runLinkedHashSet();
        runTreeSet();
    }

    private static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();

        System.out.println("--------HashSet-------");
        System.out.println("Elementos del HashSet (No se garantiza orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();

        System.out.println("\n--------LinkedHashSet-------");
        System.out.println("Elementos del LinkedHashSet (Respeta orden de insercion):");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();

        System.out.println("\n--------TreeSet-------");
        System.out.println("Elementos del TreeSet (Orden alfabetico):");
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }
}