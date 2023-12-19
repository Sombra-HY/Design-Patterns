package Creational.Builder;

interface IUserBuilder {
    UserBuilder name(String name);

    UserBuilder lastName(String lastName);

    UserBuilder number(String number);

    UserBuilder age(int age);

    UserBuilder photeNumber(int photeNumber);

    UserBuilder adress(String adress);
}
