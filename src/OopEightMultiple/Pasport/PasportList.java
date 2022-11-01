package OopEightMultiple.Pasport;

import java.util.HashSet;
import java.util.Set;

public class PasportList {
    private final Set<Pasport> pasports;

    public PasportList() {
        pasports = new HashSet<>();
    }
    public void  addUpdatePassport(Pasport pasport){
        this.pasports.add(pasport);

    }

    public Pasport finByNumber (int number){
        for (Pasport pasport:pasports
             ) {
            if (pasport.getNumber() == number){
                return pasport;
            }
            
        }
        return null;
    }
}
