package app.main;

import app.dao.BookDao;
import app.dao.BookDaoImpl;
import app.model.Book;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("123456789", "Wilk z Wall Stree", "Jordan Belfort");

        BookDao bookDao = new BookDaoImpl();
        bookDao.save(book);

        System.out.println("Book saved");

        bookDao.cleanUp();
    }
}