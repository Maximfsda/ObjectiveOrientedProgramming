package OopEightMultiple.Product;

import java.util.HashSet;
import java.util.Set;

public class ReceptsList {
    private final Set<Recepts> recepts = new HashSet<>();

    public void addRecepts(Recepts recept){
        if(recepts.contains(recepts)){
            throw new IllegalArgumentException("Такой рецепт существует!");
        }
        else {
            recepts.add(recept);
        }
    }
}
