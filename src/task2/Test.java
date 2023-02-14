package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
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

        //Task 2.1
        /*Отсортируйте стрим по алфавиту имен.
        Получите из стрима коллекцию всех пользователей, имена, которых не
        содержат чисел, выведете содержимое коллекции в консоль.*/

          Stream<User> sorted = userStream.sorted(Comparator.comparing(User::getName)).filter(user ->
                                  user.getName().chars().allMatch(Character::isLetter));

        sorted.forEach(System.out::println);
        userStream = users.stream();

        //Task 2.2
        /*С помощью стрима, посчитайте количество юзеров, у которых в именах
        есть числа, и выведете их количество в консоль.*/

       System.out.println("Count name with digits: "+userStream.filter(user -> user.getName().chars().anyMatch(Character::isDigit)).count());
        userStream = users.stream();
        //Task 2.3

       /* Получите из стрима, содержащего всех юзеров, коллекцию Map.
        Ключами должны быть имена, а значениями возраст.*/
        Map<String, Integer> collect = userStream.collect(Collectors.toMap(User::getName, User::getAge));
        System.out.println(collect);


    }
}
