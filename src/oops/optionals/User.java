package oops.optionals;

import java.util.Optional;

public class User {
    private final Address address;
    public User(Address address) {
        this.address = address;
    }
    Optional<Address> getAddressOptional() {
        return Optional.ofNullable(address);
    }
}
