
import java.util.Scanner;

public class User {
    private Scanner sc;

    public User() {
        sc= new Scanner(System.in);
    }

    public Values getValues(){
        System.out.println("Вберите значание: \n 1. Камень \n 2. Ножницы \n 3." +
                " Бумага \n 4. Ящереца \n 5. Спок");

        int userChoice = sc.nextInt();
        return switch (userChoice) {
            case 1 -> Values.ROCK;
            case 2 -> Values.SCISSORS;
            case 3 -> Values.PAPER;
            case 4 -> Values.LIZARD;
            case 5 -> Values.SPOK;
            default -> getValues();
        };
    }

}