public class Person2 {
    public String name;
    public String surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
