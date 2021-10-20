package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1");
        int i = 0;
        // Часть 1
        while (i<10)
        {
            i++;
            System.out.println(i);
        }
        System.out.println();
        // Часть 2
	    for (int s = 10;s>=1;s--){
            System.out.println(s);
        }
        // Задание №2
        System.out.println();
        System.out.println("Задание №2");
        var friday = 4;
        while (friday< 31){
            System.out.println("Необходимо подготовить отчёт " + friday + " Числа");
            friday=friday+7;
        }

        // Задание №3
        // Не понял как необходимо вычислить первый пролёт кометы,
        // поэтому использовал 1821 в качестве первого пролёта.

        System.out.println();
        System.out.println("Задание №3");
        var year = 2021;
        var lastYear = year - 200;
        do {

            System.out.println("Мы увидим комету в " + lastYear);
            lastYear= lastYear + 79;
        } while (lastYear<2021);
        System.out.println("Мы увидим комету в " + lastYear);

        // Задание №4
        System.out.println();
        System.out.println("Задание №4");
        for ( int k = 1; k<31; k++){
            if (k%3 == 0 && k%5 == 0 ) {
                System.out.println(k + " Ping Pong");
                continue;
            }else if (k%3 == 0){
                System.out.println(k + " Ping");
                continue;
            }
            else if (k%5 == 0){
                System.out.println(k + " Pong");
                continue;
            }
        }

        //Задание №5
        System.out.println();
        System.out.println("Задание №5");
        int q = 0;
        int w = 1;
        int s = 0;
        for (int e=0;e<20;e++)
        {
            if (e % 2 == 0) {
                q = s;
            }
            else {
                w = s;
            }

            s = q + w;
            if (e == 0) // Костыль, идеи не было)))
                System.out.println("0");
            System.out.println(s);
        }
    }
}
