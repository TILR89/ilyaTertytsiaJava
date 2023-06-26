import java.util.Scanner;

public class Task1 {
    /*
    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */

    public void enterNumberGreaterThanSeven(){
        System.out.println("Please enter your number in console:");
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.next());
        if (input>7){
            System.out.println("Hello");
        } else {
            System.out.println("Your number is less than 7, try again later.");
        }

    }
}
