import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);


        Integer value2 = 33;
        changeValue2(value2);
        System.out.println(value2);


        Integer[] value3 = {3, 4};
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));


        Integer[] value4 = {3, 4};
        changeValue4(value4);
        System.out.println(Arrays.toString(value4));


        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Before change: " + person);
        changePerson(person);
        System.out.println("After change: " + person);

        Person2 person2 = new Person2("Lyapis", "Trubetskoy");
        System.out.println("Before change: " + person2);
        changePerson2(person2);
        System.out.println("After change: " + person2);
    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue2(Integer value2) {
        value2 = 22;
    }

    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{1, 2};
    }

    public static void changeValue4(Integer[] value4) {
        value4[0] = 99;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person2 person2) {
        person2.name = "Ilya";
        person2.surname = "Lagutenko";
    }

}


// В задаче 5-6  не происходит изменений т.к. используются примитивы как int и происходит вызов копии.
// В задаче 7 так же нет изменений из-за примитива int, но в задаче 8 мы обращаемся напрямую к массиву и меняем его значение.

