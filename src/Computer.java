import java.util.Random;

public class Computer {

    public Values getValues(){
        Values[] values = Values.values();
        Random rnd = new Random();
        int index = rnd.nextInt(values.length);
        return values[index];
    }
}
