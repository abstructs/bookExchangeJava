/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author 101069860
 */
public class Book {
    private String bookName;
    private String bookYear;
    
    public Book(String bookName, String bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }
}
