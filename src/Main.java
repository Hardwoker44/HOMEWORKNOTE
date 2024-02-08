import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Домашняя работа №6");
        System.out.println("Задание 1");
        for (int i2 = 1; i2 <= 10; i2++){
            System.out.println(i2);
        }
        System.out.println("Задание 2");
        for (int i2 = 10; i2 >= 1; i2--){
            System.out.println(i2);
        }
        System.out.println("Задание 3");
        for (int i2 = 0; i2 <= 17; i2 = i2 + 2){
            System.out.println(i2);
        }
        System.out.println("Задание 4");
        for (int i2 = 10; i2 >= -10; i2--){
            System.out.println(i2);
        }
        System.out.println("Задание 5");
        for (int i2 = 1904; i2 <= 2096; i2 = i2 + 4){
            System.out.println(i2);
        }
        System.out.println("Задание 6");
        for (int i2 = 7; i2 <= 98; i2 = i2 + 7){
            System.out.println(i2);
        }
        System.out.println("Задание 7");
        for (int i2 = 1; i2 <= 512; i2 = i2 * 2){
            System.out.println(i2);
        }
        System.out.println("Задание 8");
        short money = 29000;
        int total = 0;
        for (int i2 = 1; i2 <= 12; i2++){
            total = total + money;
            System.out.println("Месяц " + i2 + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задание 9");
        int total1 = 0;
        for (int i2 = 1; i2 <= 12; i2++){
            total1 = total1 + total1/100;
            total1 = total1 + money;
            System.out.println("Месяц " + i2 + ", сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println("Задание 10");
        byte two1 = 2;
        int total2;
        for (int i2 = 1; i2 <= 10; i2++){
            total2 = two1 * i2;
            System.out.println(two1 + " *  " + i2 + " = " + total2);
        }
        System.out.println("Домашняя работа №7");
        System.out.println("Задание 1");
        /* В задаче 1 в пункте критерии проверки написано вывести в консоль сумму накопления
        за каждый месяц с учетом % по вкладу но процент по вкладу не указан в условии. Сделал доп дубликат с условием 12% годовых.
        */
        int month = 0;
        int allMoney = 0;
        int savedMoney = 15000;
        while (allMoney < 2_459_000){
            allMoney = allMoney + savedMoney;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + allMoney + " рублей.");
        }
        int month1 = 0;
        int allMoney1 = 0;
        while (allMoney1 < 2_459_000){
            allMoney1 = allMoney1 + allMoney1/100;
            allMoney1 = allMoney1 + savedMoney;
            month1++;
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + allMoney1 + " рублей.");
        }
        System.out.println("Задание 2");
        int i2 = 0;
        while (i2 < 10){
            i2++;
            System.out.print(i2 + " ");
        }
        System.out.println();
        for (int i3 = 10;i3 >= 0; i3--){
            System.out.print(i3 + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int populationNow = 12000000;
        int birthrate = 17;
        int mortality = 8;
        int perNumberOfPeople = 1000;
        int differenceYear = populationNow * (birthrate - mortality) / perNumberOfPeople;
        int year1 = 0;
        while (year1 < 10){
            populationNow = populationNow + differenceYear;
            year1++;
            System.out.println("Год " + year1 + " , численность населения составляет " + populationNow);
        }
        System.out.println("Задание 4");
        int month2 = 0;
        int allMoney2 = 0;
        while (allMoney2 < 12_000_000){
            month2++;
            allMoney2 = allMoney2 + allMoney2*7/100;
            allMoney2 = allMoney2 + savedMoney;
            System.out.println("Месяц " + month2 + " сумма накопления с условием процента равна " + allMoney2);
        }
        System.out.println("Задание 5");
        int month3 = 0;
        int allMoney3 = 0;
        while (allMoney3 < 12_000_000){
            month3++;
            allMoney3 = allMoney3 + allMoney3*7/100;
            allMoney3 = allMoney3 + savedMoney;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накопления с условием процента равна " + allMoney3);
            }
        }
        System.out.println("Задание 6");
        int monthInYear = 12;
        int allYear = 9;
        int allMonth = allYear * monthInYear;
        int month4 = 0;
        int allMoney4 = 0;
        while (month4 <= allMonth){
            month4++;
            allMoney4 = allMoney4 + allMoney4*7/100;
            allMoney4 = allMoney4 + savedMoney;
            if (month4 % 6 == 0){
                System.out.println("Всего месяцев " + allMonth + " на момент " + month4 + " месяцев накопления состовляют " + allMoney4);
            }

        }
        System.out.println("Задание 7");
        int firstFriday = 5;
        int week = 7;
        for (int day1 = 0;day1 <= 31;day1++){
            if (day1 % week == firstFriday){
                System.out.println("Сегодня пятница, " + day1 + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Задание 8");
        int pastYears = 200;
        int futureYears = 100;
        int nowYear = 2024;
        int beginningOfPeriod = nowYear - pastYears;
        int endOfPeriod = nowYear + futureYears;
        for (int year0 = 0;year0 <= endOfPeriod;year0 = year0 + 79){
            if (year0 >= beginningOfPeriod){
                System.out.println(year0);
            }
        }
        System.out.println("Домашняя работа №8");
        System.out.println("Задание 1 - 2");
        int [] massive = new int [3];
        for (int i = 0; i < massive.length;i++){
            massive[i] = i + 1;
        }
        System.out.println(Arrays.toString(massive));
        float [] massive1 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(massive1));
        int [] massive2 = new int [18];
        for (int i = 0; i < massive2.length;i++){
            massive2[i] = i + 1;
        }
        System.out.println(Arrays.toString(massive2));
        System.out.println("Задание 3");
        int [] massive3 = new int [3];
        for (int i = 0; i < massive3.length;i++){
            massive3[i] = i + 1;
        }
        for (int i = massive3.length - 1; i >= 0;i--){
            if (i != 0){
                System.out.print(massive3[i] + ", ");
            }else System.out.println( massive3[i] );
        }
        float [] massive4 = {1.57f, 7.654f, 9.986f};
        for (int i = massive4.length - 1; i >= 0;i--){
            if (i != 0){
                System.out.print(massive4[i] + ", ");
            }else System.out.println( massive4[i] );
        }
        int [] massive5 = new int [18];
        for (int i = 0; i < massive5.length;i++){
            massive5[i] = i + 1;
        }
        for (int i = massive5.length - 1; i >= 0;i--){
            if (i != 0){
                System.out.print(massive5[i] + ", ");
            }else System.out.println( massive5[i] );
        }
        System.out.println("Задание 4");
        int [] massive6 = new int [12];
        byte b=0;
        for (int i = 0; i < massive6.length ;i++){
            massive6[i] = b + 1;
            b++;
            if (massive6[i] % 2 ==0 && massive6[i] != massive6.length ){
                System.out.print(massive6[i] + ", ");}
            else if (massive6[i] % 2 ==0 && massive6[i] == massive6.length) {
                System.out.print(massive6[i]);}
        }
        System.out.println();
        System.out.println( "Домашняя работа № 9" );
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println( "Задание 1" );
        {int[] arr = generateRandomArray();
        int sum = 0;
        for ( int element : arr){
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");}
        System.out.println( "Задание 2" );
        {int[] arr = generateRandomArray();
        int maxMoney = -1;
        int minMoney = 250000;
        for (final int money : arr){
            if (money > maxMoney){
                maxMoney = money;
            }
            if (money < minMoney){
                minMoney = money;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxMoney + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей.");}
        System.out.println( "Задание 3 ");
        {int[] arr = generateRandomArray();
        int sum = 0;
        byte days = 30;
        for ( int element : arr){
            sum = sum + element;
        }
        float mediumMoney = sum / days;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Средняя сумма трат за день составила " + mediumMoney + " рублей.");}
        System.out.println( "Задание 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1 ; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }


    }
}