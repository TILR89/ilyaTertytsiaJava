public class Task3 {
    /*
    Составить алгоритм: на входе есть числовой массив,
    необходимо вывести элементы массива кратные 3
     */


    public void findIntegerDividedIntoThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void findIntegerDividedIntoThree2(int[] array) {
        for (int number : array) {
            if (number % 3 == 0) {
                System.out.println(number);
            }

        }
    }


}




