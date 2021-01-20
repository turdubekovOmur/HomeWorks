import java.util.Random;
import java.util.Scanner;

public class Game {
    private int usersScore;
    private int computersScore;
    private int draw;

    public void userMethod(){
        Scanner sc = new Scanner(System.in);
        while (usersScore != 3 & computersScore != 3) {
            System.out.printf("Вбирете значение: \n 1. %s \n 2. %s \n 3. %s \n",
                    Values.ROCK, Values.PAPER , Values.SCISSORS);

            int userChoice = sc.nextInt();
            getRandomValue();
            if (userChoice == 1 && getRandomValue().equals(Values.PAPER)){
                System.out.printf("  user = %s \n computer = %s \n", Values.ROCK, Values.PAPER);
                computersScore +=1;
            }
            else if(userChoice == 2 && getRandomValue().equals(Values.ROCK)){
                System.out.printf("  user = %s \n computer = %s \n", Values.PAPER, Values.ROCK);
                usersScore+=1;
            }
            else if(userChoice == 3 && getRandomValue().equals(Values.ROCK)){
                System.out.printf("  user = %s \n computer = %s \n", Values.SCISSORS, Values.ROCK);
                computersScore+=1;
            }
            else if (userChoice == 1 && getRandomValue().equals(Values.SCISSORS)){
                System.out.printf("  user = %s \n computer = %s \n", Values.ROCK, Values.SCISSORS);
                usersScore+=1;
            }
            else if (userChoice == 2 && getRandomValue().equals(Values.SCISSORS)){
                System.out.printf("  user = %s \n computer = %s \n", Values.PAPER, Values.SCISSORS);
                computersScore+=1;
            }
            else if (userChoice == 3 && getRandomValue().equals(Values.PAPER)){
                System.out.printf("  user = %s \n computer = %s \n", Values.SCISSORS, Values.PAPER);
                usersScore+=1;
            }else{
                draw+=1;
            }
        }
        sc.close();
        System.out.println("*** Result ***");
        System.out.printf(" Очки пользователя: %d \n Очки компьютера: %d \n Ничья: %d \n",
                usersScore, computersScore, draw);
        System.out.println("*** *** ***");

    }

    private Values getRandomValue() {
        int random = (int) (Math.random() * Values.values().length);
        return Values.values()[random];
    }
}