import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        int[] myArray = {2, 4, 6, 7, 9, 15, 333, 665};
        int[] numbers = {6, 12, 55, 789, 1234, 3333};

        task1.enterNumberGreaterThanSeven();
        System.out.println("Task 1 completed, proceed to Task 2");

        task2.findVyacheslavAmongOthers();
        System.out.println("Task 2 completed, proceed to Task 3");

        task3.findIntegerDividedIntoThree(myArray);

        System.out.println("The second method to find integers we're looking for:");

        task3.findIntegerDividedIntoThree2(numbers);

        System.out.println("Also we can use streams if we need to, but first need to convert array into List: ");
        List<Integer> numbers1 = Arrays.asList(3, 5, 9, 12, 16);
        numbers1.stream().filter(number -> number % 3 == 0).forEach(System.out::println);




    }

}
