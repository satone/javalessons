/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.satone.lessons;

/**
 *
 * @author saton
 */
public class Program {

    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
        switch (b1.bookType) {
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Pahntasy");
                break;
            default:
                throw new AssertionError();
        }
        System.out.println(Type.BELLETRE.ordinal());

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));

        Person tom = new Person("Tom");
        System.out.println(tom.toString());
        System.out.println(tom.hashCode());
        System.out.println(tom.getClass());

        //Account<String> acc1 = new Account<String>("2345", 5000);
        Accountable<String> acc1 = new Account("1235asd", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("2345", 5000);
        //Integer acc2Id = acc2.getId();
        System.out.println("acc2Id");
        
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
