public class Main {
    public static void main(String[] args) {

      /* Задание 1. */
        int age = 17;

        if (age < 18) {
            System.out.println("Если возраст человека равен" + " " + age + ", то он не достиг совершеннолетия, нужно немного подождать" );
        }
        else {System.out.println("Если возраст человека равен" + " " + age + ", то он совершеннолетний" );
        }

        /* Задание 2. */
       int degree = 5;

       if (degree >= 5) {
            System.out.println("На улице" + " " + degree + " " + "градусов, можно идти без шапки");
        }
       else {
            System.out.println("На улице" + " " + degree + " " + "градусов, нужно надеть шапку");
        }

        /* Задание 3. */
       int speed = 45;

       if (speed >= 60) {
            System.out.println("Если скорость" + " " + speed + ", то придется заплатить штраф");
        }
       else {
            System.out.println("Если скорость" + " " + speed + ", то можно ездить спокойно");
        }

        /* Задание 4. */
        int agePerson = 17;

        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен" + " " + agePerson + ", то ему нужно ходить в детский сад" );
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен" + " " + agePerson + ", то ему нужно ходить в школу" );
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен" + " " + agePerson + ", то ему нужно ходить в университет" );
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен" + " " + agePerson + ", то ему нужно ходить на работу" );
        }

        /* Задание 5. */
       int ageChild = 15;

       if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild + ", то ему нельзя кататься на аттракционе" );
        }
       if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild + ", то ему можно кататься на аттракционе в сопровождении" );
        }
       if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого" );
        }

        /* Задание 6. */
       int carCapacity = 101;

       if (carCapacity < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
       else if (carCapacity >= 60 && carCapacity <= 102) {
            System.out.println("В вагоне есть только стоячие места");
        }
       else {System.out.println("Вагон уже полностью забит");
        }

        /* Задание 7. */
        int one = 50;
        int two = 100;
        int three = 24;

        if (one > two && one > three) {
            System.out.println("One больше чем two и three");
        }
        else if (two > one && two > three) {
            System.out.println("Two больше чем one и three");
        }
        else if (three > one && three > two) {
            System.out.println("Three больше чем one и two");
        }








        }
    }
