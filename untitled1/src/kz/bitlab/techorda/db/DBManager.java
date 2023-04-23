package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Book> books = new ArrayList<>();

    private static int id = 6;

    static {
        books.add(
                new Book(1,
                        "Pass Cisco Exams",
                        "23/04/2023",
                        "NO",
                        2,
                        "CCNA exam, course feedback"
                )
        );
        books.add(
                new Book(2,
                        "Watch video lessons",
                        "23/04/2023",
                        "NO",
                        1,
                        "Java script lessons in YouTube"
                )
        );
        books.add(
                new Book(3,
                        "Finish Coursera IBO",
                        "23/04/2023",
                        "NO",
                        2,
                        "Upload certificates "
                )
        );
        books.add(
                new Book(4,
                        "WEB",
                        "23/04/2023",
                        "NO",
                        5,
                        "WEB-site on React"
                )
        );
        books.add(
                new Book(5,
                        "Do english home work",
                        "23/04/2023",
                        "NO",
                        1,
                        "Ex 1.3.5.6 p 150-151"
                )
        );
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        book.setId(id);
        books.add(book);
        id++;
    }

    public static Book getBook(int id) {
        return books
                .stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void updateBook(Book kitap) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == kitap.getId()) {
                books.set(i, kitap);
                break;
            }
        }
    }

    public static void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId()==id){
                books.remove(i);
                break;
            }
        }
    }
}
