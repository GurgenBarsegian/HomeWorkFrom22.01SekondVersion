import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String exitCommand = "exit";
        int var =0;

        while (true) {

            int var1 = random.nextInt(10);
            int var2 = random.nextInt(10);
            int result = var1 + var2;
            System.out.println(var1 + "+" + var2);
            System.out.println("Ваш ответ: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(exitCommand)) {
                break;
            }
            if (Integer.parseInt(userAnswer) == result){
                int answer1 = var = (var + 5);
                System.out.println("Правильный ответ " + result +
                        ". Текущее количество баллов: " + answer1);
            }else {
                int answer1 = var = (var - 5);
                System.out.println("Неправильный ответ. Правильный ответ " + result +
                        ". Текущее количество баллов: " + answer1);
            }

        }
        {
            System.out.println("Ты заработал " + var);
        }
    }
}

