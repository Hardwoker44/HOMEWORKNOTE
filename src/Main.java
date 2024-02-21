import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

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
        task2();

        System.out.println(" Домашняя работа №  11 ");
        System.out.println(" Задание  1 ");
        int  yearNow = LocalDate.now().getYear();
        calculateLeapYear(yearNow);
        System.out.println(" Задание 2 ");
        int mySystem = 1;
        int myYearOfIssue = 2022;
        downloadSuitableSoftware(mySystem,myYearOfIssue);
        System.out.println(" Задание 3 ");
        byte deliveryDistance = 95;
        calculateDaysUsingDeliveryDistance(deliveryDistance);
        int allDays = calculateDaysUsingDeliveryDistance(deliveryDistance);
        if (allDays > 0){
        System.out.println("Потребуется дней: " + allDays);
        } else {
            System.out.println("Доставки нет");
        }
        Author rowling = new Author("Joanne", "Rowling");
        System.out.println("sarah.name = " + rowling.getName());
        System.out.println("sarah.surname = " + rowling.getSurname());
        Author murakami = new Author("Haruki","Murakami");
        Book harryPotter = new Book(rowling,"Harry Potter", 1997);
        System.out.println(harryPotter);
        System.out.println(harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getSurname() + " " + harryPotter.getTitle() + " " + harryPotter.getYearOfPublication());
        harryPotter.setYearOfPublication(1998);
        System.out.println(harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getSurname() + " " + harryPotter.getTitle() + " " + harryPotter.getYearOfPublication());
        Book afterDark = new Book(murakami,"After Dark", 2019);
        System.out.println(afterDark);
        System.out.println(afterDark.getAuthor().getName() + " " + afterDark.getAuthor().getSurname() + " " + afterDark.getTitle() + " " + afterDark.getYearOfPublication());
        afterDark.setYearOfPublication(2021);
        System.out.println(afterDark.getAuthor().getName() + " " + afterDark.getAuthor().getSurname() + " " + afterDark.getTitle() + " " + afterDark.getYearOfPublication());



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
        double sum = 0;
        for ( int element : arr){
            sum = sum + element;
        }
        double mediumMoney = sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Средняя сумма трат за день составила " + mediumMoney + " рублей.");}
        System.out.println( "Задание 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1 ; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
    public static void task2(){
        System.out.println("Домашняя работа №10");
        {
            System.out.println("Задание 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Ф.И.О.сотруднка — " + fullName);
            System.out.println("Задание 2");
            String fullNameTrue = fullName.toUpperCase();
            System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullNameTrue);
        }
        System.out.println("Задание 3");
        {
            String fullName = "Иванов Семён Семёнович";
            String fullNameTrue = fullName.replace("ё","е");
            System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
        }
    }
    public static void calculateLeapYear(int yearNow){
        short startYear = 1584;
        if (yearNow > startYear && yearNow % 4 == 0 && yearNow % 100 != 0 || yearNow > startYear && yearNow % 400 == 0) {
            System.out.println(yearNow + " год является високосным");
        } else {
            System.out.println(yearNow + " год не является високосным");
        }
    }
    public static void downloadSuitableSoftware(int mySystem, int myYearOfIssue){
        byte systemIos = 0;
        byte systemAndroid = 1;
        int maxYearOfIssue = LocalDate.now().getYear();
        if (mySystem == systemIos && myYearOfIssue < maxYearOfIssue){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if (mySystem == systemIos && myYearOfIssue == maxYearOfIssue){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if (mySystem == systemAndroid && myYearOfIssue < maxYearOfIssue){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }else if (mySystem == systemAndroid && myYearOfIssue == maxYearOfIssue){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
    public static int calculateDaysUsingDeliveryDistance(byte deliveryDistance){
        int myDays = 0;
        byte day = 0;
        byte distance1 = 20;
        byte distance2 = 60;
        byte distance3 = 100;
        if (deliveryDistance <= distance1){
            myDays = day + 1;
        } else if (deliveryDistance >= distance1 && deliveryDistance <= distance2){
            myDays = day + 2;
        } else if (deliveryDistance >= distance2 && deliveryDistance <= distance3){
            myDays = day + 3;
        } else if (deliveryDistance > distance3){
            myDays = day;
        }
        return myDays;
    }

}
