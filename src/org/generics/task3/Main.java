package org.generics.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<Person> people = generateClient();
        Queue<Person> attr = new LinkedList<>(people);

        while (!attr.isEmpty()) {
            Person person = attr.poll();

            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);

            System.out.printf("\n%s %s прокатился на аттракционе, у него осталось %d билетов.", person.getName(), person.getSureName(), quantityTickets);

            if (quantityTickets > 0) {
                attr.offer(person);
            }
        }
    }

    private static List<Person> generateClient() {
        return List.of(
                new Person("Denis", "Fedorenko ", 4),
                new Person("Vadim", "Momot ", 2),
                new Person("Alexander", "Bredkov ", 3),
                new Person("Alexander", "Borodin ", 5),
                new Person("Alexey", "Bordokov ", 2)
        );
    }
}
