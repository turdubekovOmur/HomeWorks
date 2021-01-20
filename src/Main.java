import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.userMethod();
        }catch (InputMismatchException err){
            System.out.println("invalid data");
        }

    }
}
