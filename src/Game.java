import java.util.Random;
import java.util.Scanner;

public class Game {
    private int usersScore;
    private int computersScore;
    private int draw;
    private int gameCount;

    public void userMethod(){
        Scanner sc = new Scanner(System.in);
        while ((usersScore != 1 | computersScore == 1) || draw != 1 ) {
            System.out.printf("Вбирете значение: \n 1. %s \n 2. %s \n 3. %s \n 4. %s \n 5. %s \n",
                    Values.ROCK, Values.PAPER , Values.SCISSORS, Values.LIZARD, Values.SPOK);

            int userChoice = sc.nextInt();
            getRandomValue();
            if ((userChoice == 1) && (getRandomValue().equals(Values.PAPER) ||
                    getRandomValue().equals(Values.LIZARD))){
                computersScore +=1;
            }
            else if((userChoice == 2) && (getRandomValue().equals(Values.ROCK)
            || getRandomValue().equals(Values.SPOK))){
                usersScore+=1;
            }
            else if((userChoice == 3) && (getRandomValue().equals(Values.PAPER)||
                    getRandomValue().equals(Values.LIZARD))){
                computersScore+=1;
            }
            else if (userChoice == 1 && getRandomValue().equals(Values.SCISSORS)){
                usersScore+=1;
            }
            else if (userChoice == 2 && getRandomValue().equals(Values.SCISSORS)){
                computersScore+=1;
            }
            else if (userChoice == 3 && getRandomValue().equals(Values.PAPER)){
                usersScore+=1;
            }
            else if (userChoice == 4 && (getRandomValue().equals(Values.SPOK)
                    || getRandomValue().equals(Values.PAPER))){
                usersScore+=1;
            }
            else if (userChoice == 5 && (getRandomValue().equals(Values.SCISSORS) ||
                    getRandomValue().equals(Values.ROCK))){
                usersScore+=1;
            }
            else{
                draw+=1;
            }
            gameCount+=1;
        }
        sc.close();
        System.out.println("*** Result ***");
        System.out.printf(" Очки пользователя: %d \n Очки компьютера: %d \n Ничья: %d \n всего игр: %d \n",
                usersScore, computersScore, draw, gameCount);
        System.out.println("*** *** ***");

    }

    private Values getRandomValue() {
        int random = (int) (Math.random() * Values.values().length);
        return Values.values()[random];
    }
}