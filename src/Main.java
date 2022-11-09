public class Main {
    public static void main(String[] args) {
        //Массивы Часть 1

        //Задача 2:
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        //через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        int [] three = new int [3];
        three [0] = 1;
        three [1] = 2;
        three [2] = 3;
        for (int i = 0; i < 2; i++){
            System.out.print(three[i] + ",");
        }
        System.out.print(three[2] + " ");

        float [] distance = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < 2; i++){
            System.out.print(distance[i] + ",");
        }
        System.out.print(distance[2] + " ");
        int [] numbersFibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < numbersFibonacci.length - 1; i++){
            System.out.print(numbersFibonacci[i] + ",");
        }
        System.out.println(numbersFibonacci[numbersFibonacci.length-1]);
    }
}