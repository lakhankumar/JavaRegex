package userRegistration;

@FunctionalInterface
interface IUserRegistration {
    String details(String detail) throws InvalidException;
}

