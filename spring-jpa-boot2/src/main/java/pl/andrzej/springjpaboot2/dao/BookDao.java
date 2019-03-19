package pl.andrzej.springjpaboot2.dao;


import pl.andrzej.springjpaboot2.model.Book;

public interface BookDao {
    public void save(Book book);
    public Book get(Long id);
   // public void cleanUp();
}
