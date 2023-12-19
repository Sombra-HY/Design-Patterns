package Creational.Builder;

class UserBuilder implements IUserBuilder {
    private User user;

    public UserBuilder() {
        this.resetUser();
    }

    private void resetUser() {
        user = new User();
    }

    public UserBuilder name(String name) {
        user.name = name;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        user.lastName = lastName;
        return this;
    }

    public UserBuilder number(String number) {
        user.number = number;
        return this;
    }

    public UserBuilder age(int age) {
        user.age = age;
        return this;
    }

    public UserBuilder photeNumber(int photeNumber) {
        user.photeNumber = photeNumber;
        return this;
    }

    public UserBuilder adress(String adress) {
        user.adress.add(adress);
        return this;
    }
}
