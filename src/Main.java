import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startPlay();
    }
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    Scanner sc = new Scanner(System.in);

    public Main() {
       user = new User();
       computer = new Computer();
       userScore = 0;
       computerScore = 0;
       numberOfGames = 0;
    }

    public void startPlay(){
        System.out.println("Начало игры!");
        Values userValues = user.getValues();
        Values computerValues = computer.getValues();
        System.out.println("Ход игрока: " + userValues);
        System.out.println("Ход копьютера: " + computerValues);

        int compareValues = userValues.compareValues(computerValues);
        switch (compareValues) {
            case 0 -> System.out.println("Ничья!");
            case 1 -> {
                System.out.println("+1 к игроку!");
                userScore++;
            }
            case -1 -> {
                System.out.println("+1 к компу!");
                computerScore++;
            }
        }
        numberOfGames++;
        System.out.println("Хотите сыграть еще y/n?");
        String userAnswer = sc.next();
        if (userAnswer.equals("y")){
            startPlay();
        }else if (userAnswer.equals("n")){
            result();
        }else{
            System.out.println("Не верный ввод данных!");
        }
    }

    private void result(){
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        // Вывод заголовков таблицы
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "ПОБЕДА", "ПОРАЖЕНИЕ", "НИЧЬЯ", "ВСЕГО ИГР", "ПРОЦЕНТ ПОБЕД");

        // Вывод линии
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        // Вывод значений
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        // Вывод линии
        System.out.print("+");
        printDashes(68);
        System.out.println("+");



    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}
