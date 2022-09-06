public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;
    Person person;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректно указан возраст");
        } else this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || surname == null)
            throw new IllegalStateException("Не хватает обязательных полей");
        if (age > 0) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        person.setAddress(city);
        return person;
    }
}






