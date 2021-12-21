package com.company;

import java.util.Objects;

public class Book {
        private String bookName;
        private Author bookAuthor;
        private int yearPublic;

    public Book(String bookName, Author bookAuthor, int yearPublic) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublic = yearPublic;
    }

            public String getBookName() {
                return bookName;
            }

            public Author getBookAuthor() {
                return bookAuthor;
            }

            public int getYearPublic() {
                return yearPublic;
            }

            public void setYearPublic(int yearPublic) {
                this.yearPublic = yearPublic;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "bookName='" + bookName + '\'' +
                        ", bookAuthor=" + bookAuthor +
                        ", yearPublic=" + yearPublic +
                        '}';
            }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearPublic() == book.getYearPublic() && getBookName().equals(book.getBookName()) && getBookAuthor().equals(book.getBookAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getYearPublic());
    }


}
