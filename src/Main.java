//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия");
        }
// Задача 2

        int temp = 15;
        if (temp <= 20) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

// Задача 3

        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
// Задача 4

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора на работу");
        }

// Задача 5
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на атракционе.");
        }
        else if (childAge > 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то, он может кататься без сопровождения.");
        }

// Задача 6
        int people = 80;
        int totalplace = 102;
        int seatplace = 60;
        int standplace = ((byte)totalplace - seatplace);
        int freePlace = totalplace - people;


        if (people > 102) {
            System.out.println("К сожалению вагон уже полностью забит");
        }
        else if (people <= 60) {
            seatplace = seatplace - people;
            System.out.println("В вагоне осталось " + seatplace + " сидячих мест и " + standplace + " стоящих мест");
        }
        else if (people > 60) {
            standplace = ((byte)standplace - people);
            System.out.println("К сожалению в вагоне не осталось сидящих мест, но осталось стоящих " + freePlace + " мест");
        }

//Задача 7

        int one = 1;
        int two = 2;
        int three = 3;

        int max;

        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }
        System.out.println("Наибольшее число: " + max);
        }//
    }
