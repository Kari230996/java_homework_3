import java.util.ArrayList;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList. Найти минимальное,
 *  максимальное и среднее арифметичское этого списка.
 */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            arrayList.add(rnd.nextInt(0, 11));
        }
        System.out.println(arrayList);

        for(int i = 0; i < arrayList.size(); ++i){
            maxValue = Math.max(maxValue, arrayList.get(i));  
            minValue = Math.min(minValue, arrayList.get(i));
        }

        System.out.println("The maximum element of array is: " + maxValue );
        System.out.println("The minimum element of array is: " + minValue );
        System.out.printf("The average number of array is: %s", sumArray(arrayList)/arrayList.size());
      
    }

    private static int sumArray (ArrayList<Integer> arrayList) {
        int sum = 0;

        for (Integer a : arrayList) {
            sum = sum + arrayList.get(a);
        }
        return sum;

    }
}
