package Creational.Builder;

class UserDirector {
    private final IUserBuilder User;

    UserDirector(IUserBuilder builder) {
        User = builder;
    }

    public IUserBuilder getUser() {
        return User;
    }
}
