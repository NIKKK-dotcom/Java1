import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
    public static void section1() {
        String[] fruits = {"apple", "banana", "dragonfruit"};
//        for (int i=0; i<fruits.length;i++){
//            System.out.println(fruits[i]);
//        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    public static void section2(){
        int[] numbers = {1,2,3,4};
        System.out.println("Массив numbers: " + Arrays.toString(numbers));
        System.out.println();

        int[] numbers2 = {6,1,4,9,5,2};
        System.out.println("Массив numbers2 до сортировки: " + Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println("Массив numbers2 после сортировки: " + Arrays.toString(numbers2));
        System.out.println();

        int searchNumber = 9;
        int index = Arrays.binarySearch(numbers2, searchNumber);
        System.out.println("Бинарным поиском была найдена цифра " + searchNumber + " и она расположена по индексу: " + index);
        System.out.println();

        int[] numbers3 = new int[5];
        System.out.println("Массив numbers3 после создания: " + Arrays.toString(numbers3));
        Arrays.fill(numbers3,7);
        System.out.println("Массив numbers3 после заполнения: " + Arrays.toString(numbers3));
        System.out.println();

        int[] arrays1 = {1,2,3};
        int[] arrays2 = {1,2,3};
        boolean isEquals = Arrays.equals(arrays1,arrays2);
        System.out.println("Равны ли массивы arrays1 и arrays2? - " + isEquals);
        System.out.println();

        int[] copyArray = Arrays.copyOf(arrays1,5);
        System.out.println("Скопированный массив arrays1: " + Arrays.toString(copyArray));
        System.out.println();

        String[] fruits = {"apple", "banana", "dragonfruit"};
        List<String> fruitList = Arrays.asList(fruits); // перевод в список
        System.out.println("Cписок (не массив!) фруктов: " + fruitList);

        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        boolean isEqualsMatrix = Arrays.deepEquals(matrix1, matrix2);
        System.out.println("Равны ли matrix1 и matrxi2? - " + isEqualsMatrix);
    }
    public static void DZZZZ(){
        int[] mas = {1,2,3,4};
        for (int number: mas){
            System.out.print(number);
        }
        for (int i=0;i<mas.length;i++){
            mas[i]=mas[i]*2;
        }
        System.out.println();
        System.out.println(Arrays.toString(mas));
    }
}
