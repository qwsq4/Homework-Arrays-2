public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }

        //Задание 1
        System.out.println("  Задание 1");
        float arrMounth = 0;
        for (int i = 0; i < 30; i++) {
            arrMounth = arrMounth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrMounth + " рублей");

        //Задание 2
        System.out.println("  Задание 2");
        int arrMax = 0;
        int arrMin = 300000;
        for (int i = 0; i < 30; i++){
            if (arrMax < arr[i]){
                arrMax = arr[i];
            }
        }
        for (int i = 0; i < 30; i++){
            if (arrMin > arr[i]){
                arrMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + arrMin + " рублей, а максимальная " + arrMax + " рублей");

        //Задание 3
        System.out.println("  Задание 3");
        float arrAverage = arrMounth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", arrAverage) + " рублей");

        //Задание 4
        System.out.println("  Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}