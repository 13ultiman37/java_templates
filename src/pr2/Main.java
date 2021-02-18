package pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> humanoid = new ArrayList<>();
        humanoid.add(new Human(14, "Ivan", "Ivanov", LocalDate.of(2007, 12, 2), 40));
        humanoid.add(new Human(56, "Anna", "Pupkina", LocalDate.of(1965, 10, 25), 73));
        humanoid.add(new Human(20, "Vasya", "Vasin", LocalDate.of(2001, 2, 15), 54));
        humanoid.add(new Human(24, "Alex", "Obama", LocalDate.of(1997, 5, 7), 90));
        humanoid.add(new Human(87, "Nikolay", "Bazhenov", LocalDate.of(1945, 6, 8), 78));

        System.out.println("\n--------------------------------------------- сортровка вес + возраст ----------------------------------------------\n");
        Stream<Human> sortStream = humanoid.stream();
        sortStream.sorted(new First_compare()).forEach(System.out::println);
        System.out.println("\n--------------------------------------------------- вес кратно 5 ---------------------------------------------------\n");
        Stream<Human> filterStream = humanoid.stream();
        filterStream.filter(x -> x.getWeight()%5==0).forEach(System.out::println);
        System.out.println("\n---------------------------------------------------- первые 4 ------------------------------------------------------\n");
        Stream<Human> firstFour = humanoid.stream();
        firstFour.limit(4).forEach(System.out::println);
        System.out.println("\n---------------------------------------- конкатенация имён через пробел --------------------------------------------\n");
        Stream<Human> names = humanoid.stream();
        names.forEach(x -> System.out.print(x.getFirstName()+" "));
    }

}
