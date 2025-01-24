import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();
        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");

        return miHashSet;

    }
    public Set<String> construirLinkedHashSet() { 
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Pera"); // Elemento duplicado

        return miLinkedHashSet; 
    }
    
    public Set<String> construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");
        return miTreeSet;
    }    
}
