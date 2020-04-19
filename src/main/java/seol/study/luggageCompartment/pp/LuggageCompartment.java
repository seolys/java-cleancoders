package seol.study.luggageCompartment.pp;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Collection을 직접 상속했을때, override하지않은 api가 호출되었을때 오류가 발생할 여지가 있다.
 */
public class LuggageCompartment extends HashSet<String> {
    private int restSpace;

    public LuggageCompartment(int restSpace) {
        this.restSpace = restSpace;
    }

    @Override
    public boolean add(String luggage) {
        if(!canAdd()){
            return false;
        }
        restSpace--;
        return super.add(luggage);
    }

    public boolean canAdd() {
        return this.restSpace > 0;
    }

    public void extract(String luggage) {
        restSpace++;
        this.remove(luggage);
    }

}
