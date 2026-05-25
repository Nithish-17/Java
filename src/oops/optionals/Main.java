package oops.optionals;

/*
CREATE
------
Optional.of()
Optional.ofNullable()
Optional.empty()

CHECK
------
isPresent() -- checking
ifPresent() -- checking and performing function using lambda
isEmpty()

GET VALUE
---------
orElse() --- the else is always ready if object is present or empty
orElseGet() -- it is basically the else part will only work if optional is empty -- needs lambda
orElseThrow()
get()  -- (avoid this if optional is empty then its error)

TRANSFORM
---------
map()
filter()
flatMap()
*/


import oops.GenericComparasion.Operation;

import java.util.Optional;

public class Main {
    static void main() {
    User user1 = new User(new Address("Covai"));
    User user2 = new User(null);

    Optional<Address> opt1 = user1.getAddressOptional();
    Optional<Address> opt2 = user2.getAddressOptional();

    if(opt1.isPresent())
        System.out.println("user 1 holds the value");
    opt2.ifPresent(System.out::println);
    System.out.println(opt2.isEmpty());

    String city1 = opt1.map(Address::getCity).orElse("Not found");

    try{
        String city2 = opt2.map(Address::getCity).orElseThrow(() -> new RuntimeException("Not found"));
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }

    String city1filtered = opt1.filter((address)->address.getCity().length()>10).map(Address::getCity).orElse("Not found");


    //flatmap
        Optional<String> flatmap = Optional.of(user1).flatMap(User::getAddressOptional).map(Address::getCity);

    }
}
