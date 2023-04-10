public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
    }

    public static void task1(){
        int age = 11;

        System.out.println("Task1:");
        if(age >= 18) System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        else System.out.println("Если возраст человека равен " + age + " он не совершеннолетний");
    }

    public static void task2(){
        int temp = 1;

        System.out.println("Task2:");
        if(temp > 5) System.out.println("Сегодня тепло, можно идти без шапки");
        else System.out.println("На улице холодно, нужно надеть шапку!");
    }

    public static void task3(){
        int speed = 87;

        System.out.println("Task3:");
        if(speed > 60) System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
    }

    public static void task4(){
        int age = 21;

        System.out.println("Task4:");
        if(age >= 2 && age <= 6) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        else if(age >= 7 && age <= 18) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        else if(age >= 19 && age <= 24) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        else if(age > 24) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
    }

    public static void task5(){
        int age = 72;

        System.out.println("Task5:");
        if(age <= 5) System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        else if(age > 5 && age <= 14) System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослых");
        else System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе");
    }

    public static void task6(){
        int count = 65;

        System.out.println("Task6:");
        if(count <= 60) System.out.println("Есть сидячие");
        else if(count <= 102) System.out.println("Есть стоячие");
        else System.out.println("Мест нет");
    }

    public static void task7(){
        int one = 21;
        int two = 13;
        int three = 4;

        System.out.println("Task7:");
        if(one > two && one > three) System.out.println(one);
        else if(two > one && two > three) System.out.println(two);
        else System.out.println(three);
    }
}