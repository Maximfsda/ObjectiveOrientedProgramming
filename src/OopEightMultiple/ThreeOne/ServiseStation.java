package OopEightMultiple.ThreeOne;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiseStation {

    public final Queue<Trasnsport> trasnsports = new ArrayDeque<>();

    private void add(Trasnsport trasnsport){
        trasnsports.offer(trasnsport);
    }

    public void addCarr(Car car){
        add(car);
    }
    public void addTruck(Truks truks){
        add(truks);
    }

    public void servise(){
        if(!trasnsports.isEmpty()){
            Trasnsport trasnsport = trasnsports.poll();
            boolean result =trasnsport.servise();
            if(!result){
                trasnsport.repair();
            }
        }

    }
}
