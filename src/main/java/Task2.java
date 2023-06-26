import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    /*
    Составить алгоритм: если введенное имя совпадает с Вячеслав,
    то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     */
    public void findVyacheslavAmongOthers(){
        System.out.println("Введите Ваше имя:");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if (Objects.equals(input, "Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
