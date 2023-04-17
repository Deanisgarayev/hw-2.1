public class Main {
    // 5
    public static void changeValue1(int value) {
        value = 22;
    }

    // 6
    public static void changeValue2(Integer value) {
        value = 22;
    }

    // 7
    public static void changeValue3(Integer[] value) {
        value = new Integer[]{1, 2};
        for (Integer i = 0; i < value.length; i++) {
        }
    }

    //8
    public static void changeValue4(Integer[] value) {
        value = new Integer[]{99};
        for (Integer i = 0; i < value.length; i++) {
        }
    }

    //9
    public static void changePerson5(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }

    // 10
    public static void changePerson6(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }

    public static void main(String[] args) {

        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }


    public static void task5() {
        System.out.println("Задача 5");
        Integer value = 33;
        changeValue1(value);
        System.out.println(value);
    }

    public static void task6() {
        System.out.println("Задача 6");
        Integer value = 33;
        changeValue2(value);
        System.out.println(value);
    }

    public static void task7() {
        System.out.println("Задача 7");
        Integer[] value = {3, 4};
        for (Integer i = 0; i < value.length; i++) {
            changeValue3(value);
            System.out.println(value[i]);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        Integer[] value = {3, 4};
        for (Integer i = 0; i < value.length; i++) {
            changeValue4(value);
            System.out.println(value[i]);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson5(person);
        System.out.println(person);
    }

    public static void task10() {
        System.out.println("Задача 10");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson6(person);
        System.out.println(person);
    }
}


