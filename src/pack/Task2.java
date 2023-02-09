package pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Jack1", 23));
        users.add(new User("Harry", 31));
        users.add(new User("Charlie12", 18));
        users.add(new User("Thomas", 32));
        users.add(new User("Amelia33", 30));
        users.add(new User("Olivia3", 19));
        users.add(new User("Emily", 18));
        users.add(new User("Sophie", 25));

        Stream<User> userStream = users.stream();

        Stream<User> sorted = userStream.sorted(Comparator.comparing(User::getName));

        sorted.forEach(System.out::println);
    }
}
