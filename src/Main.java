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
        int count = 0;
        for (int element : numbersFibonacci){
            if ( count < numbersFibonacci.length - 1){
                System.out.print(element + ", ");
                count ++;
            } else System.out.println(numbersFibonacci[count]);
        }
        /* 3й способ:
            for (int i = 0; i < numbersFibonacci.length; i++){
            if (i == numbersFibonacci.length - 1){
                System.out.println(numbersFibonacci[i]);
            } else System.out.print(numbersFibonacci[i] + ",");
        }*/
        /* другой способ:
            for (int i = 0; i < numbersFibonacci.length - 1; i++){
            System.out.print(numbersFibonacci[i] + ",");
        }
        System.out.println(numbersFibonacci[numbersFibonacci.length-1]);*/
        System.out.println();

        //Задача № 3
        //распечатать все элементы всех трех массивов, но начинать нужно с последнего элемента.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        // располагаются на одной строчке, а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*

        //int [] three = new int [3];
        three [0] = 1;
        three [1] = 2;
        three [2] = 3;
        for (int i = 2; i > 0; i--){
            System.out.print(three[i] + ",");
        }
        System.out.println(three[0] + " ");

        //float [] distance = {1.57F, 7.654F, 9.986F};
        for (int i = 2; i > 0; i--){
            System.out.print(distance[i] + ",");
        }
        System.out.println(distance[0] + " ");
        //int [] numbersFibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = numbersFibonacci.length - 1; i > 0; i--){
            System.out.print(numbersFibonacci[i] + ",");
        }
        System.out.println(numbersFibonacci[0]);

        //Задача № 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        // (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам
        // нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.

        //int [] three = new int [3];
        System.out.println();
        three [0] = 1;
        three [1] = 2;
        three [2] = 3;

        for (int i = 0; i < three.length; i++){
            if (three[i] % 2 != 0) {
                three[i] = three[i] + 1;
            }
            if (i < three.length - 1) {
                System.out.print(three[i] + ",");
            }
        }
        System.out.println(three[three.length - 1] + " ");
    }
}