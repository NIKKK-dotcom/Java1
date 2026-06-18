import javax.xml.transform.Source;

public class Lesson5 {
    public static void section1(){
//               indexes:    0   1   2   3   4
        int[] numberArray = {10, 20, 30, 40, 50};
        System.out.println(numberArray[2]);

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Элемент " + i + ": " + numberArray[i]);
        }

        float[] numberArray2={1.1f,1.2f,1.3f,1.4f};
        for(int i=0; i<numberArray2.length;i++){
            System.out.println("Элемент " + i + ": " + numberArray2[i]);
        }

    }
    public static void section2() {
        // Первый способ созания массива - сразу заполнить его данными
        int[] numbers = {1, 2, 3, 4, 5};

        // Второй способ - создать пустой масси, но с указанием количества мест там.
        // int по умолчанию заполняется нулями
        // boolean по умолчанию записывается false-ами
        // Все оставшиеся объекты по умолчанию - null
        int[] numbers2 = new int[10];

        System.out.println("Массив numbers:");
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        System.out.println();

        System.out.println("Массив numbers2:");
        for (int i=0; i<numbers2.length;i++){
            System.out.println(numbers2[i]);
        }


    }
    public static void section3() {
        /// Создаем матрицу
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /// Вот так поулчаем из матрицы значение
        int value = matrix[0][1];
        System.out.println(value);

        /// Вот так перебираем всю матрицу
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.print(matrix[y][x] + "\t");
            }
            System.out.println();
        }

    }
    public static void section4(){
        int[][] l= {
                {4,4,4,4},
                {5,5,5,5,5,5,5,5},
                {1},
        };

        for (int y = 0; y < l.length; y++){
            for (int x = 0; x < l[y].length; x++){
                System.out.print(l[y][x]);
            }
            System.out.println();
        }
    }
    public static void section5() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Изначальный массив numbers: [");
        for (int i=0; i< numbers.length;i++){
            System.out.print(numbers[i] + "\t");
        }
        System.out.print("]");
        System.out.println();

        int value=numbers[0];
        System.out.println("Первое значение из массива numbers: " + value);

        System.out.print("Массив numbers после изменения первого элемента: [");
        numbers[0] = 3;
        for (int i=0; i< numbers.length;i++){
            System.out.print(numbers[i] + "\t");
        }
        System.out.print("]");
        System.out.println();

        int len = numbers.length;
        System.out.println("Длина массива numbers: " + len);
    }
}
