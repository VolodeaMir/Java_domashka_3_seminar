// 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» 
// и год издания после 2010 г, включительно.

import java.util.ArrayList;
import java.util.List;

public class home_work_03 {
    public static void main(String[] args) {
        // Создаем список книг
        List<Book> books = new ArrayList<>();
        books.add(new Book("Книга 1", "Иванов", 15.0, 2015, 200));
        books.add(new Book("Книга 2", "Александров", 20.0, 2013, 220));
        books.add(new Book("Книга 3", "Петров", 12.0, 2018, 180));
        books.add(new Book("Книга 4", "Сидорова", 18.0, 2014, 300));
        books.add(new Book("Книга 5", "Абрамов", 25.0, 2011, 223));

        // Находим книги, удовлетворяющие условиям поиска
        List<String> matchingTitles = new ArrayList<>();

        for (Book book : books) {
            if (isPrime(book.getPageCount()) &&
                    book.getAuthorLastName().contains("А") &&
                    book.getYear() >= 2010) {
                matchingTitles.add(book.getTitle());
            }
        }

        // Выводим найденные названия книг
        if (matchingTitles.isEmpty()) {
            System.out.println("Книги, удовлетворяющие условиям поиска, не найдены.");
        } else {
            System.out.println("Названия книг, удовлетворяющих условиям поиска:");
            for (String title : matchingTitles) {
                System.out.println(title);
            }
        }
    }

    // Метод для проверки простого числа
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
