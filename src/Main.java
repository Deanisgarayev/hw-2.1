public class Main {
    // 5
//    public static void changeValue(int value) {
//        value = 22;
//        System.out.println(value);
//    }
//    public static void main(String[] args) {
//        int value = 33;
//        changeValue(value);
//        System.out.println(value);
//        //result 22/33
//    }
//}
// 6
//        public static void changeValue( Integer value) {
//        value = 22;
//        System.out.println(value);
//    }
//    public static void main(String[] args) {
//        Integer value = 33;
//        changeValue(value);
//        System.out.println(value);
//        //result 22/33
//    }
//}
//7
    //        public static void changeValue (Integer[] value) {
//            value = new Integer[]{1, 2};
//            for (Integer i = 0; i < value.length; i++) {
//                System.out.println(value[i]);
//            }
//        }
//    public static void main(String[] args) {
//        Integer[] value = {3, 4};
//        for (Integer i = 0; i < value.length; i++) {
//            changeValue(value);
//            System.out.println(value[i]);
//            //result 1 2 3 1 2 4
//        }
//    }
//}
    // 8
//       public static void changeValue (Integer[] value) {
//            value = new Integer[]{99};
//            for (Integer i = 0; i < value.length; i++) {
//                System.out.println(value[i]);
//            }
//        }
//    public static void main(String[] args) {
//        Integer[] value = {3, 4};
//        for (Integer i = 0; i < value.length; i++) {
//            changeValue(value);
//            System.out.println(value[i]);
//            //result 99 3 99 4
//        }
//    }
//}
    // 9
//    public static void changePerson(Person person) {
//        person = new Person(" Ilya", "Lagutenko.");
//        System.out.println(person);
//    }
//    public static void main(String[] args) {
//        Person person = new Person("Lyapis", "Trubetskoy");
//        changePerson(person);
//        System.out.println(person);
//        //result Person{firstname=' Ilya', surname='Lagutenko'}
//        //Person{firstname='Lyapis', surname='Trubetskoy'}
//    }
//}
// 10
    public static void changePerson(Person person) {
        person = new Person(" Ilya", "Lagutenko.");
        System.out.println(person);
    }
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        //result Person{firstname=' Ilya', surname='Lagutenko'}
        //Person{firstname='Lyapis', surname='Trubetskoy'}
    }
}

