package service;

import models.Book;

import java.util.List;

public interface BookService {
    //Create
    Book saveBook(Long libraryId, Book book);

    //Read
    List<Book> getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    //Update
    String updateBook(Long id,Book book);

    //Delete
    String deleteBook(Long libraryId,Long bookId);
    void clearBooksByLibraryId(Long libraryId);

    //CRUD
    //C- create
    //R- read
    //U- update
    //D- delete

}
