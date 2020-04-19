package seol.study.luggageCompartment.oop;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection을 private변수로 숨기고, public한 method로만 제어할 수 있도록 하여 다른메소드 호출을 차단한다.
 */
public class LuggageCompartment {
    private Set<String> luggageSet = new HashSet<String>();
    private int restSpace;

    public LuggageCompartment(int restSpace) {
        this.restSpace = restSpace;
    }

    public boolean add(String luggage) {
        if(!canAdd()){
            return false;
        }
        restSpace--;
        return luggageSet.add(luggage);
    }

    public boolean canAdd() {
        return this.restSpace > 0;
    }

    public void extract(String luggage) {
        restSpace++;
        luggageSet.remove(luggage);
    }

    public int size() {
        return luggageSet.size();
    }

}
