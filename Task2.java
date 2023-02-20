import java.util.ArrayList;

/*
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */

public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(34);
        numbers.add(23);
        numbers.add(12);
        numbers.add(7);
        numbers.add(4);
        numbers.add(8);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println(numbers);
    }
    
}
